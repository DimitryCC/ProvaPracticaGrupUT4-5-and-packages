package com.Isaac.Dimitry.Clases;

import java.util.ArrayList;
import com.Isaac.Dimitry.Exeptions.UsuariExeption;

public class Usuari {

	
	private String nombre;
	private ArrayList<Valoraciones> valor = new ArrayList<Valoraciones>();
	private ArrayList<Comentarios> comentariosEspacio = new ArrayList<Comentarios>();
	
	public Usuari (String nombre) throws UsuariExeption{// si no especificamos que es publico solo pueden llamar a la funcion este objeto y sus "hiso"
		setNombre(nombre);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) throws UsuariExeption {
		if (nombre == null) {
			throw new UsuariExeption("Introduce el nombre del usuario");
		}
		this.nombre = nombre;
	}
	
	public float getValor(ArrayList<Valoraciones> lista) {
		//Esto dara error hasta definir valoraciones.
		float media=0;
		for (int i = 0; i < lista.size(); i++) {
			media += lista.get(i).getValoracio();
			media = media/lista.size();
		}
		return media;
	}
	
	public void setValor(ArrayList<Valoraciones> valor) {
		this.valor = valor;
	}
	
	void getComentariosEspacio(ArrayList<Comentarios> comentariosEspacio) {
		for (int i = 0; i < comentariosEspacio.size(); i++) {
			System.out.println(comentariosEspacio.get(i).toString());
		}
	}

	public void setComentariosEspacio(ArrayList<Comentarios> comentariosEspacio) {
		this.comentariosEspacio = comentariosEspacio;
	}
	public String toString() {
		return "Usuari [nombre=" + nombre + ", valor=" + valor + ", comentariosEspacio=" + comentariosEspacio + "]";
	}
	
}
