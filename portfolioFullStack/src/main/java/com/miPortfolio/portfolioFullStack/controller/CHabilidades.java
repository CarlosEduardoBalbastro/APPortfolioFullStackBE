
package com.miPortfolio.portfolioFullStack.controller;

import com.miPortfolio.portfolioFullStack.model.Habilidades;
import com.miPortfolio.portfolioFullStack.service.SHabilidades;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping ("/habilidades")
@CrossOrigin ( origins = "http://localhost:4200")
public class CHabilidades {

@Autowired
SHabilidades servHab;


@GetMapping ("/traer")
@ResponseBody
public List<Habilidades> traerHabilidades(){
    return servHab.traerHablidades();
}


//@PreAuthorize("hasRole('ADMIN')")
@PostMapping ("/crear")
public String crearHabilidades(@RequestBody Habilidades hab){
    servHab.crearHabilidad(hab);
    return "La Habilidad fue creada con exito";
}


//@PreAuthorize("hasRole('ADMIN')")
@DeleteMapping ("borrar/{id}")
public String borrarHabilidad(@PathVariable int id){
    servHab.borrarHabilidad(id);
    return "La habilidad fue borrada con exito";
}

//@PreAuthorize("hasRole('ADMIN')")
@PutMapping ("editar/{id}")
public Habilidades editarHabilidades(@PathVariable int id,
                                     @RequestParam ("tecnologia") String nvaTecnologia,
                                     @RequestParam ("imagen") String nvaImagen,
                                     @RequestParam ("porcentaje") int nvaPorcentaje,
                                     @RequestParam ("color") String nvoColor
                                     
        ){
    
    Habilidades hab = servHab.findHabilidad(id);
    
    hab.setTecnologia(nvaTecnologia);
    hab.setImagen(nvaImagen);
    hab.setPorcentaje(nvaPorcentaje);
    hab.setColor(nvoColor);
    
    servHab.crearHabilidad(hab);
    
    return hab;
    
    
}


  // @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public String editarHabilidad(@RequestBody Habilidades hab){
        servHab.editarHabilidad(hab);
        return "Habilidad  fue editada";
    }


    
}
