package com.apirest.experiencialaboral.controller;

import com.apirest.experiencialaboral.model.Experiencia;
import com.apirest.experiencialaboral.model.Trabajador;
import com.apirest.experiencialaboral.service.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {

        @Autowired
        private ExperienciaService experienciaService;

        @GetMapping
        public List<Experiencia> findAll(){
            return experienciaService.findAllExperiencia();
        }

        @GetMapping("/find/{id}")
        public ResponseEntity<?> findById(@PathVariable Integer id){
                Optional<Experiencia> experiencia = experienciaService.findByIdExperiencia(id);

                if (experiencia.isPresent()){
                        return new ResponseEntity<>(experiencia, HttpStatus.OK);
                }
                return ResponseEntity.notFound().build();
        }

        @PostMapping
        public ResponseEntity<Experiencia> create(@RequestBody Experiencia newExperiencia){
                Experiencia experiencia = experienciaService.createExteriencia(newExperiencia);
                return new ResponseEntity<>(experiencia, HttpStatus.CREATED);
        }

        @PutMapping("update/{id}")
        public ResponseEntity<Experiencia> updae(@PathVariable("id") Integer id, @RequestBody Experiencia upExperiencia){

                Optional<Experiencia> upExp = experienciaService.findByIdExperiencia(id);

                if (upExp.isEmpty()){
                        return ResponseEntity.notFound().build();
                }


                Experiencia experiencia = experienciaService.updateExperiencia(id,upExperiencia);
                return new ResponseEntity<>(experiencia, HttpStatus.OK);
        }

        @DeleteMapping("delete/{id}")
        public ResponseEntity<?> delete(@PathVariable("id") Integer id){

                Optional<Experiencia> upExp = experienciaService.findByIdExperiencia(id);

                if (id == null){
                        return ResponseEntity.notFound().build();
                }

                if (upExp.isEmpty()){
                        return ResponseEntity.notFound().build();
                }

                experienciaService.deleteById(id);

                return ResponseEntity.badRequest().body("Se elimino correctamente");
        }
        

}
