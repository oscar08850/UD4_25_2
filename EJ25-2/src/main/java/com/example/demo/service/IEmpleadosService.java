package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Empleados;

public interface IEmpleadosService {

	// Metodos del CRUD

	public List<Empleados> listarEmpleados(); // Listar All

	public Empleados crearEmpleado(Empleados empleados); // CREATE

	public Empleados leerEmpleadoByDni(String dni); // READ

	public Empleados actualizarEmpleado(Empleados empleado); // UPDATE

	public void borrarEmpleadoByDni(String dni);// DELETE

}