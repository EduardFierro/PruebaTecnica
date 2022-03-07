package com.prueba.tecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.entity.Museos;
import com.prueba.tecnica.exception.ModelNotFoundException;
import com.prueba.tecnica.service.IMuseoService;



@RestController
@RequestMapping("/museo")
@CrossOrigin
public class MuseosController {
	
	@Autowired
	private IMuseoService service;
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardar (@Validated @RequestBody Museos museo) throws Exception {
		service.guardar(museo);
		return new ResponseEntity<Museos>(museo, HttpStatus.CREATED);
		
			
	}
	
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<Object>eliminar(@PathVariable int id) throws ModelNotFoundException{
		service.eliminar(id);
		return new ResponseEntity<Object>("", HttpStatus.NO_CONTENT);
		
	}
	@GetMapping("/museosciudad/{ciudad}")
	public ResponseEntity<List<Museos>> museosciudad(@PathVariable String ciudad) throws ModelNotFoundException {
		List<Museos> list = service.museosciudad(ciudad);
		return new ResponseEntity(list, HttpStatus.OK);
	}
	
}
