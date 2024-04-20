package com.umg.umg.services;

import com.umg.umg.entities.Estudiante;

import java.util.List;

public interface EstudianteService {
    public List<Estudiante> listar();
    public Estudiante buscar(Long id);
    public void Crear(Estudiante estudiante);
}
