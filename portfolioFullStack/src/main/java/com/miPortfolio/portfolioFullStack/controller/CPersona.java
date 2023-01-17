
package com.miPortfolio.portfolioFullStack.controller;

import com.miPortfolio.portfolioFullStack.model.Persona;
import com.miPortfolio.portfolioFullStack.service.SPersona;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CPersona {
    
    @Autowired
    SPersona persoServ;
    
    @GetMapping ("/personas/traer")
    public List<Persona> getPersonas(){
        return persoServ.getPersonas();
    }
    
    
    @PostMapping ("/personas/crear")
    public String createPersonas(@RequestBody Persona perso){
        persoServ.savePersona(perso);
        return "LA persona fue creada correctamente";
    }
    
    
    @DeleteMapping ("/personas/borrar/{id}")
    public String detelePersona(@PathVariable int id){
        persoServ.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping ("personas/editar/{id}")
    public Persona editPersona (@PathVariable int id,
                               @RequestParam ("nombre") String nuevoNombre,
                               @RequestParam ("apellido") String nuevoApellido,
                               @RequestParam ("domicilio") String nuevoDomicilio,
                               @RequestParam ("fechaNac") Date nuevoFechaNac,
                               @RequestParam ("correo") String nuevoCorreo,
                               @RequestParam ("sobreMi") String nuevoSobreMi,
                               @RequestParam ("imagen") String nuevoImagen,
                               @RequestParam ("edad") int nuevoEdad,
                               @RequestParam ("empresa") String nuevoEmpresa,
                               @RequestParam ("ocupacion") String nuevoOcupacion,
                               @RequestParam ("area") String nuevoArea){
        
        Persona perso = persoServ.findPersona(id);
        
        
        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setEdad(id);
        
        persoServ.savePersona(perso);
        
        
        return perso;
    }
    
}
