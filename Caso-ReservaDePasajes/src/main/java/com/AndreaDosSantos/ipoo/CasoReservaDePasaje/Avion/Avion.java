package com.AndreaDosSantos.ipoo.CasoReservaDePasaje.Avion;

public class Avion {
	private int id;
	private int tamaño;
	private int cantidadAsientos;
	private int cantidadCategoriaAsiento;
	private String autonomia;
	
	public Avion (){

	}

	public Avion(int id, int tamaño, int cantidadAsientos, int cantidadCategoriaAsiento, String autonomia) {
		super();
		this.id = id;
		this.tamaño = tamaño;
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

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
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
