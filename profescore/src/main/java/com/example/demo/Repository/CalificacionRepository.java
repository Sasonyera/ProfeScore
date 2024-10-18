package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entidades.Calificacion;
public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {
    // Métodos adicionales si es necesario
}
