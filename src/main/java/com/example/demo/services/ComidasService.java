package com.example.demo.services;
import com.example.demo.models.Comidas;
import com.example.demo.repositories.ComidasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ComidasService {
    @Autowired
    ComidasRepository comidasRepository;
    public ArrayList<Comidas> obtenerComidas(){ return (ArrayList<Comidas>) comidasRepository.findAll();}
    public Optional<Comidas> obtenerId(Integer id){ return comidasRepository.findById(id);}
    public Comidas createComidas(Comidas comidas){ return comidasRepository.save(comidas);}
    public void deleteComidas(Integer id) { comidasRepository.deleteById(id);}
    public Comidas updateComidas(Comidas comidas) { return comidasRepository.save(comidas); }
}
