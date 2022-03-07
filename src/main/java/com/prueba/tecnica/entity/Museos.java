package com.prueba.tecnica.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "museos")
public class Museos {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer museo_id;

	@Column(name = "nombre", length = 30, nullable = true)
	private String nombre;

	@Column(name = "pais", length = 30, nullable = true)
	private String pais;
	
	@Column(name = "ciudad", length = 30, nullable = true)
	private String ciudad;

	@Column(name = "direccion", length = 30, nullable = true)
	private String direccion;
	
	@ManyToMany(mappedBy = "museos")
	private List<Obras> obras;

	public Museos() {
	}
	

	public Museos(Integer museo_id, String nombre, String pais, String ciudad, String direccion) {
		super();
		this.museo_id = museo_id;
		this.nombre = nombre;
		this.pais = pais;
		this.ciudad = ciudad;
		this.direccion = direccion;
	}

	
	@JsonIgnore
	public List<Obras> getObras() {
		return obras;
	}


	public void setObras(List<Obras> obras) {
		this.obras = obras;
	}


	public Integer getMuseo_id() {
		return museo_id;
	}


	public void setMuseo_id(Integer museo_id) {
		this.museo_id = museo_id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	

	


	
	
	
}
