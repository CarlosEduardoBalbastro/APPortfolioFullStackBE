
package com.miPortfolio.portfolioFullStack.service;

import com.miPortfolio.portfolioFullStack.model.Idioma;
import com.miPortfolio.portfolioFullStack.repository.RIdioma;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
@Transactional
public class SIdioma {
    
    @Autowired
    private RIdioma repoIdioma;
    
    
    
    public List<Idioma> getIdioma(){
        
        
        List<Idioma> listaIdioma = repoIdioma.findAll();
        
        return listaIdioma;
        
        
    }
    
    
    
    
    public void createIdioma(Idioma idiom){
        
        
        repoIdioma.save(idiom);
        
    }
    
    
    public void deleteIdioma(int id){
        repoIdioma.deleteById(id);
    }
    
    
    public Idioma findIdioma(int id){
        
        Idioma idiom = repoIdioma.findById(id).orElse(null);
        return idiom;
        
        
    }
    
    
    
}
