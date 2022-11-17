package com.example.demo.dto;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "empleados")

public class Empleados {

	// Atributos de la entidad Empleados
	@Id
	private String dni;
	private String nombre;
	private String apellidos;

	@ManyToOne
	@JoinColumn(name = "departamento_id")
	private Departamentos departamento_id;

	// Constructores

	public Empleados() {

	}

	public Empleados(String dni, String nombre, String apellidos, Departamentos departamento) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamento_id = departamento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Departamentos getDepartamento() {
		return departamento_id;
	}

	public void setDepartamento(Departamentos departamento) {
		this.departamento_id = departamento;
	}

	@Override
	public String toString() {
		return "Empleados [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", departamento="
				+ departamento_id + "]";
	}

}