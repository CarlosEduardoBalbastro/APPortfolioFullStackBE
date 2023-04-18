
package com.miPortfolio.portfolioFullStack.security.repository;


import com.miPortfolio.portfolioFullStack.security.entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    
    
    Optional<Usuario> findByNombreUsuario (String nombreUsuario);
    
    boolean existsByNombreUsuario(String NombreUsuario);

    boolean existsByEmail(String email);
    
    
}
