package com.prueba.tecnica.service;

import com.prueba.tecnica.entity.Artistas;
import com.prueba.tecnica.exception.ModelNotFoundException;




public interface IArtistaService {
	
	public Artistas buscarId(int id) throws ModelNotFoundException;

	public void guardar(Artistas artista) throws Exception;
	
	public void eliminar(int id) throws ModelNotFoundException;
}
