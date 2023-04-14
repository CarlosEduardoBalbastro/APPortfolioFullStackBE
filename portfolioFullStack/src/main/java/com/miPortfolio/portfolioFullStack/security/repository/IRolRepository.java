
package com.miPortfolio.portfolioFullStack.security.repository;

import com.miPortfolio.portfolioFullStack.security.entity.Rol;
import com.miPortfolio.portfolioFullStack.security.enums.RolName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    
    Optional<Rol> findByRolNombre(RolName rolNombre); 
}
