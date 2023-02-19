
package com.miPortfolio.portfolioFullStack.repository;

import com.miPortfolio.portfolioFullStack.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RUsuario  extends JpaRepository<Usuario, Integer> {
    
}
