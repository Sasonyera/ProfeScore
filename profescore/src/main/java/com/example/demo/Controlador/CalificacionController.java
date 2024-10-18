package com.example.demo.Controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Entidades.Calificacion;
import com.example.demo.Servicios.CalificacionService;

import java.util.List;


@Controller
public class CalificacionController {

    @Autowired
    private CalificacionService calificacionService;

    @GetMapping("/ver-datos")
    public String verDatos(Model model) {
        List<Calificacion> calificaciones = calificacionService.obtenerTodasLasCalificaciones();
        model.addAttribute("calificaciones", calificaciones);
        

        return "tabla-calificaciones";
    }
}
