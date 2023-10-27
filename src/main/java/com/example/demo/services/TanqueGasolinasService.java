package com.example.demo.services;
import com.example.demo.models.TanqueGasolinas;
import com.example.demo.repositories.TanqueGasolinasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TanqueGasolinasService {
    @Autowired
    TanqueGasolinasRepository tanqueGasolinasRepository;
    public ArrayList<TanqueGasolinas> obtenerTanqueGasolinas(){ return (ArrayList<TanqueGasolinas>) tanqueGasolinasRepository.findAll();}
    public Optional<TanqueGasolinas> obtenerId(Integer id){ return tanqueGasolinasRepository.findById(id);}
    public TanqueGasolinas createTanqueGasolinas(TanqueGasolinas comidas){ return tanqueGasolinasRepository.save(comidas);}
    public void deleteTanqueGasolinas(Integer id) { tanqueGasolinasRepository.deleteById(id);}
    public TanqueGasolinas updateTanqueGasolinas(TanqueGasolinas comidas) { return tanqueGasolinasRepository.save(comidas); }


}