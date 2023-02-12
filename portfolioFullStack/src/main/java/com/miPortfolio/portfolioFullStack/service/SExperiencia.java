
package com.miPortfolio.portfolioFullStack.service;

import com.miPortfolio.portfolioFullStack.model.Experiencias;
import com.miPortfolio.portfolioFullStack.repository.RExperiencia;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class SExperiencia  {
    
    @Autowired 
    private RExperiencia repoExpe;
    
   
    public List<Experiencias> getExperiencia(){
        
        
        List<Experiencias> listaExperiencias = repoExpe.findAll();
        
        return listaExperiencias;
        
    }
   
    
    public void saveExperiencia(Experiencias exp){
        
        repoExpe.save(exp);
        
    }
    
    
    public void deleteExperiencia(int id){
        
        repoExpe.deleteById(id);
        
    }
    
    
    public Experiencias findExperiencia(int id){
        
        Experiencias exp = repoExpe.findById(id).orElse(null);
        return exp;
        
        
    }
    
    
    
}
