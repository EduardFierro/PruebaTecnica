package com.prueba.tecnica.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.tecnica.entity.Museos;
import com.prueba.tecnica.exception.ModelNotFoundException;
import com.prueba.tecnica.repo.IMuseosRepo;
import com.prueba.tecnica.service.IMuseoService;



@Service
public class MuseoServiceImp implements IMuseoService{
	
	@Autowired
	private IMuseosRepo repo;
	
	List<Museos> museos = new ArrayList<Museos>();
	
	public void guardar(Museos museo) throws Exception {
		
		this.repo.save(museo);
	}
	
	public void eliminar(int id) throws ModelNotFoundException {
		this.repo.delete(this.buscarId(id));
	}

	public Museos buscarId(int id) throws ModelNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Museos> museosciudad(String ciudad) throws ModelNotFoundException {
		return this.repo.museosporciudad(ciudad);
	}

}
