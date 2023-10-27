package com.example.demo.services;

import com.example.demo.models.Client;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.request.RequestDTO;
import com.example.demo.response.ClientResponse;
import com.example.demo.response.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public ArrayList<Client> obtenerClientes() { return (ArrayList<Client>) clientRepository.findAll(); }

    public Optional<Client> obtenerId(Integer id) { return (Optional<Client>) clientRepository.findById(id); }

    public ResponseEntity<ResponseDTO> guardarCliente(RequestDTO requestDTO){
        Client client = clientRepository.save(requestDTO.getRequest().getClient());

        //Configurando respuesta del cliente
        ClientResponse clientResponse = new ClientResponse();
        clientResponse.setId(client.getId());
        clientResponse.setPresupuesto(client.getPresupuesto());

        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResponse("CLIENTE AGREGADO CORRECTAMENTE");
        responseDTO.setClient(clientResponse);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
