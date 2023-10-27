package com.example.demo.models;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "tanque_gasolinas")
public class TanqueGasolinas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;
    private Integer id_tipo_gasolinas;
    private Double capacidad;
    private Double nivel_actual;
    private Date created_at = new Date();
    @Column( nullable = true)
    private Date updated_at;

}