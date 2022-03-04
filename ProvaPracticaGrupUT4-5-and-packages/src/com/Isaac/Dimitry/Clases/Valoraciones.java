package com.Isaac.Dimitry.Clases;

import com.Isaac.Dimitry.Exeptions.ValoracionesExeption;

public class Valoraciones {
	//Atributos
	private Usuari creador;
	private int valoracio;
	//Constructor
	Valoraciones(Usuari creador, int valoracio) throws ValoracionesExeption {
		setCreador(creador);
		setValoracio(valoracio);
	}
	//geters y seters
	public Usuari getCreador() {
		return creador;
	}
	public int getValoracio() {
		return valoracio;
	}
	private void setCreador(Usuari creador) throws ValoracionesExeption {
		this.creador = creador;
	}
	private void setValoracio(int valoracio) throws ValoracionesExeption {
		if (valoracio<1||valoracio>10) {
			throw new ValoracionesExeption("La valoracion deve estar comprendida entre 1 y 10");
		} else {
			this.valoracio = valoracio;
		}
	}
}
