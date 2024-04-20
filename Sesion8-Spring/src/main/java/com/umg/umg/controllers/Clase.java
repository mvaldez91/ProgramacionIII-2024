package com.umg.umg.controllers;

import com.umg.umg.view_models.Saludo;
import com.umg.umg.view_models.SaludoRecord;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clase")
public class Clase {

    @GetMapping
    public SaludoRecord Get(@RequestParam String nombre,
                            Integer edad){
        //Saludo saludo = new Saludo();
        //saludo.setNombre(nombre);
        //saludo.setEdad(edad);
        return new SaludoRecord(nombre, edad);
    }

    @PostMapping
    public String Post(@RequestParam(value="nombre", defaultValue = "Ninguno") String nombre,
                       @RequestParam(value="edad", defaultValue = "0") Integer edad){
        return "Hola desde POST " + nombre + " tu edad es " + edad.toString();
    }
}
