
package com.miPortfolio.portfolioFullStack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
    
    
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private int id;
    
    private String email;
    private String password;

    public Usuario() {
    }

    public Usuario(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
    

}
