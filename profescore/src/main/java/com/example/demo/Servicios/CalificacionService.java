package com.example.demo.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entidades.Calificacion;
import com.example.demo.Repository.CalificacionRepository;

import java.util.List;

@Service
public class CalificacionService {

    @Autowired
    private CalificacionRepository calificacionRepository;

    public List<Calificacion> obtenerTodasLasCalificaciones() {
        return calificacionRepository.findAll();
    }
}
