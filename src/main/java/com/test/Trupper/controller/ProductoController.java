package com.test.Trupper.controller;

import com.test.Trupper.model.Producto;
import com.test.Trupper.request.RequestOrdenCompra;
import com.test.Trupper.service.OrdenCompraService;
import com.test.Trupper.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("")
    public String test(){
        return "Ok";
    }

    @PutMapping("/save")
    public void updateProducto(@RequestBody Producto producto){

        productoService.updateProducto(producto);

    }


}
