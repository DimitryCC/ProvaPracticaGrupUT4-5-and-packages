package com.Isaac.Dimitry.Clases;

import java.util.ArrayList;

public class Artistas {
	//Atributs
	private String nomArtista;
	private String nacionalitat;
	private ArrayList<Obras> obras = new ArrayList<Obras>();
	
	public Artistas(String nomArtista, String nacionalitat, ArrayList<Obras> obras) {
		this.nomArtista = nomArtista;
		this.nacionalitat = nacionalitat;
		this.obras = obras;
	}
	public String getNacionalitat() {
		return nacionalitat;
	}
	public String getNomArtista() {
		return nomArtista;
	}
	public void setNacionalitat(String nacionalitat) {
		this.nacionalitat = nacionalitat;
	}
}
