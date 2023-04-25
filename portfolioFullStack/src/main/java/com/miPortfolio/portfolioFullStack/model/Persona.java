
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
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String nombre;
    private String apellido;
    private String domicilio;
    private String nacionalidad;
    private String lugarNacimiento;
    private String lugarResidencia;
  
    private String fechaNac;
    
    private String correo;
    
    @Lob
    private String sobreMi;
    
   @Lob
    private String imagen;
    
   @Lob
    private String cv;
    private int edad;
    private String hijos;
    private String estadoCivil;
    private String empresa;
    private String ocupacion;
    private String area;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String domicilio, String nacionalidad, String lugarNacimiento, String lugarResidencia, String fechaNac, String correo, String sobreMi, String imagen, String cv, int edad, String hijos, String estadoCivil, String empresa, String ocupacion, String area) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.nacionalidad = nacionalidad;
        this.lugarNacimiento = lugarNacimiento;
        this.lugarResidencia = lugarResidencia;
        this.fechaNac = fechaNac;
        this.correo = correo;
        this.sobreMi = sobreMi;
        this.imagen = imagen;
        this.cv = cv;
        this.edad = edad;
        this.hijos = hijos;
        this.estadoCivil = estadoCivil;
        this.empresa = empresa;
        this.ocupacion = ocupacion;
        this.area = area;
    }

 



    
    
    
    
}
