
package com.miPortfolio.portfolioFullStack.service;

import com.miPortfolio.portfolioFullStack.model.Persona;
import com.miPortfolio.portfolioFullStack.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SPersona {
    
    @Autowired
    private RPersona personRepository;
    
    public List<Persona> getPersonas(){
        List<Persona> listaPersonas = personRepository.findAll();
        return listaPersonas;
    }
    
    
    public void savePersona(Persona perso){
        personRepository.save(perso);
    }
    
    
    public void deletePersona(int id){
        personRepository.deleteById(id);
    }
    
    public Persona findPersona(int id){
        Persona perso = personRepository.findById(id).orElse(null);
        return perso;
    }
    
    
}
