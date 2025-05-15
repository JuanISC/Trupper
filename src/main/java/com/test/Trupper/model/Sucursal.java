package com.test.Trupper.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sucursalId;

    @Column(nullable = false)
    private String nombre;


    @OneToMany(mappedBy="sucursal")
    private List<Orden> listOrdenes;

}

