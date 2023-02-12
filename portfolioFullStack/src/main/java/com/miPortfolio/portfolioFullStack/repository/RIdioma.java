
package com.miPortfolio.portfolioFullStack.repository;

import com.miPortfolio.portfolioFullStack.model.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RIdioma extends JpaRepository<Idioma, Integer>{
    
    
    
}
