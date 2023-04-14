
package com.miPortfolio.portfolioFullStack.security.service;

import com.miPortfolio.portfolioFullStack.model.Usuario;
import com.miPortfolio.portfolioFullStack.security.repository.IUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
@Transactional
public class UsuarioService {
    
    @Autowired
    IUsuarioRepository iUsuarioRepository;
    
    public Optional <Usuario> getByNombreUsuario(String nombreUsuario){
        return iUsuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    
    public boolean existsByNomberUsuario(String nombreUsuario){
        return iUsuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    
    public boolean existsByEmail(String email){
        return iUsuarioRepository.existsByEmail(email);
    }
    
    public void save (Usuario usuario){
        iUsuarioRepository.save(usuario);
    }
    
    
}
