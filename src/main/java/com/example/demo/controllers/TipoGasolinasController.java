package com.example.demo.controllers;
import com.example.demo.models.TipoGasolinas;
import com.example.demo.services.TipoGasolinasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TipoGasolinasController {
    @Autowired
    TipoGasolinasService tipoGasolinasService;
    @GetMapping("/tipogasolinas")
    public ArrayList<TipoGasolinas> obtenerTipoGasolinas(){ return tipoGasolinasService.obtenerTipoGasolinas();}
    @GetMapping("/tipogasolinas/{id}")
    public Optional<TipoGasolinas> obtenerTipoGasolinas(@PathVariable("id") Integer id){ return this.tipoGasolinasService.obtenerId(id);}

    @PostMapping("/tipogasolinasCreate")
    public TipoGasolinas createTipoGasolinas(@RequestBody TipoGasolinas comidas){return tipoGasolinasService.createTipoGasolinas(comidas);}

    @DeleteMapping("/tipogasolinasDelete/{id}")
    public ResponseEntity<Void> deleteTipoGasolinas(@PathVariable("id") Integer id){
        tipoGasolinasService.deleteTipoGasolinas(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/tipogasolinasUpdate")
    public TipoGasolinas updateTipoGasolinas(@RequestBody TipoGasolinas comidas){return tipoGasolinasService.updateTipoGasolinas(comidas);}
}