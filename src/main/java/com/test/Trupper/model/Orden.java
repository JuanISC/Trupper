package com.test.Trupper.model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ordenId;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false)
    private BigDecimal total;

    @ManyToOne(fetch= FetchType.LAZY)
    private Sucursal sucursal;

    @OneToMany(mappedBy="orden")
    private List<Producto> listProductos;



}

