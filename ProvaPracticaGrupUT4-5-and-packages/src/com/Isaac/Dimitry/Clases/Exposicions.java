package com.Isaac.Dimitry.Clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import com.Isaac.Dimitry.Exeptions.ObrasExeption;

public class Exposicions {
	//Atributs
	private String titulo;
	private ArrayList<String> modalitats;
	private ArrayList<Obras> obraDestacada;
	private ArrayList<Obras> obras;
	private ArrayList<Artistas> artistes;
	private LocalDate data;
	// Constructors
	public Exposicions(String Nombre, int ano, int mes, int dia, ArrayList<Obras> obrasEntrada) {
		ArrayList<Obras> obras = new ArrayList<Obras>();
		obras = obrasEntrada;
		this.titulo = Nombre;
		LocalDate dateTime = LocalDate.of(ano, mes, dia);
		this.data = dateTime;
		
	}
	public Exposicions(ArrayList<Obras> exponer, String Nombre, int ano, int mes, int dia, Obras destacada) {
		this.titulo = Nombre;
		LocalDate dateTime = LocalDate.of(ano, mes, dia);
		this.data = dateTime;
	}
	public Exposicions(ArrayList<Obras> exponer, String Nombre, int ano, int mes, int dia , Obras...destacada) {
		this.titulo = Nombre;
		LocalDate dateTime = LocalDate.of(ano, mes, dia);
		this.data = dateTime;
	}
	public ArrayList<String> setModalitats (ArrayList<Obras> obras2){
		ArrayList<String> modalitats = new ArrayList<String>();
		boolean anyadir = false;
		for (int i = 0; i < obras2.size(); i++) {
			if (i==0) {
				modalitats.add(obras.get(i).getModalitat());
			} else {
				if (anyadir = true) {
					for (String string : modalitats) {
						if (obras2.get(i).getModalitat()!= string) {
							anyadir=true;
						}
					}
				modalitats.add(obras.get(i).getModalitat());
				}
				anyadir=false;
			}
		}
		return modalitats;
	}
	public void setObras(Obras obra){
		obras.add(obra);
	}
	public void setObras(Obras...obra) throws ObrasExeption{
		for (int i = 0; i < obra.length; i++) {
			if (obras.contains(obra[i])) {
				throw new ObrasExeption();
			}else {
				obras.add(obra[i]);
			}
		}
	}
	//coparar fechas
	public boolean compararFechas(LocalDate fecha) {
		if (fecha.equals(data)) {
			return true;
		} else {
			return false;
		}
	}
	public String getTitulo() {
		return titulo;
	}
	public void setObrasDes(Obras obra){
		obraDestacada.add(obra);
	}
	public void setObrasDes(Obras...obras){
		
	}
	//mostrar expo
	public String mostrarObras() {
		return titulo;
	}
	@Override
	public String toString() {
		if (modalitats != null) {
			return "Exposicions [titulo=" + titulo + ", modalitats=" + modalitats.toString() + ", obraDestacada="
					+ obraDestacada + ", obras=" + obras + ", artistes=" + artistes + ", data=" + data + "]";
		}else {
			return "Exposicions [titulo=" + titulo + ", modalitats= , obraDestacada="
					+ obraDestacada + ", obras=" + obras + ", artistes=" + artistes + ", data=" + data + "]";
		}
		
	}
}
/*
*
*/