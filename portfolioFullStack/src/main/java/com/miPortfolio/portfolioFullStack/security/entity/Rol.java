
package com.miPortfolio.portfolioFullStack.security.entity;

import com.miPortfolio.portfolioFullStack.security.enums.RolName;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NonNull;

/**
 *
 * @author Usuario
 */
@Entity
public class Rol {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NonNull
    @Enumerated (EnumType.STRING)
    private RolName rolNombre;
    
    
    //Constructor

    public Rol() {
    }

    public Rol(RolName rolNombre) {
        this.rolNombre = rolNombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolName getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(RolName rolNombre) {
        this.rolNombre = rolNombre;
    }
    
    
    
    
}
