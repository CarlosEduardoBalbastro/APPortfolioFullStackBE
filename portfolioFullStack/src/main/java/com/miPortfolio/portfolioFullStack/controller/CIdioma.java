
package com.miPortfolio.portfolioFullStack.controller;

import com.miPortfolio.portfolioFullStack.model.Idioma;
import com.miPortfolio.portfolioFullStack.service.SIdioma;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/idiomas")
@CrossOrigin ( origins = "http://localhost:4200")
public class CIdioma {
    
    @Autowired
    SIdioma idiomaServ;
    
    @GetMapping ("/traer")
    public List<Idioma>  getIdioma(){
        return idiomaServ.getIdioma();
    }
    
    
    @PostMapping ("/crear")
    public String createIdioma(@RequestBody Idioma idiom){
        idiomaServ.createIdioma(idiom);
        return "el Idioma fue creado";
    }
    
    
    
    @DeleteMapping ("/borrar/{id}")
    public String deleteIdioma(@PathVariable int id){
        
        idiomaServ.deleteIdioma(id);
        
        return "El idioma fue eliminado";
    }
    
    
    @PutMapping ("/editar/{id}")
    public Idioma editIdioma(@PathVariable int id,
                            @RequestParam ("lengua") String nvaLengua,
                            @RequestParam ("nivel") String nvaNivel
            ){
        
        Idioma idiom = idiomaServ.findIdioma(id);
        
        idiom.setLengua(nvaLengua);
        idiom.setNivel(nvaNivel);
        
        idiomaServ.createIdioma(idiom);
        
        return idiom;
        
    }
    
    
    
    
}
