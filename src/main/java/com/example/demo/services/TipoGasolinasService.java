package com.example.demo.services;
import com.example.demo.models.TipoGasolinas;
import com.example.demo.repositories.TipoGasolinasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TipoGasolinasService {
    @Autowired
    TipoGasolinasRepository tipoGasolinasRepository;

    public ArrayList<TipoGasolinas> obtenerTipoGasolinas(){ return (ArrayList<TipoGasolinas>) tipoGasolinasRepository.findAll();}
    public Optional<TipoGasolinas> obtenerId(Integer id){ return tipoGasolinasRepository.findById(id);}
    public TipoGasolinas createTipoGasolinas(TipoGasolinas comidas){ return tipoGasolinasRepository.save(comidas);}
    public void deleteTipoGasolinas(Integer id) { tipoGasolinasRepository.deleteById(id);}
    public TipoGasolinas updateTipoGasolinas(TipoGasolinas comidas) { return tipoGasolinasRepository.save(comidas); }


}


