package com.Isaac.Dimitry.Clases;

import com.Isaac.Dimitry.Exeptions.ComentariosException;

public class Comentarios {
	
	private Usuari creador;
	private String comentari;
	private boolean validacion = false;
	
	public Comentarios (Usuari creador, String comentari) throws ComentariosException{// si no especificamos que es publico solo pueden llamar a la funcion este objeto y sus "hiso"
			setCreador(creador);
			setComentari(comentari); 
	}
	
	public Usuari getCreador() {
		return creador;
	}
	public void setCreador(Usuari creador) throws ComentariosException {
		if (creador == null) {
			throw new ComentariosException("Introduce el nombre del creador del comentario");
		}
		this.creador = creador;
	}
	public String getComentari() {
		return comentari;
	}
	public void setComentari(String comentari) throws ComentariosException {
		if (comentari == null || comentari == "" ) {
			throw new ComentariosException("El comentario no puede estar vacio");
		}
		this.comentari = comentari;
	}
	
	public boolean validar (Boolean v) {
		return v = true; 
	}
	
}
/*
*Falta en terminos generale la redundancia de datos
*El tratamineto de errores
*/