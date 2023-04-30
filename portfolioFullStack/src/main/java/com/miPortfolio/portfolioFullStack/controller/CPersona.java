
package com.miPortfolio.portfolioFullStack.controller;

import com.miPortfolio.portfolioFullStack.model.Persona;
import com.miPortfolio.portfolioFullStack.service.SPersona;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/personas")//localhost:4200
@CrossOrigin( origins = "https://portfolio-carlos-balbastro.web.app")
public class CPersona {
    
    @Autowired
    SPersona persoServ;
    
    @GetMapping ("/traer")
    @ResponseBody
    public List<Persona> getPersonas(){
        return persoServ.getPersonas();
    }
    
   //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/crear")
    public String createPersonas(@RequestBody Persona perso){
        persoServ.savePersona(perso);
        return "LA persona fue creada correctamente";
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/borrar/{id}")
    public String detelePersona(@PathVariable int id){
        persoServ.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/editar/{id}")
    public Persona editPersona (@PathVariable int id,
                               @RequestParam ("nombre") String nuevoNombre,
                               @RequestParam ("apellido") String nuevoApellido,
                               @RequestParam ("domicilio") String nuevoDomicilio,
                               @RequestParam ("nacionalidad") String nuevoNacionalidad,
                               @RequestParam ("lugarNacimiento") String nuevoLugarNacimiento,
                               @RequestParam ("lugarResidencia") String nuevoLugarResidencia,
                               @RequestParam ("fechaNac") String nuevoFechaNac,
                               @RequestParam ("correo") String nuevoCorreo,
                               @RequestParam ("sobreMi") String nuevoSobreMi,
                               @RequestParam ("imagen") String nuevoImagen,
                               @RequestParam ("cv") String nuevoCv,
                               @RequestParam ("edad") int nuevoEdad,
                               @RequestParam ("hijos") String nuevoHijos,
                               @RequestParam ("estadoCivil") String nuevoEstadoCivil,
                               @RequestParam ("empresa") String nuevoEmpresa,
                               @RequestParam ("ocupacion") String nuevoOcupacion,
                               @RequestParam ("area") String nuevoArea){
        
        Persona perso = persoServ.findPersona(id);
        
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setDomicilio(nuevoDomicilio);
        perso.setNacionalidad(nuevoNacionalidad);
        perso.setLugarNacimiento(nuevoLugarNacimiento);
        perso.setLugarResidencia(nuevoLugarResidencia);
        perso.setFechaNac(nuevoFechaNac);
        perso.setCorreo(nuevoCorreo);
        perso.setSobreMi(nuevoSobreMi);
        perso.setImagen(nuevoImagen);
        perso.setCv(nuevoCv);
        perso.setEdad(nuevoEdad);
        perso.setHijos(nuevoHijos);
        perso.setEstadoCivil(nuevoEstadoCivil);
        perso.setEmpresa(nuevoEmpresa);
        perso.setOcupacion(nuevoOcupacion);
        perso.setArea(nuevoArea);
        
        persoServ.savePersona(perso);
        
        
        return perso;
    }
    
    //Juli tiene metodo editar asi
     // @PreAuthorize("hasRole('ADMIN')")
   @PutMapping("/editar")
   public String editarPersona (@RequestBody Persona pers){
       persoServ.ediarPersona(pers);
       return "La persona fue editada.";
   }
    
    
}
