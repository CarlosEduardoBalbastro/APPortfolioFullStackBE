package com.miPortfolio.portfolioFullStack.security.controller;

import com.miPortfolio.portfolioFullStack.security.dto.JwtDto;
import com.miPortfolio.portfolioFullStack.security.dto.LoginUsuario;
import com.miPortfolio.portfolioFullStack.security.dto.NewUsuario;
import com.miPortfolio.portfolioFullStack.security.entity.Rol;
import com.miPortfolio.portfolioFullStack.security.entity.Usuario;
import com.miPortfolio.portfolioFullStack.security.enums.RolName;
import com.miPortfolio.portfolioFullStack.security.jwt.JwtProvider;
import com.miPortfolio.portfolioFullStack.security.service.RolService;
import com.miPortfolio.portfolioFullStack.security.service.UsuarioService;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@RestController
@RequestMapping("/auth")
public class AuthorizationControler {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    RolService rolService;

    @Autowired
    JwtProvider jwtProvider;

    //metodo para crear ususario
    //tenia anotatio @Valid al principio pero no encontre la libreria asi que borre
    
    @PostMapping ("/nuevo")
    public ResponseEntity<?> nuevo(@RequestBody NewUsuario nuevoUsuario, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return new ResponseEntity(new Message("Campos u Email erroneos"), HttpStatus.BAD_REQUEST);
        }

        if (usuarioService.existsByNomberUsuario(nuevoUsuario.getNombreUsuario())) {
            return new ResponseEntity(new Message("Ese nombre de usuario ya existe"), HttpStatus.BAD_REQUEST);
        }

        if (usuarioService.existsByEmail(nuevoUsuario.getEmail())) {
            return new ResponseEntity(new Message("Ese email ya existe"), HttpStatus.BAD_REQUEST);
        }

        Usuario usuario = new Usuario(nuevoUsuario.getNombre(), nuevoUsuario.getNombreUsuario(), nuevoUsuario.getEmail(), passwordEncoder.encode(nuevoUsuario.getPassword()));

        Set<Rol> roles = new HashSet<>();
        roles.add(rolService.getByRolNombre(RolName.ROLE_USER).get());

        if (nuevoUsuario.getRoles().contains("admin")) {
            roles.add(rolService.getByRolNombre(RolName.ROLE_USER).get());
        }

       usuario.setRoles(roles);
       
       //Me da error en el parametro por eso comente para poder continuar
       usuarioService.save(usuario);
       

        return new ResponseEntity(new Message("Usuario guardado"), HttpStatus.CREATED);

    }

    //tenia anotatio @Valid al principio pero no encontre la libreria asi que borre
    @PostMapping("/login")
    public ResponseEntity<JwtDto> login(@Validated @RequestBody LoginUsuario loginUsuario, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity(new Message("Campos mal puestos"), HttpStatus.BAD_REQUEST);
        }

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUsuario.getNombreUsuario(), loginUsuario.getPassword()));

         SecurityContextHolder.getContext().setAuthentication(authentication);
         
         String jwt = jwtProvider.generateToken(authentication);
         
         UserDetails userDetails = (UserDetails) authentication.getPrincipal();
         
         JwtDto jwtDto = new JwtDto(jwt, userDetails.getUsername(), userDetails.getAuthorities());
         
         return new ResponseEntity(jwtDto, HttpStatus.OK);
         
         
         
         
         
    }
}