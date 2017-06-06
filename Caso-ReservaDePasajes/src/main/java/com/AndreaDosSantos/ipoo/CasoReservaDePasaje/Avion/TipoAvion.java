package com.AndreaDosSantos.ipoo.CasoReservaDePasaje.Avion;

public class TipoAvion {
	private int id;
	private String descripcion;
	
	public TipoAvion (){

	}

	public TipoAvion(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
