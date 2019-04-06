package com.softtek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//		AlgoritmoOrdenamiento algoOr = new AlgoritmoOrdenamientoQuickSort();
//		AlgoritmoOrdenamiento algoOr = (AlgoritmoOrdenamiento) applicationContext.getBean("algoritmoOrdenamiento");
//		ProductoServicio prodSer = new ProductoServicio(algoOr);
		ProductoServicio prodSer = (ProductoServicio) applicationContext.getBean("productoServicio");
		
		prodSer.odenarProductosServicios();

	}

}
