package com.apirest.experiencialaboral.service;

import com.apirest.experiencialaboral.model.Experiencia;
import com.apirest.experiencialaboral.repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienciaService {

    @Autowired
    ExperienciaRepository experienciaRepository;

    public Experiencia createExteriencia(Experiencia experiencia){
        return experienciaRepository.save(experiencia);
    }

    public List<Experiencia> findAllExperiencia(){
        return experienciaRepository.findAll();
    }

    public Optional<Experiencia> findByIdExperiencia(Integer id){
        return experienciaRepository.findById(id);
    }

    public Experiencia updateExperiencia(Integer id, Experiencia experiencia){
        experiencia.setId(id);
        return experienciaRepository.save(experiencia);
    }

    public void deleteById(Integer id){
        experienciaRepository.deleteById(id);
    }

}
