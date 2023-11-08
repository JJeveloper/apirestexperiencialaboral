package com.apirest.experiencialaboral.service;

import com.apirest.experiencialaboral.model.Trabajador;
import com.apirest.experiencialaboral.repository.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class TrabajadorService {

    //Inyeccion de dependencia con @Autowired
    @Autowired
    TrabajadorRepository trabajadorRepository;

    //crear trabajador
    public Trabajador createTrabajador(Trabajador trabajador) {
        return trabajadorRepository.save(trabajador);
    }

    //obtener todos los trabajadores
    public List<Trabajador> findAllTrabajador() {
        return trabajadorRepository.findAll();
    }

    //obtener trabajador por id
    public Optional<Trabajador> findByIdTrabajador(Integer id) {
        return trabajadorRepository.findById(id);
    }


    //Actualizar trabajador
    public Trabajador updateTrabajador(Integer id, Trabajador trabajador) {
        trabajador.setId(id);
        trabajador.setNombre(trabajador.getNombre());
        trabajador.setApellidos(trabajador.getApellidos());
        trabajador.setNacimiento(trabajador.getNacimiento());
        trabajador.setTelefono(trabajador.getTelefono());
        return trabajadorRepository.save(trabajador);
    }

    //Eliminar trabajador
    public void deleteById(Integer id) {

        trabajadorRepository.deleteById(id);
    }

}
