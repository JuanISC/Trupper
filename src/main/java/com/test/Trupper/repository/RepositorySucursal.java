package com.test.Trupper.repository;

import com.test.Trupper.model.Orden;
import com.test.Trupper.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepositorySucursal extends JpaRepository<Sucursal, Integer> {

    Optional<Sucursal> findByNombre(String nombre);





}
