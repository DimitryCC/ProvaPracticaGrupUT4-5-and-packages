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
	
	public ArrayList<Usuari> iniciadorUsuarios() {
		String[] nombre= {"Juan","Miriam","Adian","eduardo","Bladislab"};
		ArrayList<Usuari> usuarios = new ArrayList<Usuari>();
		Usuari Primero = new Usuari(nombre[0]);usuarios.add(Primero);Usuari Segundo = new Usuari(nombre[1]);usuarios.add(Segundo);Usuari Tercero = new Usuari(nombre[2]);usuarios.add(Tercero);Usuari Quarto = new Usuari(nombre[3]);usuarios.add(Quarto);Usuari Quinto = new Usuari(nombre[4]);usuarios.add(Quinto);
		return usuarios;
	}
	public ArrayList<Artistas> inicialiartistas(){
		ArrayList<Artistas> artista= new ArrayList<Artistas>();
		Artistas Primero = new Artistas("Juana", "Español"); artista.add(Primero);
		Artistas Segundo = new Artistas("Enrique", "Frances"); artista.add(Segundo);
		Artistas Tercero = new Artistas("Adolfo","Aleman"); artista.add(Tercero);
		Artistas Quarto = new Artistas("Rigoberto", "Portugues"); artista.add(Quarto);
		Artistas Quinto = new Artistas("Andres","Ingles"); artista.add(Quinto);
	return artista;
	}
}
