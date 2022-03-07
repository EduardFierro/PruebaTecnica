package com.prueba.tecnica.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.tecnica.entity.Obras;
import com.prueba.tecnica.exception.ModelNotFoundException;
import com.prueba.tecnica.repo.IObrasRepo;
import com.prueba.tecnica.service.IObraService;

@Service
public class ObraServiceImp implements IObraService{
	
	@Autowired
	private IObrasRepo repo;
	
	List<Obras> obras = new ArrayList<Obras>();
	
	public List<Obras>consultar(int artista_id){
		return this.repo.obrasporartistaencolombia(artista_id);
	}
	
	public Obras guardar(Obras obra) throws Exception {
		
		this.repo.save(obra);
		return obra;
	}
	
	public void eliminar(int id) throws ModelNotFoundException {
		this.repo.delete(this.buscarId(id));
	}

	public Obras buscarId(int id) throws ModelNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
