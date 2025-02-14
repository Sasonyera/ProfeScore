package com.example.demo.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entidades.Programa;
import com.example.demo.Repository.ProgramaRepository;


@Service
public class ProgramaService {

    @Autowired
    private ProgramaRepository programaRepository;

    public int obtenerProgramaIdPorNombre(String nombre) {
        Programa programa = programaRepository.findByNombre(nombre);
        if (programa != null) {
            return programa.getId();
        } else {
            Programa nuevoPrograma = new Programa();
            nuevoPrograma.setNombre(nombre);
            programaRepository.save(nuevoPrograma);
            return nuevoPrograma.getId();
        }
    }
}
