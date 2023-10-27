package com.example.demo.repositories;
import com.example.demo.models.TanqueGasolinas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TanqueGasolinasRepository extends JpaRepository<TanqueGasolinas, Integer> {

}
