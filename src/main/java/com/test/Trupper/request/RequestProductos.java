package com.test.Trupper.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RequestProductos {

    private Integer idProduto;
    private String descripcion;
    private BigDecimal precio;



}
