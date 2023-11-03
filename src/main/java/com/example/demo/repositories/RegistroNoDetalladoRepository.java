package com.example.demo.repositories;
import com.example.demo.models.RegistroNoDetallado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroNoDetalladoRepository extends JpaRepository<RegistroNoDetallado, Integer> {

}