/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miPortfolio.portfolioFullStack.controller;

import com.miPortfolio.portfolioFullStack.model.Formacion;
import com.miPortfolio.portfolioFullStack.service.SFormacion;
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


//el controlador de juli no tiene anotation crossorigin

@RestController
@RequestMapping ("/formacion")
@CrossOrigin ( origins = "http://localhost:4200")
public class CFormacion {

@Autowired
SFormacion servForm;

@GetMapping ("/traer")
@ResponseBody
public List<Formacion> traerFormacion(){
    return servForm.traerFormacion();
}

//@PreAuthorize("hasRole('ADMIN')")
@PostMapping ("/crear")
public String crearFormacion(@RequestBody Formacion form){
    servForm.crearFormacion(form);
    return "La Formacion fue creada con Exito";
}


//@PreAuthorize("hasRole('ADMIN')")
@DeleteMapping ("borrar/{id}")
public String borrarFormacion(@PathVariable int id){
    
    servForm.borrarFormacion(id);
    return "La Formacion fue eliminada con exito";
    
}

//@PreAuthorize("hasRole('ADMIN')")
@PutMapping ("editar/{id}")
public Formacion editarFormacion(@PathVariable int id,
                                       @RequestParam ("institucion") String newInstitucion,
                                       @RequestParam ("imagen") String newImagen,
                                       @RequestParam ("curso") String newCurso,
                                       @RequestParam ("inicio") String newInicio,
                                       @RequestParam ("fin") String newFin,
                                       @RequestParam ("horas_duracion") String newHoras_duracion
                                      ){
    Formacion form = servForm.findFormacion(id);
    
    form.setInstitucion(newInstitucion);
    form.setImagen(newImagen);
    form.setCurso(newCurso);
    form.setInicio(newInicio);
    form.setFin(newFin);
    form.setHoras_duracion(newHoras_duracion);
    
    servForm.crearFormacion(form);
    return form;
}


//metodo editar copiado de juli
// @PreAuthorize("hasRole('ADMIN')")
//    @PutMapping("/editar")
//    public String editarEstudio (@RequestBody Estudio estu){
//        estuServ.editarEstudio(estu);
//        return "El estudio fue editado.";
//    }

    
}
