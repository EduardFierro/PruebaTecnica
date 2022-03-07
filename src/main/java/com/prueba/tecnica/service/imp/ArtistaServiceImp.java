package com.prueba.tecnica.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.tecnica.entity.Artistas;
import com.prueba.tecnica.exception.ModelNotFoundException;
import com.prueba.tecnica.repo.IArtistaRepo;
import com.prueba.tecnica.service.IArtistaService;



@Service
public class ArtistaServiceImp implements IArtistaService{
	
	@Autowired
	private IArtistaRepo repo;
	
	List<Artistas> artistas = new ArrayList<Artistas>();
	
	public void guardar(Artistas artista) throws Exception {

		this.repo.save(artista);
	}
	
	public void eliminar(int id) throws ModelNotFoundException {
		this.repo.delete(this.buscarId(id));
	}

	@Override
	public Artistas buscarId(int id) throws ModelNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
