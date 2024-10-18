package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entidades.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {
    Profesor findByNombre(String nombre);
}
