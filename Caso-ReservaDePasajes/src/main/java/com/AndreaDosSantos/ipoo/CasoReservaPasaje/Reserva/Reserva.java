package com.AndreaDosSantos.ipoo.CasoReservaPasaje.Reserva;

import java.util.Date;

public class Reserva {
	
	private Date fechaHoraRealizacion;
	private Date fechaHoraPago;
	private Date fechaHoraExpiracion;
	
	public Reserva(){
		
	}

	public Reserva(Date fechaHoraRealizacion, Date fechaHoraPago, Date fechaHoraExpiracion) {
		super();
		this.fechaHoraRealizacion = fechaHoraRealizacion;
		this.fechaHoraPago = fechaHoraPago;
		this.fechaHoraExpiracion = fechaHoraExpiracion;
	}

	public Date getFechaHoraRealizacion() {
		return fechaHoraRealizacion;
	}

	public void setFechaHoraRealizacion(Date fechaHoraRealizacion) {
		this.fechaHoraRealizacion = fechaHoraRealizacion;
	}

	public Date getFechaHoraPago() {
		return fechaHoraPago;
	}

	public void setFechaHoraPago(Date fechaHoraPago) {
		this.fechaHoraPago = fechaHoraPago;
	}

	public Date getFechaHoraExpiracion() {
		return fechaHoraExpiracion;
	}

	public void setFechaHoraExpiracion(Date fechaHoraExpiracion) {
		this.fechaHoraExpiracion = fechaHoraExpiracion;
	}

	
}
