
package com.miPortfolio.portfolioFullStack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Formacion {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private int id;
    
   
    private String institucion;
    
    private String imagen;
   
    @Lob
    private String curso;
    
    private int puntaje;
    private String inicio;
    private String fin;
    private String horas_duracion;

    public Formacion() {
    }

    public Formacion(int id, String institucion, String imagen, String curso, int puntaje, String inicio, String fin, String horas_duracion) {
        this.id = id;
        this.institucion = institucion;
        this.imagen = imagen;
        this.curso = curso;
        this.puntaje = puntaje;
        this.inicio = inicio;
        this.fin = fin;
        this.horas_duracion = horas_duracion;
    }



  

    
    
    
    
    
    
}
