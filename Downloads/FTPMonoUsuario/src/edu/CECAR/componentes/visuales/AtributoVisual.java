/*
 * Clase: AtributoVisual
 *
 * Version: 1.0
 *
 * Fecha: 2014-08-03
 *
 * Autor: Ing. Jhon Jaime Mendez
 *
 * Copyrigth: JAsoft
 */


package edu.CECAR.componentes.visuales;

/**
 * Clase que encapsula la información grafica de las GUIS
 */

import java.awt.Color;

public abstract class AtributoVisual {
	
	private static Color color = new Color(58,69,96);

	public static Color getColor() {
		return color;
	}
	
	

}
