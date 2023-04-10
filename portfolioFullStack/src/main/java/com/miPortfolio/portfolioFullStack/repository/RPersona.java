
package com.miPortfolio.portfolioFullStack.repository;

import com.miPortfolio.portfolioFullStack.model.Persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RPersona extends JpaRepository <Persona, Integer> {
   
}
