package com.Isaac.Dimitry.Clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Exposicions {
	//Atributs
	private String titulo;
	private String[] modalitats;
	private ArrayList<Obras> obraDestacada;
	private ArrayList<Obras> obras;
	private ArrayList<Artistas> artistes;
	private LocalDate data;
	// Constructors
	public Exposicions(String[] modalitats, String Nombre, int año, int mes, int dia) {
		this.titulo = Nombre;
		LocalDate dateTime = LocalDate.of(año, mes, dia);
		this.data = dateTime;
	}
	public String setModalitats (ArrayList<Obras> obras2){
		String listadeModalitats="";
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
		for (int i = 0; i < listamodalidaades.size(); i++) {
			listadeModalitats+=(listamodalidaades.get(i)+",");
		}
		return listadeModalitats;
	}
	@Override
	public String toString() {
		return "Exposicions [titulo=" + titulo + ", modalitats=" + Arrays.toString(modalitats) + ", obraDestacada="
				+ obraDestacada + ", obras=" + obras + ", artistes=" + artistes + ", data=" + data + "]";
	}
}
/*
*
*/