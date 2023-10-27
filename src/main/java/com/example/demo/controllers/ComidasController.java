package com.example.demo.controllers;
import com.example.demo.models.Comidas;
import com.example.demo.services.ComidasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ComidasController {
    @Autowired
    ComidasService comidasService;
    @GetMapping("/comidas")
    public ArrayList<Comidas> obtenerComidas(){ return comidasService.obtenerComidas();}
    @GetMapping("/comidas/{id}")
    public Optional<Comidas> obtenerId(@PathVariable("id") Integer id){ return this.comidasService.obtenerId(id);}

    @PostMapping("/comidasCreate")
    public Comidas createComidas(@RequestBody Comidas comidas){return comidasService.createComidas(comidas);}

    @DeleteMapping("/comidasDelete/{id}")
    public ResponseEntity<Void> deleteComidas(@PathVariable("id") Integer id){
        comidasService.deleteComidas(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/comidasUpdate")
    public Comidas updateComidas(@RequestBody Comidas comidas){return comidasService.updateComidas(comidas);}
}
