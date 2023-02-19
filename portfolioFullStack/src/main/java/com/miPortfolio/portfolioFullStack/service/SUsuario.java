
package com.miPortfolio.portfolioFullStack.service;

import com.miPortfolio.portfolioFullStack.model.Usuario;
import com.miPortfolio.portfolioFullStack.repository.RUsuario;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class SUsuario {
    
    
    @Autowired
    private RUsuario repoUser;
    
    public List<Usuario> traerUsuario(){
        
        List<Usuario> listaUsuario = repoUser.findAll();
        
        return listaUsuario;
    }
    
    public void createUsuario(Usuario user){
        repoUser.save(user);
    }
    
    
    public void deleteUsuario(int id){
        repoUser.deleteById(id);
    }
    
    
    public Usuario encontrarUsuario(int id){
        Usuario user = repoUser.findById(id).orElse(null);
        return user;
    }
    
    
    
    
}
