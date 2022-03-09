package com.Isaac.Dimitry.Clases;

import java.util.ArrayList;
import java.util.Date;

public class Exposicions {
	//Atributs
	private String titulo;
	private String[] modalitats;
	private ArrayList<Obras> obraDestacada = new ArrayList<Obras>();
	private ArrayList<Artistas> artistes = new ArrayList<Artistas>();
	private Date data;
	// Constructors
	
	public Exposicions(String[] modalitats, String Nombre) {
		this.modalitats = modalitats;
		this.titulo = Nombre;
	}
	
}
	

	