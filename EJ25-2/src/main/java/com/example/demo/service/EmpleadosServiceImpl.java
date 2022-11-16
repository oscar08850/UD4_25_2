package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadosDAO;
import com.example.demo.dto.Empleados;

@Service
public class EmpleadosServiceImpl implements IEmpleadosService{
	
	//Utilizamos los metodos de la interface IEmpleadoDAO, es como si instanciaramos.
	@Autowired
	IEmpleadosDAO iEmpleadoDAO;
	
	@Override
	public List<Empleados> listarEmpleados() {
		return iEmpleadoDAO.findAll();
	}
	
	@Override
	public Empleados crearEmpleado(Empleados empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleados leerEmpleadoByDni(String dni) {
		List<Empleados> aux = iEmpleadoDAO.findAll();
		for (Empleados empleado : aux) {
			if(empleado.getDni().equals(dni)) {
				return empleado;
			}
		}
		return null;
	}


	@Override
	public Empleados actualizarEmpleado(Empleados empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void borrarEmpleadoByDni(String dni) {
		List<Empleados> aux = iEmpleadoDAO.findAll();
		for (Empleados empleado : aux) {
			if(empleado.getDni().equals(dni)) {
				iEmpleadoDAO.delete(empleado);
			}
		}
	}

}