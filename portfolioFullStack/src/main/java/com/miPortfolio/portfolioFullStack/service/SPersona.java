
package com.miPortfolio.portfolioFullStack.service;

import com.miPortfolio.portfolioFullStack.model.Persona;
import com.miPortfolio.portfolioFullStack.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//https://github.com/bezkoder/angular-13-login-registration-example
//https://github.com/bezkoder/spring-boot-spring-security-jwt-authentication
//https://www.bezkoder.com/angular-15-jwt-auth/

@Service
@Transactional
public class SPersona implements IPersonaService {
    
    @Autowired
    private RPersona personRepository;
    
    @Override
    public List<Persona> getPersonas(){
        List<Persona> listaPersonas = personRepository.findAll();
        return listaPersonas;
    }
    
    
    @Override
    public void savePersona(Persona perso){
        personRepository.save(perso);
    }
    
    
    @Override
    public void deletePersona(int id){
        personRepository.deleteById(id);
    }
    
    @Override
    public Persona findPersona(int id){
        Persona perso = personRepository.findById(id).orElse(null);
        return perso;
    }
    
    
    public void ediarPersona(Persona perso){
        personRepository.save(perso);
    }
    
    
}
