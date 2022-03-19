package com.Isaac.Dimitry.Clases;

import java.io.File;
import java.util.ArrayList;

import com.Isaac.Dimitry.Exeptions.ObrasExeption;

public class Obras {
	private String nomObra;
	private String modalitat;
	private Artistas artista;
	private String imatge;
	
	public Obras(String nomObra, String modalitat, Artistas artista, String imatge) throws ObrasExeption {
		setNomObra(nomObra);
		setModalitat(modalitat); 
		setArtista(artista);
		setImatge(imatge);
	}
	public String getObra(Obras obra, ArrayList<Obras> arrayobras) {
		String texto;
		texto = "[" + arrayobras.get(arrayobras.indexOf(obra)).getNomObra()+"/";
		texto += arrayobras.get(arrayobras.indexOf(obra)).getModalitat()+"]";
		return texto;
		
	}
	public String getNomObra() {
		return nomObra;
	}

	public void setNomObra(String nomObra) throws ObrasExeption {
		if (nomObra.equals(null)) {
			throw new ObrasExeption("El nom de l'obra es null");
		}else {
			this.nomObra = nomObra;
		}		
	}
	public String getModalitat() {
		return modalitat;
	}
	
	public void setArtista(Artistas artista) throws ObrasExeption {
		if (artista.equals(null)) {
			throw new ObrasExeption("L'artista es null");
		}else {
			this.artista = artista;
		}
		
	}
	public Artistas getArtista() {
		return artista;
	}
	public void setImatge(String imatge) {
		this.imatge = imatge;
	}
	public String getImatge() {
		return imatge;
	}

	public void setModalitat(String modalitat) throws ObrasExeption {
		if (nomObra.equals(null)) {
			throw new ObrasExeption("El nom de la modalitat es null");
		}else {
			this.modalitat = modalitat;
		}		
	}
	public String toString() {
		return "Obras [nomObra=" + nomObra + ", modalitat=" + modalitat + ", artista=" + artista + ", imatge=" + imatge
				+ "]";
	}
	
}
/*
 * Funcio per mostrar el nom y modalitat
 */