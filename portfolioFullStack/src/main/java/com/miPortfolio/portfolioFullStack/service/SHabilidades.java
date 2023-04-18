
package com.miPortfolio.portfolioFullStack.service;

import com.miPortfolio.portfolioFullStack.model.Habilidades;
import com.miPortfolio.portfolioFullStack.repository.RHabilidades;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SHabilidades {
    
    @Autowired
    private RHabilidades repoHabilidades;
    
    
    public List<Habilidades> traerHablidades(){
        
        List <Habilidades> listaHabilidades = repoHabilidades.findAll();
        
        return listaHabilidades;
        
    }
    
    
    
    public void crearHabilidad(Habilidades hab){
        repoHabilidades.save(hab);
    }
    
    
    public void borrarHabilidad(int id){
        repoHabilidades.deleteById(id);
    }
    
    
    public Habilidades findHabilidad(int id){
        
        
        Habilidades hab = repoHabilidades.findById(id).orElse(null);
        
        return hab ;
    }
    
    
    public void editarHabilidad(Habilidades hab){
        repoHabilidades.save(hab);
                
    }
    
}
