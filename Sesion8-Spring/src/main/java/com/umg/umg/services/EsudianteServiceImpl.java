package com.umg.umg.services;

import com.umg.umg.entities.Estudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class EsudianteServiceImpl implements EstudianteService {
    private static AtomicLong sequence = new AtomicLong();
    private static List<Estudiante> lista = new ArrayList<Estudiante>(){{
        add(new Estudiante(sequence.incrementAndGet(),
                            "estudiante1",
                            "jalapa",
                            "carnet"
                ));
    }};
    @Override
    public List<Estudiante> listar() {
        return lista;
    }

    @Override
    public Estudiante buscar(Long id) {

        for (Estudiante e: lista){
            if (e.getId().equals(id)){
                return e;
            }
        }
        return null;
    }

    @Override
    public void Crear(Estudiante estudiante) {
        lista.add(new Estudiante(sequence.incrementAndGet(),
                                 estudiante.getNombre(),
                                 estudiante.getDireccion(),
                                 estudiante.getCarnet()
                ));
    }
}
