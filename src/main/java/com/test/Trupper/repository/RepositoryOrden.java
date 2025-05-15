package com.test.Trupper.repository;

import com.test.Trupper.model.Orden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryOrden extends JpaRepository<Orden, Integer> {



}
