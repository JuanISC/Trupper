package com.test.Trupper.service;

import com.test.Trupper.model.Orden;
import com.test.Trupper.model.Sucursal;
import com.test.Trupper.repository.RepositoryOrden;
import com.test.Trupper.repository.RepositorySucursal;
import com.test.Trupper.request.RequestOrdenCompra;
import com.test.Trupper.request.RequestProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class OrdenCompraService {

    @Autowired
    private RepositoryOrden repositoryOrden;

    @Autowired
    private SucursalService sucursalService;



    public void saveOrdenService(RequestOrdenCompra ordenCompra){
        Sucursal sucursal=sucursalService.getByName(ordenCompra.getNombreSucursal());
        System.out.print(sucursal);

        if(sucursal!=null) {
            List<RequestProductos> productos = ordenCompra.getListProductos();

            Orden orden = new Orden();
            orden.setFecha(LocalDate.now());
            orden.setTotal(new BigDecimal(121212));
            orden.setSucursal(sucursal);
            repositoryOrden.save(orden);
        }

    }

    public Orden getOrdenCompraById(Integer id ){
        Optional<Orden> ordenOpt =repositoryOrden.findById(id);
        if(ordenOpt.isPresent()){
            return ordenOpt.get();
        }

        //else htrow new MyNoFoundEx
        return null;
    }

}
