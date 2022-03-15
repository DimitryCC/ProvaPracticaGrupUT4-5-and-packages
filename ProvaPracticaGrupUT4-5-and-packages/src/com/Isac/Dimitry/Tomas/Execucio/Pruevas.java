package com.Isac.Dimitry.Tomas.Execucio;

import java.util.ArrayList;
import java.util.List;

import com.Isaac.Dimitry.Clases.Usuari;
import com.Isaac.Dimitry.Exeptions.ArtistaExeption;
import com.Isaac.Dimitry.Exeptions.ValoracionesExeption;

public class Pruevas {

	public static void main(String[] args) {
		try {
			Controlador hola = new Controlador();
		} catch (ArtistaExeption | ValoracionesExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		ArrayList<Usuari> Users = new ArrayList<Usuari>();
		Controlador Hola = new Controlador();
		Hola.iniciadorUsuarios(Users);
		for (Usuari usuari : Users) {
			System.out.println(usuari.toString());
		}
		Usuari prueva = new Usuari("Pedro");
		System.out.println( prueva.getNombre());
		prueva=null;
		*/
	}
	
}