
package com.miPortfolio.portfolioFullStack.service;

import com.miPortfolio.portfolioFullStack.model.Formacion;
import com.miPortfolio.portfolioFullStack.repository.RFormacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class SFormacion {
    
    @Autowired
   private RFormacion repoForm;
    
    
    public List<Formacion> traerFormacion(){
        
        List<Formacion> listaFormacion = repoForm.findAll();
        return listaFormacion;
        
    }
    
    
    public void crearFormacion(Formacion form){
        repoForm.save(form);
    }
    
    public void borrarFormacion(int id){
        repoForm.deleteById(id);
    }
    
    
    public Formacion findFormacion(int id){
        Formacion form = repoForm.findById(id).orElse(null);
        return form;
    }
    
    
    
}
