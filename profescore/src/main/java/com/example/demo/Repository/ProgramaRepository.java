package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entidades.Programa;

public interface ProgramaRepository extends JpaRepository<Programa, Integer> {
    Programa findByNombre(String nombre);
}
