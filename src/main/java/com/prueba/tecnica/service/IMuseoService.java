package com.prueba.tecnica.service;

import java.util.List;

import com.prueba.tecnica.entity.Museos;
import com.prueba.tecnica.exception.ModelNotFoundException;

public interface IMuseoService {
	
	public Museos buscarId(int id) throws ModelNotFoundException;

	public void guardar(Museos museo) throws Exception;
	
	public void eliminar(int id) throws ModelNotFoundException;
	
	public List<Museos> museosciudad(String ciudad) throws ModelNotFoundException;
		

}
