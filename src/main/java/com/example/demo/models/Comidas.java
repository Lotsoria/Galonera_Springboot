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
@Table(name = "comidas")
public class Comidas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;
    private String nombre;
    private Double costo;
    private Double venta;
    @Nullable
    private String descripcion;
    private Integer estado;

    @Column(nullable = true)
    private Date created_at;
    @Column( nullable = true)
    private Date updated_at;
    protected void onCreate() {
        created_at = new Date();
    }
}
