package com.Isaac.Dimitry.Clases;

import java.io.File;

import com.Isaac.Dimitry.Exeptions.ObrasExeption;

public class Obras {
	private String nomObra;
	private String modalitat;
	private Artistas artista;
	private File imatge;
	
	public Obras(String nomObra, String modalitat, Artistas artista) throws ObrasExeption {
		setNomObra(nomObra);
		setModalitat(modalitat); 
		setArtista(artista);
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
	public void setImatge(File imatge) {
		this.imatge = imatge;
	}
	public File getImatge() {
		return imatge;
	}

	public void setModalitat(String modalitat) throws ObrasExeption {
		if (nomObra.equals(null)) {
			throw new ObrasExeption("El nom de la modalitat es null");
		}else {
			this.modalitat = modalitat;
		}		
	}
}
/*
 * Funcio per mostrar el nom y modalitat
 */