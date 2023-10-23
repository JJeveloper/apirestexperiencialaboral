package com.apirest.experiencialaboral.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Trabajador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private  String nombre;

    private String apellidos;

    private int nacimiento;

    private String telefono;

    @OneToMany(mappedBy = "trabajador")
    private List<Experiencia> experiencia;

    public Trabajador() {
    }

    public Trabajador(Integer id, String nombre, String apellidos, int nacimiento, String telefono, List<Experiencia> experiencia) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.experiencia = experiencia;
    }

    public Trabajador(String nombre, String apellidos, int nacimiento, String telefono, List<Experiencia> experiencia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.experiencia = experiencia;
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
        return experiencia;
    }

    public void setExperiencia(List<Experiencia> experiencia) {
        this.experiencia = experiencia;
    }
}
