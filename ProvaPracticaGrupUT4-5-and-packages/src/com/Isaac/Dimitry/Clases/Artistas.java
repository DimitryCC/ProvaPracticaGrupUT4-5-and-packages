package com.Isaac.Dimitry.Clases;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.Isaac.Dimitry.Exeptions.ArtistaExeption;

public class Artistas {
	//Atributs
	private String nomArtista;
	private String nacionalitat;
	private ArrayList<Obras> obras;
	
	public Artistas(String nomArtista, String nacionalitat) throws ArtistaExeption {
		setNomArtista(nomArtista);
		setNacionalitat(nacionalitat);
	}
	public void setNomArtista(String nomArtista) throws ArtistaExeption{
		if(nomArtista != null) {
			this.nomArtista = nomArtista;
		} else {
			throw new ArtistaExeption("El nombre del artist es incorrecto");
		}
	}
	public void setNacionalitat(String nacionalitat2) throws ArtistaExeption {
	    if(nacionalitat2 != null) {
	    	this.nacionalitat=nacionalitat2;
	    } else {
	    	throw new ArtistaExeption("El nombre del pais es incorrecto");
	    }
	}
	public void setObras(ArrayList<Obras> obras2) throws ArtistaExeption {
		ArrayList<Obras> obras = new  ArrayList<Obras>();
		if (obras2.size()==0) {
			throw new ArtistaExeption("El llistat de Obres no pot estar buida");
		}else {
			this.obras = obras2;
		}
	}
	public String getNomArtista() {
		return nomArtista;
	}
	public String getNacionalitat() {
		return nacionalitat;
	}
	public ArrayList<Obras> getObras() {
		return obras;
	}
	public String toString() {
		return "Artistas [nomArtista=" + nomArtista + ", nacionalitat=" + nacionalitat + ", obras=" + obras + "]";
	}
	public boolean filtreArtista(String artista) { 
		if (artista.equals(nomArtista)) {
			return true;
		
		}else {
			return false;
			}
	}
}