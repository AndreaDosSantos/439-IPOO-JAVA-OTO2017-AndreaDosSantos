package com.AndreaDosSantos.ipoo.CasoReservaDePasajes.Pasaje;

public class Pasaje {
	private int id;
	private int precio;
	
	public Pasaje (){

	}

	public Pasaje(int id, int precio) {
		super();
		this.id = id;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
    
      
}


