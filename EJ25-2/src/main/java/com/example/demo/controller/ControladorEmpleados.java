package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Empleados;
import com.example.demo.service.EmpleadosServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorEmpleados {

	@Autowired
	EmpleadosServiceImpl empleadosServiceImpl;

	@GetMapping("/empleados")
	public List<Empleados> listarEmpleados() {
		return empleadosServiceImpl.listarEmpleados();
	}

	@PostMapping("/empleados")
	public Empleados crearEmpleado(@RequestBody Empleados empleado) {

		return empleadosServiceImpl.crearEmpleado(empleado);

	}

	@GetMapping("/empleados/{dni}")
	public Empleados leerEmpleado(@PathVariable(name = "dni") String dni) {

		Empleados empleado = new Empleados();

		empleado = empleadosServiceImpl.leerEmpleadoByDni(dni);

		System.out.println("Empleado con ese dni es: " + empleado);
		return empleado;
	}

	@PutMapping("/empleados/{dni}")
	public Empleados actualizarEmpleado(@PathVariable(name = "dni") String dni, @RequestBody Empleados empleado) {

		Empleados empleado_seleccionado = new Empleados();
		Empleados empleado_actualizado = new Empleados();

		empleado_seleccionado = empleadosServiceImpl.leerEmpleadoByDni(dni);

		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellidos(empleado.getApellidos());
		empleado_seleccionado.setDepartamento(empleado.getDepartamento());

		empleado_actualizado = empleadosServiceImpl.actualizarEmpleado(empleado_seleccionado);

		System.out.println("El empleado actualizado es: " + empleado_actualizado);

		return empleado_actualizado;
	}

	@DeleteMapping("/empleados/{dni}")
	public void borrarEmpleado(@PathVariable(name = "dni") String dni) {
		empleadosServiceImpl.borrarEmpleadoByDni(dni);
	}

}