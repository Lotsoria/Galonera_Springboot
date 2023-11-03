package com.example.demo.services;
import com.example.demo.models.RegistroNoDetallado;
import com.example.demo.repositories.RegistroNoDetalladoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;
@Service
public class RegistroNoDetalladoService {
    @Autowired
    RegistroNoDetalladoRepository registroNoDetalladoRepository;
    public ArrayList<RegistroNoDetallado> obtenerRegistro(){ return (ArrayList<RegistroNoDetallado>) registroNoDetalladoRepository.findAll();}
    public Optional<RegistroNoDetallado> obtenerRegistroId(Integer id){ return registroNoDetalladoRepository.findById(id);}
    public RegistroNoDetallado createRegistro(RegistroNoDetallado comidas){ return registroNoDetalladoRepository.save(comidas);}
    public void deleteRegistro(Integer id) { registroNoDetalladoRepository.deleteById(id);}
    public RegistroNoDetallado updateRegistro(RegistroNoDetallado comidas) { return registroNoDetalladoRepository.save(comidas); }
}
