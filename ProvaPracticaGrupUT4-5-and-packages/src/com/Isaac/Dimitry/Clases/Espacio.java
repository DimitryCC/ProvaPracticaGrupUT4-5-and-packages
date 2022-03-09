package com.Isaac.Dimitry.Clases;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.Isaac.Dimitry.Exeptions.EspacioExeption;

public class Espacio {
	//Atributos
	private String nom;
	private String detalles;
	private ArrayList<Valoraciones> valor = new ArrayList<Valoraciones>();
	private ArrayList<Comentarios> comentariosEspacio = new ArrayList<Comentarios>();
	private String[] Servicios;
	//Constructor
	public Espacio(String nom, String detalles, String[] servicios) throws EspacioExeption {
		//Usaremos en este caso los seters para generar el espacio ya quesi solo deveremos especificar las exepciones en estos
		setNom(nom);
		setDetalles(detalles);
		setServicios(servicios);
		//faltan seters ya que estos no se deven inicializar ya que teoricamente se inicializaran durante el proceso de ejecucion esdecir los iniciara el programa
	}
	//Geters and Seters
	void setNom(String nom) throws EspacioExeption {
		if (nom.length()==0) {
			throw new EspacioExeption("El nombre de un espacio no puede sernulo");
		} else {
			this.nom = nom;
		}
	}
	void setDetalles(String detalles) throws EspacioExeption {
		this.detalles = detalles;
		/*if (condition) {
			*throw new EspacioExeption();
		*} else {
		*	this.detalles = detalles;
		}*/
	}
	void setValor(Valoraciones entradavalor) throws EspacioExeption {
		valor.add(entradavalor);
	}
	void setComentariosEspacio(Comentarios EntradacomentariosEspacio) throws EspacioExeption {
		comentariosEspacio.add(EntradacomentariosEspacio);
	}
	void setServicios(String[] servicios) throws EspacioExeption {
		Servicios = servicios;
	}
	String getNom() {
		return nom;
	}
	String getDetalles() {
		return detalles;
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
	void getComentariosEspacio(ArrayList<Comentarios> comentariosEspacio) {
		for (int i = 0; i < comentariosEspacio.size(); i++) {
			System.out.println(comentariosEspacio.get(i).toString());
		}
	}
	String[] getServicios() {
		return Servicios;
	}
	
}
