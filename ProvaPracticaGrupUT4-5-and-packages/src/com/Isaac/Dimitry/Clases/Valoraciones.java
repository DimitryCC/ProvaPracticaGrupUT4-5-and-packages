package com.Isaac.Dimitry.Clases;

import com.Isaac.Dimitry.Exeptions.ValoracionesExeption;

public class Valoraciones {
	//Atributos
	private int valiracioID;
	private Usuari creador;
	private int valoracio;
	private Espacio espai;
	//Constructor
	public Valoraciones(Usuari creador, int valoracio, Espacio espai) throws ValoracionesExeption {
		String[] palabras = {creador.getNombre(),espai.getNom()};
		this.valiracioID = ValidacionID(palabras);
		setCreador(creador);
		setValoracio(valoracio);
		setEspai(espai);
	}
	public int ValidacionID(String...palabras) {
		int X = 0;
		for (int i = 0; i < palabras.length; i++) {
			X += contar(palabras[i]);
		}
		return X;
	}
	private int contar(String palabra) {
		int X=0;
		char[] letras = new char[1];
		letras=palabra.toCharArray();
		for (int i = 0; i < letras.length; i++) {
			X+=letras[i];
		}
		return X;
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
			throw new ValoracionesExeption("Error usuario ��null!!");
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
			throw new ValoracionesExeption("El es�cio no puede ser null");
		} else {
			this.espai=esp;
		}
	}
	@Override
	public String toString() {
		return "Valoraciones [creador=" + creador + ", valoracio=" + valoracio + ", espai=" + espai + "]";
	}
	
}
/*
 * Falta la funcion para 
 */