package com.AndreaDosSantos.ipoo.CasoReservaDePasaje.Avion;

public class Avion {
	private int id;
	private int tama�o;
	private int cantidadAsientos;
	private int cantidadCategoriaAsiento;
	private String autonomia;
	
	public Avion (){

	}

	public Avion(int id, int tama�o, int cantidadAsientos, int cantidadCategoriaAsiento, String autonomia) {
		super();
		this.id = id;
		this.tama�o = tama�o;
		this.cantidadAsientos = cantidadAsientos;
		this.cantidadCategoriaAsiento = cantidadCategoriaAsiento;
		this.autonomia = autonomia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	public int getCantidadAsientos() {
		return cantidadAsientos;
	}

	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}

	public int getCantidadCategoriaAsiento() {
		return cantidadCategoriaAsiento;
	}

	public void setCantidadCategoriaAsiento(int cantidadCategoriaAsiento) {
		this.cantidadCategoriaAsiento = cantidadCategoriaAsiento;
	}

	public String getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(String autonomia) {
		this.autonomia = autonomia;
	}
	
	
}
