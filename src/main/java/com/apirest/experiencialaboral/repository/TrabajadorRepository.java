package com.apirest.experiencialaboral.repository;

import com.apirest.experiencialaboral.model.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabajadorRepository extends JpaRepository<Trabajador, Integer> {
}
