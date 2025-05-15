package com.test.Trupper.controller;

import com.test.Trupper.request.RequestOrdenCompra;
import com.test.Trupper.service.OrdenCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/compras")
public class OrdenCompraController {

    @Autowired
    private OrdenCompraService ordenCompraService;



    @GetMapping("")
    public String test(){
        return "Ok";
    }


    @PostMapping("/save")
    public void saveOrdenComprar(@RequestBody RequestOrdenCompra ordenCompra){

        ordenCompraService.saveOrdenService(ordenCompra);

    }


    @GetMapping("/byId/{id}")
    public void getById(@PathVariable Integer id){


    }

}
