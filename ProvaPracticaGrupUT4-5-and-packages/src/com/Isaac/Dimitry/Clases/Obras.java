package com.Isaac.Dimitry.Clases;

import com.Isaac.Dimitry.Exeptions.ObrasExeption;

public class Obras {
	private String nomObra;
	private String modalitat;
	
	public Obras(String nomObra, String modalitat) {
		this.nomObra = nomObra;
		this.modalitat = modalitat; 
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

	public void setModalitat(String modalitat) throws ObrasExeption {
		if (nomObra.equals(null)) {
			throw new ObrasExeption("El nom de la modalitat es null");
		}else {
			this.modalitat = modalitat;
		}		
	}
	
}
/*
 *En terminos generales
 *poder enmagatzemar el autor (per aportar redundancia de dades)
 *falta la El control de errores (important es una de les clases especificades coma minim es añadir obligatoria)
 * En termes especificas faltan que pugi amagatzamar imatges
 * Funcio per mostrar el nom y modalitat
 */