package com.test.Trupper.request;
import lombok.Data;

import java.util.List;

@Data
public class RequestOrdenCompra {

    private String nombreSucursal;

    private List<RequestProductos> listProductos;

}
