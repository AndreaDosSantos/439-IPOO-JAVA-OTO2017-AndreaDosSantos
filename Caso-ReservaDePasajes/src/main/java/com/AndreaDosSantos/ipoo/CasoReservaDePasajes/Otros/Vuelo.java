package com.AndreaDosSantos.ipoo.CasoReservaDePasajes.Otros;

import java.util.Date;

public class Vuelo {
	private int id;
	private Date fechaVuelo;
	private Date fechaLlegada;
	private String origen;
	private String destino;
	
	public Vuelo(int id, Date fechaVuelo, Date fechaLlegada, String origen, String destino) {
		super();
		this.id = id;
		this.fechaVuelo = fechaVuelo;
		this.fechaLlegada = fechaLlegada;
		this.origen = origen;
		this.destino = destino;
	}
	
	public Vuelo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(Date fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public Date getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	
	
	
}
