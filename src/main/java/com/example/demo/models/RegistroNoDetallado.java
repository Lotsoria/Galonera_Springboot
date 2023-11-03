package com.example.demo.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "registro_nodetallado")
public class RegistroNoDetallado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;
    private Integer id_clientes;
    private Integer id_tipo_pagos;
    private Date created_at = new Date();
    @Column( nullable = true)
    private Date updated_at;
}
