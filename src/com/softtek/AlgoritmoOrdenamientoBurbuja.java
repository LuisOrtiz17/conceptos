package com.softtek;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "algoritmoOrdenamiento")
//@Component
//@Qualifier("burbuja")
public class AlgoritmoOrdenamientoBurbuja implements AlgoritmoOrdenamiento{

	@Override
	public String OrdenarProducto() {
		System.out.println("ORDENAMIENTO BURBUJA");
		String cadena = "ORDENAMIENTO BURBUJA";
		return cadena;
	}

}
