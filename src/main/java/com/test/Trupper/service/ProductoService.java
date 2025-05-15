package com.test.Trupper.service;

import com.test.Trupper.model.Producto;
import com.test.Trupper.model.Sucursal;
import com.test.Trupper.repository.RepositoryOrden;
import com.test.Trupper.repository.RepositoryProducto;
import com.test.Trupper.request.RequestOrdenCompra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private RepositoryProducto repositoryProducto;


    public Producto saveProducto(Producto producto){
        return repositoryProducto.save(producto);
    }

    public void updateProducto(Producto producto){
         repositoryProducto.save(producto);
    }

}
