package com.test.Trupper.repository;

import com.test.Trupper.model.Orden;
import com.test.Trupper.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProducto extends JpaRepository<Producto, Integer> {



}
