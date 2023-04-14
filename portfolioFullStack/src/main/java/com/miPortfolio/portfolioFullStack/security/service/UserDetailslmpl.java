
package com.miPortfolio.portfolioFullStack.security.service;

import com.miPortfolio.portfolioFullStack.model.Usuario;
import com.miPortfolio.portfolioFullStack.security.entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */

@Service
public class UserDetailslmpl implements UserDetailsService {
    
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
      
        Usuario user= usuarioService.getByNombreUsuario(nombreUsuario).get();
        
        return UsuarioPrincipal.build(user);
        
    }
    
    
    
}
