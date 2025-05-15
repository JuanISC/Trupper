package com.test.Trupper.service;

import com.test.Trupper.model.Sucursal;
import com.test.Trupper.repository.RepositoryOrden;
import com.test.Trupper.repository.RepositorySucursal;
import com.test.Trupper.request.RequestOrdenCompra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SucursalService {

    @Autowired
    private RepositorySucursal repository;

    public Sucursal saveSucursal(Sucursal sucursal){
        return repository.save(sucursal);
    }


    public Sucursal getByName(String name){
       Optional<Sucursal> sucursalOpt= repository.findByNombre(name);
       if(sucursalOpt.isPresent()){
           return sucursalOpt.get();
       }
       return null;
    }
}
