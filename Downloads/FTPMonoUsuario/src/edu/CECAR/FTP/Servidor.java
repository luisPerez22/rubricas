/*
 * Clase: Servidor
 *
 * Version: 1.0
 *
 * Fecha: 2014-10-10
 *
 * Autor: Ing. Jhon Jaime Mendez
 *
 * Copyrigth: JAsoft
 */


package edu.CECAR.FTP;

/**
 * Servidor FTP
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import edu.CECAR.componentes.comunicaciones.ServerSocketObjeto;
import edu.CECAR.objetos.ObjetoFTP;

final public class Servidor {

	public Servidor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		try {

			ServerSocketObjeto serverSocketObjeto = new ServerSocketObjeto(7000);
			
			System.out.println("Servidor de FTP montado");

			//Se reciben n peticiones
			while (true) {

				Object object = serverSocketObjeto.getEntrada().readObject();

				ObjetoFTP objetoFTP = (ObjetoFTP)object;

				File file = new File("Archivos/" + objetoFTP.getNombreArchivo());

				FileInputStream fileInputStream = new FileInputStream(file);

				byte[] bytes = new byte[(int)file.length()];

				int numerosBytesLeidos = fileInputStream.read(bytes);

				fileInputStream.close();

				objetoFTP.setBytesArchivo(bytes);

				serverSocketObjeto.getSalida().writeObject(objetoFTP);
				
			
			}
			
			


		} catch (ClassNotFoundException | IOException e) {
		
			System.out.println("Servidor de FTP desmontado");
		}


	}

}
