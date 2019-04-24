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
 * Componente reutilizable para la creación de GUI
 */

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class CrearJFrame extends AtributoVisual{
	
	private JFrame jframe;
	
	public CrearJFrame(String titulo, int ancho, int alto) {
		
		jframe = new JFrame(titulo);
		jframe.setSize(ancho, alto);
		jframe.setLocationRelativeTo(null);
		jframe.getContentPane().setBackground(getColor());
		jframe.setLayout(null);
		
		
	}
	
	public JTextField getJTextField(int posX, int posY, int ancho, int alto) {
		
		JTextField tResultado = new JTextField();
		tResultado.setBounds(posX, posY, ancho, alto);
		tResultado.setBorder(new BevelBorder(BevelBorder.RAISED));
		tResultado.setFont(new Font("Arial",Font.BOLD,14));
		getJframe().add(tResultado);
		
		return tResultado;
		
		
		
	}
	

	public JFrame getJframe() {
		return jframe;
	}
	
	public void mostrarJFrame() {
	
		jframe.setVisible(true);

	}
	

}
