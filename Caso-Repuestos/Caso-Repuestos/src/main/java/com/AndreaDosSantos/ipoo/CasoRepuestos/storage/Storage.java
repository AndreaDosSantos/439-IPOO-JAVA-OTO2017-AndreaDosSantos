package com.AndreaDosSantos.ipoo.CasoRepuestos.storage;

import com.AndreaDosSantos.ipoo.CasoRepuestos.cliente.Cliente;

public interface Storage {
	
	Cliente obtCliente(String tipoDoc, String nroDoc, String password);

}
