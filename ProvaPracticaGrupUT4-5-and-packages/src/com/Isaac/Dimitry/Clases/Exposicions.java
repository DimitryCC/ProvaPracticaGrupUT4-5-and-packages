package com.Isaac.Dimitry.Clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Exposicions {
	//Atributs
	private String titulo;
	private String[] modalitats;
	private ArrayList<Obras> obraDestacada;
	private ArrayList<Obras> obras;
	private ArrayList<Artistas> artistes;
	private Date data;
	// Constructors
	public Exposicions(String[] modalitats, String Nombre, String data) {
		this.titulo = Nombre;
		try {
			this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public String setModalitats (ArrayList<Obras> obras2){
		String listaObrasdevolucion;
		ArrayList<String> listamodalidaades = new ArrayList<String>();
		for (int i = 0; i < obras2.size(); i++) {
			if (i>0) {
				if (!listamodalidaades.contains(obras2.get(i).getModalitat())) {
					listamodalidaades.add(obras2.get(i).getModalitat());
				}
			} else {
				listamodalidaades.add(obras2.get(i).getModalitat());
			}
		}
		return "holas";
	}
}
/*
*
*/