package com.Isac.Dimitry.Tomas.Execucio;

import java.util.ArrayList;

import com.Isaac.Dimitry.Clases.*;
import com.Isaac.Dimitry.Exeptions.*;

public class Controlador {
	public void Valorar(Usuari creador, int valoracio) {
		try {
			Valoraciones valoracion = new Valoraciones(creador, valoracio);
			
		} catch (ValoracionesExeption e) {
			e.printStackTrace();
		}
	}
	public void Comentar(Usuari creador, String Comentario) {
		Comentarios comentario = new Comentarios(creador, Comentario);
	}
	
	public void iniciador() {
		String[] nombre= {"Juan","Miriam","Adian","eduardo","Bladislab"};
		ArrayList<Usuari> usuarios = new ArrayList<Usuari>();
		for (int i = 0; i < nombre.length; i++) {
			usuarios.add(Usuari usuari = new Usuari(nombre[i]));
			
		}
		
	}
}
