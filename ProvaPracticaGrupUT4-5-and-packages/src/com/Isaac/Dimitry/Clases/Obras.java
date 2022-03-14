package com.Isaac.Dimitry.Clases;

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

	public void setNomObra(String nomObra) {
		this.nomObra = nomObra;
	}

	public String getModalitat() {
		return modalitat;
	}

	public void setModalitat(String modalitat) {
		this.modalitat = modalitat;
	}
	
}
