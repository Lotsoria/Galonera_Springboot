package com.example.demo.controllers;
import com.example.demo.models.TanqueGasolinas;
import com.example.demo.services.TanqueGasolinasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TanqueGasolinasController {
    @Autowired
    TanqueGasolinasService tanqueGasolinasService;
    @GetMapping("/tanquegasolinas")
    public ArrayList<TanqueGasolinas> obtenerTanqueGasolinas(){ return tanqueGasolinasService.obtenerTanqueGasolinas();}
    @GetMapping("/tanquegasolinas/{id}")
    public Optional<TanqueGasolinas> obtenerTanqueGasolinas(@PathVariable("id") Integer id){ return this.tanqueGasolinasService.obtenerId(id);}

    @PostMapping("/tanquegasolinasCreate")
    public TanqueGasolinas createTanqueGasolinas(@RequestBody TanqueGasolinas comidas){return tanqueGasolinasService.createTanqueGasolinas(comidas);}

    @DeleteMapping("/tanquegasolinasDelete/{id}")
    public ResponseEntity<Void> deleteTanqueGasolinas(@PathVariable("id") Integer id){
        tanqueGasolinasService.deleteTanqueGasolinas(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/tanquegasolinasUpdate")
    public TanqueGasolinas updateTanqueGasolinas(@RequestBody TanqueGasolinas comidas){return tanqueGasolinasService.updateTanqueGasolinas(comidas);}

}
