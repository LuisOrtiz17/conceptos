package com.softtek;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("algoritmoOrdenamiento2")
//@Component
//@Qualifier("quick")
public class AlgoritmoOrdenamientoQuickSort implements AlgoritmoOrdenamiento{

	@Override
	public String OrdenarProducto() {
		System.out.println("ordenamiento Quick Sort");
		return null;
	}

}
