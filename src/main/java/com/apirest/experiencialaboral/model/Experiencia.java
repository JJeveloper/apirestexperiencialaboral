package com.apirest.experiencialaboral.model;

import jakarta.persistence.*;

@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String empresa;

    private String cargo;

    private  String funciones;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trabajador")
    private Trabajador trabajador;

    public Experiencia(){
    }

    public Experiencia(Integer id, String empresa, String cargo, String funciones, Trabajador trabajador) {
        this.id = id;
        this.empresa = empresa;
        this.cargo = cargo;
        this.funciones = funciones;
        this.trabajador = trabajador;
    }

    public Experiencia(String empresa, String cargo, String funciones, Trabajador trabajador) {
        this.empresa = empresa;
        this.cargo = cargo;
        this.funciones = funciones;
        this.trabajador = trabajador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }
}
