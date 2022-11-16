package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDepartamentosDAO;
import com.example.demo.dto.Departamentos;

@Service
public class DepartamentoServiceImpl implements IDepartamentosService {

	@Autowired
	IDepartamentosDAO iDepartamentosDAO;

	@Override
	public List<Departamentos> listarDepartamentos() {
		return iDepartamentosDAO.findAll();
	}

	@Override
	public Departamentos crearDepartamento(Departamentos departamentos) {
		return iDepartamentosDAO.save(departamentos);
	}

	@Override
	public Departamentos leerDepartamento(Long id) {
		return iDepartamentosDAO.findById(id).get();
	}

	@Override
	public Departamentos actualizarDepartamento(Departamentos departamento) {
		return iDepartamentosDAO.save(departamento);
	}

	@Override
	public void borrarDepartamento(Long id) {
		iDepartamentosDAO.deleteById(id);
		
	}



}