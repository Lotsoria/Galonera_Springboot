package com.example.demo.controllers;

import com.example.demo.models.Client;
import com.example.demo.models.User;
import com.example.demo.request.RequestDTO;
import com.example.demo.response.ResponseDTO;
import com.example.demo.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ClientController {
    @Autowired
    ClientService clientService;
    @GetMapping("/client")
    public ArrayList<Client> obtenerUsuarios(){
        return clientService.obtenerClientes();
    }

    @GetMapping("/client/{id}")
    public Optional<Client> obtenerId(@PathVariable("id") Integer id){
        return this.clientService.obtenerId(id);
    }

    @PostMapping("/client")
    public ResponseEntity<ResponseDTO> guardarClient(@RequestBody RequestDTO requestDTO){
        return this.clientService.guardarCliente(requestDTO);
    }
}
