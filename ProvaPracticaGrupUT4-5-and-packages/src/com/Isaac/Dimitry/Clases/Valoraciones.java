package com.Isaac.Dimitry.Clases;

import com.Isaac.Dimitry.Exeptions.ValoracionesExeption;

public class Valoraciones {
	//Atributos
	private Usuari creador;
	private int valoracio;
	private Espacio espai;
	//Constructor
	public Valoraciones(Usuari creador, int valoracio, Espacio espai) throws ValoracionesExeption {
		setCreador(creador);
		setValoracio(valoracio);
		setEspai(espai);
	}
	//geters y seters
	public Usuari getCreador() {
		
		return creador;
	}
	public int getValoracio() {
		return valoracio;
	}
	private void setCreador(Usuari creador) throws ValoracionesExeption {
		if (creador.equals(null)) {
			throw new ValoracionesExeption("Error usuario ¡¡null!!");
		} else {
			this.creador = creador;
		}
	}
	private void setValoracio(int valoracio) throws ValoracionesExeption {
		if (valoracio<1||valoracio>10) {
			throw new ValoracionesExeption("La valoracion deve estar comprendida entre 1 y 10");
		} else {
			this.valoracio = valoracio;
		}
	}
	private void setEspai(Espacio esp) throws ValoracionesExeption {
		if (esp.equals(null)) {
			throw new ValoracionesExeption("El esàcio no puede ser null");
		} else {
			this.espai=esp;
		}
	}
}
/*
 * Falta la funcion para 
 */