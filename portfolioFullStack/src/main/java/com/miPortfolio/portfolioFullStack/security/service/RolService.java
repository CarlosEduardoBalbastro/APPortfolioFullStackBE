
package com.miPortfolio.portfolioFullStack.security.service;

import com.miPortfolio.portfolioFullStack.security.entity.Rol;
import com.miPortfolio.portfolioFullStack.security.enums.RolName;
import com.miPortfolio.portfolioFullStack.security.repository.IRolRepository;
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
public class RolService {
    
    @Autowired
    IRolRepository iRolRepository;
    
    public Optional<Rol> getByRolNombre(RolName rolNombre){
        
        return iRolRepository.findByRolNombre(rolNombre);
        
        
    }
    
    
    //Metodo para guardar
    
    public void save (Rol rol){
        iRolRepository.save(rol);
    }
    
}
