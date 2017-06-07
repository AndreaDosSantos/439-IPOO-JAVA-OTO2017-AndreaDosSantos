package com.AndreaDosSantos.ipoo.CasoReservaDePasajes.Otros;

import java.util.Date;

public class LugarDeCobro {
	private int id;
	private String nombre;
	private String direccion;
	private String telefono;
	private String horarioAtencion;
	
	public LugarDeCobro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LugarDeCobro(int id, String nombre, String direccion, String telefono, String horarioAtencion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.horarioAtencion = horarioAtencion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getHorarioAtencion() {
		return horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}
	
	
	

}
