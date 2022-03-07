package com.prueba.tecnica.service;

import java.util.List;

import com.prueba.tecnica.entity.Obras;
import com.prueba.tecnica.exception.ModelNotFoundException;

public interface IObraService {
	
	public Obras buscarId(int id) throws ModelNotFoundException;

	public Obras guardar(Obras obras) throws Exception;
	
	public void eliminar(int id) throws ModelNotFoundException;
	
	public List<Obras>consultar(int artista_id);

}
