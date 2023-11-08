package com.apirest.experiencialaboral.controller;

import com.apirest.experiencialaboral.model.Trabajador;
import com.apirest.experiencialaboral.service.TrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trabajador")
public class TrabajadorController {

    @Autowired
    private TrabajadorService trabajadorService;

    @GetMapping
    public List<Trabajador> findAll() {
        return trabajadorService.findAllTrabajador();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){

        Optional<Trabajador> trabajador = trabajadorService.findByIdTrabajador(id);

        if (trabajador.isPresent()) {
            return new ResponseEntity<>(trabajador, HttpStatus.OK);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Trabajador> create(@RequestBody Trabajador newTrabajador) {
        Trabajador trabajador = trabajadorService.createTrabajador(newTrabajador);
        return new ResponseEntity<>(trabajador, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Trabajador> update(@PathVariable("id") Integer id, @RequestBody Trabajador upTrabajador) {

        Optional<Trabajador> upTra = trabajadorService.findByIdTrabajador(id);

        if (upTra.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        /*upTrabajador.setId(id);
        trabajadorService.createTrabajador(upTrabajador);*/

        Trabajador trabajador = trabajadorService.updateTrabajador(id, upTrabajador);
        return new ResponseEntity<>(trabajador, HttpStatus.OK);

    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){

        Optional<Trabajador> delTra = trabajadorService.findByIdTrabajador(id);

        if (id == null){
            return ResponseEntity.notFound().build();
        }

        if (delTra.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        trabajadorService.deleteById(id);

        return ResponseEntity.badRequest().body("El trabajador se elimino correctamente");
    }


}


