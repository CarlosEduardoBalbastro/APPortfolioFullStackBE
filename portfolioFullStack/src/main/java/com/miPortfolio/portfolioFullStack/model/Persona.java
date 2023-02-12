
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String imagen;
    private int edad;
    private String hijos;
    private String estadoCivil;
    private String empresa;
    private String ocupacion;
    private String area;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String domicilio, String nacionalidad, String lugarNacimiento, String lugarResidencia, String fechaNac, String correo, String sobreMi, String imagen, int edad, String hijos, String estadoCivil, String empresa, String ocupacion, String area) {
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
        this.edad = edad;
        this.hijos = hijos;
        this.estadoCivil = estadoCivil;
        this.empresa = empresa;
        this.ocupacion = ocupacion;
        this.area = area;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
        public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
          public String getlugarNacimiento() {
        return lugarNacimiento;
    }

    public void setlugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento= lugarNacimiento;
    }
    
    
            public String getlugarResidencia() {
        return lugarResidencia;
    }

    public void setlugarResidencia(String lugarResidencia) {
        this.lugarResidencia= lugarResidencia;
    }
    
    
    

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSobreMi() {
        return sobreMi;
    }

    public void setSobreMi(String sobreMi) {
        this.sobreMi = sobreMi;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getHijos(){
        return hijos;
    }
    
    public void setHijos(String hijos){
        this.hijos = hijos;
    }
    
    public String getEstadoCivil(){
        return estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil){
        
        this.estadoCivil = estadoCivil;
        
    }
    
    

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
    
    
    
}
