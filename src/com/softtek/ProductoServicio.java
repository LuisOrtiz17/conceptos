package com.softtek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//con esta anotacion se indica que es un BEAN
//@Component
@Service
public class ProductoServicio {
	
	@Autowired
	@Qualifier("algoritmoOrdenamiento2")
	private AlgoritmoOrdenamiento algoritmoOrdenamiento;
	
	
	
	public ProductoServicio(AlgoritmoOrdenamiento algoritmoOrdenamiento) {
		this.algoritmoOrdenamiento = algoritmoOrdenamiento;
	}
	
	//En el atributo name de la propiedad del BEAN se coloca el nombre del parametro que recibe el metodo 
//	public void setAlgoritmoOrdenamiento(AlgoritmoOrdenamiento algoritmoOrdenamiento) {
//		this.algoritmoOrdenamiento = algoritmoOrdenamiento;
//	}



	public void odenarProductosServicios() {
		this.algoritmoOrdenamiento.OrdenarProducto();
	}

}
