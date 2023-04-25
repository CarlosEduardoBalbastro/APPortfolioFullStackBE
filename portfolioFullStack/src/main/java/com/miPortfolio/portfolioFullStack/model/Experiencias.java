
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
public class Experiencias {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    
    private String empresa;
    private boolean estrabajoactual;
    private String inicio;
    private String fin;
    
    @Lob
    private String descripcion;
    private String direccion;
    private String imagen;
    private String stackusado;

    public Experiencias() {
    }

    public Experiencias(int id, String empresa, boolean estrabajoactual, String inicio, String fin, String descripcion, String direccion, String imagen, String stackusado) {
        this.id = id;
        this.empresa = empresa;
        this.estrabajoactual = estrabajoactual;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.imagen = imagen;
        this.stackusado = stackusado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public boolean isEstrabajoactual() {
        return estrabajoactual;
    }

    public void setEstrabajoactual(boolean estrabajoactual) {
        this.estrabajoactual = estrabajoactual;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getStackusado() {
        return stackusado;
    }

    public void setStackusado(String stackusado) {
        this.stackusado = stackusado;
    }
    
    
    
    
    
}
