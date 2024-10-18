package com.example.demo.Entidades;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private int profesor_id;
    
    private int materia_id;
    
    private int programa_id;
    private String periodo;
    private Double nota_estudiante;
    private Double nota_director;
    private Double nota_autoevaluacion;
 
    private Double nota_definitiva;
    
    private LocalDateTime fecha_registro;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getProfesorId() {
		return profesor_id;
	}
	public void setProfesorId(int profesorId) {
		this.profesor_id = profesorId;
	}
	public int getMateriaId() {
		return materia_id;
	}
	public void setMateriaId(int materiaId) {
		this.materia_id = materiaId;
	}
	public int getProgramaId() {
		return programa_id;
	}
	public void setProgramaId(int programaId) {
		this.programa_id = programaId;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public int getProfesor_id() {
		return profesor_id;
	}
	public void setProfesor_id(int profesor_id) {
		this.profesor_id = profesor_id;
	}
	public int getMateria_id() {
		return materia_id;
	}
	public void setMateria_id(int materia_id) {
		this.materia_id = materia_id;
	}
	public int getPrograma_id() {
		return programa_id;
	}
	public void setPrograma_id(int programa_id) {
		this.programa_id = programa_id;
	}
	public Double getNota_estudiante() {
		return nota_estudiante;
	}
	public void setNota_estudiante(Double nota_estudiante) {
		this.nota_estudiante = nota_estudiante;
	}
	public Double getNota_director() {
		return nota_director;
	}
	public void setNota_director(Double nota_director) {
		this.nota_director = nota_director;
	}
	public Double getNota_autoevaluacion() {
		return nota_autoevaluacion;
	}
	public void setNota_autoevaluacion(Double nota_autoevaluacion) {
		this.nota_autoevaluacion = nota_autoevaluacion;
	}
	public Double getNota_definitiva() {
		return nota_definitiva;
	}
	public void setNota_definitiva(Double nota_definitiva) {
		this.nota_definitiva = nota_definitiva;
	}
	public LocalDateTime getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(LocalDateTime fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	

    // Getters y Setters
    
}
