package com.example.demo.controllers;
import com.example.demo.models.RegistroNoDetallado;
import com.example.demo.services.RegistroNoDetalladoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Optional;
@RestController
@RequestMapping("/api")
public class RegistroNoDetalladoController {
    @Autowired
    RegistroNoDetalladoService registroNoDetalladoService;
    @GetMapping("/registro")
    public ArrayList<RegistroNoDetallado> obtenerRegistro(){ return registroNoDetalladoService.obtenerRegistro();}
    @GetMapping("/registro/{id}")
    public Optional<RegistroNoDetallado> obtenerRegistroId(@PathVariable("id") Integer id){ return this.registroNoDetalladoService.obtenerRegistroId(id);}
    @PostMapping("/registroCreate")
    public RegistroNoDetallado createRegistro(@RequestBody RegistroNoDetallado comidas){return registroNoDetalladoService.createRegistro(comidas);}
    @DeleteMapping("/registroDelete/{id}")
    public ResponseEntity<Void> deleteRegistro(@PathVariable("id") Integer id){
        registroNoDetalladoService.deleteRegistro(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/registroUpdate")
    public RegistroNoDetallado updateRegistro(@RequestBody RegistroNoDetallado comidas){return registroNoDetalladoService.updateRegistro(comidas);}
}
