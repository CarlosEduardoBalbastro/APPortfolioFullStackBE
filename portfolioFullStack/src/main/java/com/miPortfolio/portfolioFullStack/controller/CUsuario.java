
package com.miPortfolio.portfolioFullStack.controller;

import com.miPortfolio.portfolioFullStack.model.Usuario;

import com.miPortfolio.portfolioFullStack.service.SUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping ("/usuario")
@CrossOrigin( origins = "http://localhost:4200")
public class CUsuario {
    
    @Autowired
    SUsuario servUser;
   
    
    @PostMapping ("/login")
   public String crearUsuario(@RequestBody Usuario user){
       
     servUser.createUsuario(user);
     return "El usuario fue creado";
        
    }
   
   
   @GetMapping ("/traer")
   public List<Usuario> traerUsuario(){
       return servUser.traerUsuario();
   }
   
   
   @DeleteMapping ("/borrar/{id}")
   public String deleteUsusario(@PathVariable int id){
       servUser.deleteUsuario(id);
       return "El usuario se ha borrado con exito";
   }
   
   
    
}
