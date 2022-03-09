package com.Isaac.Dimitry.Clases;

import java.util.ArrayList;

public class Artistas {
	//Atributs
	private String nomArtista;
	private String nacionalitat;
	private ArrayList<Obras> obras = new ArrayList<Obras>();
	//Constructor
	
	public Artistas(String nomArtista, String nacionalitat) {
		this.nomArtista = nomArtista;
		this.nacionalitat = nacionalitat;
	}
	
	
}
