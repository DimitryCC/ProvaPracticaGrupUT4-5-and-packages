package com.Isaac.Dimitry.Clases;

import java.util.ArrayList;

import javax.management.loading.PrivateClassLoader;

public enum modalitat{
	PINTURA_SURREALISTA, FOTOGRAFIA, PINTURA_MODERNISTA, ESCULTURA 
}

public class Exposicions {
	//Atributs
	private Artistas artista;
	private modalitat modalitats;
	private ArrayList<Obras> obraDestacada = new ArrayList<Obras>();
	private ArrayList<Artistas> artistes = new ArrayList<Artistas>();
	// Constructors
	
	public Exposicions(Obras obraDestacada, ArrayList<Artistas> artistes) {
		super();
		this.obraDestacada = obraDestacada;
		this.artistes = artistes;
	}
	
}
	

	