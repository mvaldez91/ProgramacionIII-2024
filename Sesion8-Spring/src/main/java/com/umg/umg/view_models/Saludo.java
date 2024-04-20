package com.umg.umg.view_models;

public class Saludo {
    private String nombre;
    private Integer edad;

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    public Integer getEdad(){
        return this.edad;
    }
}
