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


import com.prueba.tecnica.entity.Obras;
import com.prueba.tecnica.exception.ModelNotFoundException;
import com.prueba.tecnica.service.IObraService;

@RestController
@RequestMapping("/obra")
@CrossOrigin
public class ObrasController {
	
	@Autowired
	private IObraService service;
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardar (@Validated @RequestBody Obras obras) throws Exception {
		service.guardar(obras);
		return new ResponseEntity<Obras>(obras, HttpStatus.CREATED);
		
			
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Object>eliminar(@PathVariable int id) throws ModelNotFoundException{
		service.eliminar(id);
		return new ResponseEntity<Object>("", HttpStatus.NO_CONTENT);

	}
	
	@GetMapping("/consultar/{id}")
	public ResponseEntity<?>consultar(@PathVariable int id){
		return new ResponseEntity<List<Obras>>(service.consultar(id),HttpStatus.OK);
	}
	
	

}
