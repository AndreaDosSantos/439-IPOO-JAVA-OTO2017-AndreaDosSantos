package com.AndreaDosSantos.ipoo.CasoReservaDePasajes.Otros;

import java.util.Date;

public class Reserva {
	private int id;
	private Date fechaHoraRealizacion;
	private Date fechaPago;
	private Date fechaExpiracion;
	
	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reserva(int id, Date fechaHoraRealizacion, Date fechaPago, Date fechaExpiracion) {
		super();
		this.id = id;
		this.fechaHoraRealizacion = fechaHoraRealizacion;
		this.fechaPago = fechaPago;
		this.fechaExpiracion = fechaExpiracion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaHoraRealizacion() {
		return fechaHoraRealizacion;
	}

	public void setFechaHoraRealizacion(Date fechaHoraRealizacion) {
		this.fechaHoraRealizacion = fechaHoraRealizacion;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}
	
	
}
