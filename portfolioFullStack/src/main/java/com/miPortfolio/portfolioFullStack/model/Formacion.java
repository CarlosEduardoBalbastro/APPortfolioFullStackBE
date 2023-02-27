
package com.miPortfolio.portfolioFullStack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getHoras_duracion() {
        return horas_duracion;
    }

    public void setHoras_duracion(String horas_duracion) {
        this.horas_duracion = horas_duracion;
    }
    
    
    
    
    
    
}
