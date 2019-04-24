/*
 * Clase: Cliente
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
 * Cliente FTP
 */

import java.io.FileOutputStream;

import edu.CECAR.componentes.comunicaciones.SocketObjeto;
import edu.CECAR.objetos.ObjetoFTP;

final public class Cliente {

	public static void main(String[] args) {

		SocketObjeto socketObjeto = new SocketObjeto("127.0.0.1", 7000);

		try {

			//Se configura para descargar el primer archivo
			ObjetoFTP objetoFTP = new ObjetoFTP("Desert.jpg");

			// Se envia la petición del primer Archivo a descargar
			socketObjeto.getSalida().writeObject(objetoFTP);

			Object object = socketObjeto.getEntrada().readObject();

			crearArchivoDescargado(object);
			
			System.out.println("Archivo " + objetoFTP.getNombreArchivo() + " descargado");
			
			
			//Se configura para descargar el segundo archivo
			objetoFTP = new ObjetoFTP("Chrysanthemum.jpg");

			// Se envia la petición del primer Archivo a descargar
			socketObjeto.getSalida().writeObject(objetoFTP);

			object = socketObjeto.getEntrada().readObject();

			crearArchivoDescargado(object);
			
			System.out.println("Archivo " + objetoFTP.getNombreArchivo() + " descargado");
			
			
			//Se configura para descargar el segundo archivo
			objetoFTP = new ObjetoFTP("Koala.jpg");

			// Se envia la petición del primer Archivo a descargar
			socketObjeto.getSalida().writeObject(objetoFTP);

			object = socketObjeto.getEntrada().readObject();

			crearArchivoDescargado(object);
			
			System.out.println("Archivo " + objetoFTP.getNombreArchivo() + " descargado");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void crearArchivoDescargado(Object object) throws Exception {

		ObjetoFTP objetoFTP = (ObjetoFTP) object;

		FileOutputStream fileOutputStream = new FileOutputStream("Descargas/"
				+ objetoFTP.getNombreArchivo());

		fileOutputStream.write(objetoFTP.getBytesArchivo());

		fileOutputStream.close();

	}

}
