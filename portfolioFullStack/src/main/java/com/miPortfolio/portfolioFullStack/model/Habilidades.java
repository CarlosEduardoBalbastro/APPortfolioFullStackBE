
package com.miPortfolio.portfolioFullStack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class Habilidades {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private int id;
    
    private String tecnologia;
    private String imagen;
   
    private int porcentaje;
    
    private String color;

    public Habilidades() {
    }

    public Habilidades(int id, String tecnologia, String imagen, int porcentaje, String color) {
        this.id = id;
        this.tecnologia = tecnologia;
        this.imagen = imagen;
        this.porcentaje = porcentaje;
        this.color = color;
    }
    
    
    
    
}
