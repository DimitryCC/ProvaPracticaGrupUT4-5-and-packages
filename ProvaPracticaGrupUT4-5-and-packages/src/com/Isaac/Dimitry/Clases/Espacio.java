package com.Isaac.Dimitry.Clases;

import java.util.ArrayList;
import java.util.Arrays;

import com.Isaac.Dimitry.Exeptions.EspacioExeption;

public class Espacio {
	//Atributos
	private String nom;
	private String imagen;
	private Exposicions espo;
	private String detalles;
	private ArrayList<Valoraciones> valor;
	private ArrayList<Comentarios> comentariosEspacio;
	private ArrayList<String> servicios;
	//Constructor
	public Espacio(String nom, String detalles, String imagen, String...strings) throws EspacioExeption {
		//Usaremos en este caso los seters para generar el espacio ya quesi solo deveremos especificar las exepciones en estos
		ArrayList<Valoraciones> valor = new ArrayList<Valoraciones>();
		ArrayList<Comentarios> comentariosEspacio = new ArrayList<Comentarios>();
		ArrayList<String> servicios = new ArrayList<String>();
		setNom(nom);
		setDetalles(detalles);
		setServicios(strings);
	}
	public Espacio(String nom, String detalles, String imagen, String strings) throws EspacioExeption {
		//Usaremos en este caso los seters para generar el espacio ya quesi solo deveremos especificar las exepciones en estos
		ArrayList<Valoraciones> valor = new ArrayList<Valoraciones>();
		ArrayList<Comentarios> comentariosEspacio = new ArrayList<Comentarios>();
		ArrayList<String> servicios = new ArrayList<String>();
		servicios.add(strings);
		setNom(nom);
		setDetalles(detalles);
		setServicios(strings);
	}
	//Geters and Seters
	private void setNom(String nom) throws EspacioExeption {
		if (nom.length()==0) {
			throw new EspacioExeption("El nombre de un espacio no puede sernulo");
		} else {
			this.nom = nom;
		}
	}
	private void setImagen(String imagen) {
		this.imagen=imagen;
	}
	private void setDetalles(String detalles) throws EspacioExeption {
		this.detalles = detalles;
	}
	public void setValor(Valoraciones entradavalor) throws EspacioExeption {
		valor.add(entradavalor);
	}
	public void setComentario(Comentarios entradavalor) throws EspacioExeption {
		comentariosEspacio.add(entradavalor);
	}
	 //Esta vacio porque quiero que esta funcion pueda ser llamada por cualquier otra clase del paquete.
	 void setComentariosEspacio(Comentarios EntradacomentariosEspacio) throws EspacioExeption {
		comentariosEspacio.add(EntradacomentariosEspacio);
	}
	public void setServicios(String[] serviciosEntrada) throws EspacioExeption {
		for (int i = 0; i < serviciosEntrada.length; i++) {
			servicios.add(serviciosEntrada[i]);
		}
	}
	//Eliminar servicio
	public void removeServicio(String servicio) {
		servicios.remove(servicio);
	}
	public void setServicios(String serviciosEntrada) throws EspacioExeption {
			servicios.add(serviciosEntrada);
	}
	private void setExposicions(Exposicions espo2) throws EspacioExeption {
		if (espo2.equals(null)) {
			throw new EspacioExeption("No puede haver una exposicion igual a null");
		} else {
			this.espo=espo2;
		}
	}
	//Funcion para sacar la informacion de la exposicion
	public String mostrarinfo(Espacio esp) {
		String texto = "";
		texto = "["+espo.getTitulo()+"/"+servicios.toString()+"]";
		return texto;
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
	public String getServicios() {
		return servicios.toString();
	}
	@Override
	public String toString() {
		if (servicios != null) {
			return "Espacio [nom=" + nom + ", espo=" + espo + ", detalles=" + detalles + ", valor=" + valor
					+ ", comentariosEspacio=" + comentariosEspacio + ", Servicios=" + servicios.toString() + "]";
		}else {
			return "Espacio [nom=" + nom + ", espo=" + espo + ", detalles=" + detalles + ", valor=" + valor
					+ ", comentariosEspacio=" + comentariosEspacio + ", Servicios= ]";
		}
	}
	
}
