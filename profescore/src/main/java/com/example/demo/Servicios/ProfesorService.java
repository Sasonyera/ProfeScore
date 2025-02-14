package com.example.demo.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entidades.Profesor;
import com.example.demo.Repository.ProfesorRepository;

@Service	
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    public int obtenerProfesorIdPorNombre(String nombre) {
        Profesor profesor = profesorRepository.findByNombre(nombre);
        if (profesor != null) {
            return profesor.getId();
        } else {
            Profesor nuevoProfesor = new Profesor();
            nuevoProfesor.setNombre(nombre);
            profesorRepository.save(nuevoProfesor);
            return nuevoProfesor.getId();
        }
    }
}
