package com.apirest.experiencialaboral.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trabajador")
public class Trabajador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private  String nombre;

    private String apellidos;

    private int nacimiento;

    private String telefono;

    @OneToMany(mappedBy = "trabajador", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private List<Experiencia> experienciaList = new ArrayList<>();

    public Trabajador() {
    }

    public Trabajador(Integer id, String nombre, String apellidos, int nacimiento, String telefono, List<Experiencia> experienciaList) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.experienciaList = experienciaList;
    }

    public Trabajador(String nombre, String apellidos, int nacimiento, String telefono, List<Experiencia> experiencia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.experienciaList = experiencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Experiencia> getExperiencia() {
        return experienciaList;
    }

    public void setExperiencia(List<Experiencia> experiencia) {
        this.experienciaList = experiencia;
    }
}
