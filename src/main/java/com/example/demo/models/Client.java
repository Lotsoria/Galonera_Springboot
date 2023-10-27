package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nit")
    private String nit;

    @Column(name = "presupuesto")
    private Double presupuesto;

    @Column(name = "id_user")
    private Integer id_user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nit='" + nit + '\'' +
                ", presupuesto=" + presupuesto +
                ", id_user=" + id_user +
                '}';
    }
}
