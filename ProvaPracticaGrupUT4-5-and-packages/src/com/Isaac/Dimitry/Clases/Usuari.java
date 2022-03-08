package com.Isaac.Dimitry.Clases;

public class Usuari {

	
	private String nombre;
	
	
	public Usuari (String nombre){// si no especificamos que es publico solo pueden llamar a la funcion este objeto y sus "hiso"
		setNombre(nombre);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
