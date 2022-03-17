package com.Isaac.Dimitry.Clases;

import java.util.ArrayList;
import java.util.Arrays;

import com.Isaac.Dimitry.Exeptions.EspacioExeption;

public class Espacio {
	//Atributos
	private String nom;
	private Exposicions espo;
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
	private void setNom(String nom) throws EspacioExeption {
		if (nom.length()==0) {
			throw new EspacioExeption("El nombre de un espacio no puede sernulo");
		} else {
			this.nom = nom;
		}
	}
	private void setDetalles(String detalles) throws EspacioExeption {
		this.detalles = detalles;
		/*if (condition) {
			*throw new EspacioExeption();
		*} else {
		*	this.detalles = detalles;
		}*/
	}
	//Esta vacio porque quiero que esta funcion pueda ser llamada por cualquier otra clase del paquete.
	 void setValor(Valoraciones entradavalor) throws EspacioExeption {
		valor.add(entradavalor);
	}
	 //Esta vacio porque quiero que esta funcion pueda ser llamada por cualquier otra clase del paquete.
	 void setComentariosEspacio(Comentarios EntradacomentariosEspacio) throws EspacioExeption {
		comentariosEspacio.add(EntradacomentariosEspacio);
	}
	private void setServicios(String[] servicios) throws EspacioExeption {
		Servicios = servicios;
	}
	private void setExposicions(Exposicions espo2) throws EspacioExeption {
		if (espo2.equals(null)) {
			throw new EspacioExeption("No puede haver una exposicion igual a null");
		} else {
			this.espo=espo2;
		}
	}
	public String getNom() {
		return nom;
	}
	public String getDetalles() {
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
	public String[] getServicios() {
		return Servicios;
	}
	@Override
	public String toString() {
		return "Espacio [nom=" + nom + ", espo=" + espo + ", detalles=" + detalles + ", valor=" + valor
				+ ", comentariosEspacio=" + comentariosEspacio + ", Servicios=" + Arrays.toString(Servicios) + "]";
	}
	
}
