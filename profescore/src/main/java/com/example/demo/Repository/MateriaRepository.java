package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entidades.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Integer> {
    Materia findByNombre(String nombre);
}
