
package com.miPortfolio.portfolioFullStack.repository;

import com.miPortfolio.portfolioFullStack.model.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidades extends JpaRepository<Habilidades, Integer> {
    
}
