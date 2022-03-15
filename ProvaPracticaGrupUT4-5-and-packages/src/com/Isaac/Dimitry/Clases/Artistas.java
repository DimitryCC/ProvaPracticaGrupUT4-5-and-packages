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
		boolean isValid = false;
		Pattern pattern = Pattern.compile("(\\b[A-Z]{1}[a-z]+)( )([A-Z]{1}[a-z]+\\b)");
		Matcher matcher = pattern.matcher(nomArtista);
		boolean matchFound = matcher.find();
		if(matchFound) {
			this.nomArtista = nomArtista;
		} else {
			throw new ArtistaExeption("El nombre del artist es incorrecto");
		}
	}
	public void setNacionalitat(String nacionalitat2) throws ArtistaExeption {
		Pattern pattern = Pattern.compile("^[A-Z][a-z]+( [A-Z][a-z]+)*$");
	    Matcher matcher = pattern.matcher(nacionalitat2);
	    boolean matchFound = matcher.find();
	    if(matchFound) {
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
	public boolean filtreArtista(String artista) { 
		if (artista.equals(nomArtista)) {
			return true;
		
		}else {
			return false;
			}
	}
}