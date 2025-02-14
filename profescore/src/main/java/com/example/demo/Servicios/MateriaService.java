package com.example.demo.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entidades.Materia;
import com.example.demo.Repository.MateriaRepository;


@Service
public class MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    public int obtenerMateriaIdPorNombre(String nombre) {
        Materia materia = materiaRepository.findByNombre(nombre);
        if (materia != null) {
            return materia.getId();
        } else {
            Materia nuevoMateria = new Materia();
            nuevoMateria.setNombre(nombre);
            materiaRepository.save(nuevoMateria);
            return nuevoMateria.getId();
        }
    }
}
