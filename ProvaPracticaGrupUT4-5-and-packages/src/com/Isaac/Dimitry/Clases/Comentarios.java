package com.Isaac.Dimitry.Clases;

public class Comentarios {
	
	private Usuari creador;
	private String comentari;
	private boolean validacion = false;
	
	public Comentarios (Usuari creador, String comentari){// si no especificamos que es publico solo pueden llamar a la funcion este objeto y sus "hiso"
		setCreador(creador);
		setComentari(comentari);
	}
	
	public Usuari getCreador() {
		return creador;
	}
	public void setCreador(Usuari creador) {
		this.creador = creador;
	}
	public String getComentari() {
		return comentari;
	}
	public void setComentari(String comentari) {
		this.comentari = comentari;
	}
	
	public boolean validar (Boolean v) {
		return v = true; 
	}
	
	
}
