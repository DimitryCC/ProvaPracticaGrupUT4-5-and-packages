package com.Isaac.Dimitry.Clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
	public Exposicions(String[] modalitats, String Nombre, String data) {
		this.modalitats = modalitats;
		this.titulo = Nombre;
		try {
			this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}
	

	