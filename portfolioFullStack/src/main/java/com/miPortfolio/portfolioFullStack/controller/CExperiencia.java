
package com.miPortfolio.portfolioFullStack.controller;

import com.miPortfolio.portfolioFullStack.model.Experiencias;
import com.miPortfolio.portfolioFullStack.service.SExperiencia;
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



//el controlador de Juli no tiene crossorigin

@RestController
@RequestMapping ("/experiencias") 
//@CrossOrigin ( origins = "http://localhost:4200" )
public class CExperiencia {
    

@Autowired
SExperiencia expServ;

@GetMapping ("/traer")
@ResponseBody
public List<Experiencias> getExperiencia(){
    return expServ.getExperiencia();
}



//@PreAuthorize("hasRole('ADMIN')")
@PostMapping ("/crear")
public String createExperiencia(@RequestBody Experiencias exp){
    
    expServ.saveExperiencia(exp);
    return "LA experiencia fue creada";
    
}


//@PreAuthorize("hasRole('ADMIN')")
@DeleteMapping ("/borrar/{id}")
public String deleteExperiencia(@PathVariable int id){
    
    expServ.deleteExperiencia(id);
    return "LA experiencia fue eliminada con exito";
    
}


//Juli tiene un metodo distitnto para editar
  // @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public String editarExperiencia (@RequestBody Experiencias expe){
        expServ.editarExperiencia(expe);
        return "La experiencia fue editada.";
    }


//@PreAuthorize("hasRole('ADMIN')")
@PutMapping ("/editar/{id}")
public Experiencias editExperiencia(@PathVariable int id,
                                    @RequestParam ("empresa") String nueEmpresa,
                                    @RequestParam ("estrabajoactual") boolean nueEstrabajoactual,
                                    @RequestParam ("inicio") String nueInicio,
                                    @RequestParam ("fin") String nueFin,
                                    @RequestParam ("descripcion") String nueDescripcion,
                                    @RequestParam ("direccion") String nueDireccion,
                                    @RequestParam ("imagen") String nueImagen,
                                    @RequestParam ("stackusado") String nueStackusado
                                    ){
    
    Experiencias exp = expServ.findExperiencia(id);
    
    
    exp.setEmpresa(nueEmpresa);
    exp.setEstrabajoactual(nueEstrabajoactual);
    exp.setInicio(nueInicio);
    exp.setFin(nueFin);
    exp.setDescripcion(nueDescripcion);
    exp.setDireccion(nueDireccion);
    exp.setImagen(nueImagen);
    exp.setStackusado(nueStackusado);
    
    
    expServ.saveExperiencia(exp);
    
    
    return exp;
    
}


    
    
}
