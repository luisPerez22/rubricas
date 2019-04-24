package edu.CECAR.objetos;

import java.io.Serializable;

public class ObjetoFTP implements Serializable {

        //para verificar que el objeto fue el que originalmente se establecio y no es de otro tipo
	private static final long serialVersionUID = 103L;
	
	private String nombreArchivo;
	
	private byte[] bytesArchivo;

	public ObjetoFTP(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public byte[] getBytesArchivo() {
		return bytesArchivo;
	}

	public void setBytesArchivo(byte[] bytesArchivo) {
		this.bytesArchivo = bytesArchivo;
	}


}
