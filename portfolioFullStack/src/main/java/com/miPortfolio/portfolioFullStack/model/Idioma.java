
package com.miPortfolio.portfolioFullStack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class Idioma {
    
    
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private int id;
    
    private String lengua;
    private String nivel;

    public Idioma() {
    }

    public Idioma(int id, String lengua, String nivel) {
        this.id = id;
        this.lengua = lengua;
        this.nivel = nivel;
    }
    
    
    
    
}
