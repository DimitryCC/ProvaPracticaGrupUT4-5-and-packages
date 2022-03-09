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
	public void inicialitzador() {
		iniciadorUsuarios();
		inicialiArtistas();
	}
	public ArrayList<Usuari> iniciadorUsuarios() {
		String[] nombre= {"Juan","Miriam","Adian","eduardo","Bladislab"};
		ArrayList<Usuari> usuarios = new ArrayList<Usuari>();
		Usuari Primero = new Usuari(nombre[0]);usuarios.add(Primero);Usuari Segundo = new Usuari(nombre[1]);usuarios.add(Segundo);Usuari Tercero = new Usuari(nombre[2]);usuarios.add(Tercero);Usuari Quarto = new Usuari(nombre[3]);usuarios.add(Quarto);Usuari Quinto = new Usuari(nombre[4]);usuarios.add(Quinto);
		return usuarios;
	}
	public ArrayList<Artistas> inicialiArtistas(){
		ArrayList<Artistas> artista= new ArrayList<Artistas>();
		Artistas Primero = new Artistas("Juana", "Español"); artista.add(Primero);
		Artistas Segundo = new Artistas("Enrique", "Frances"); artista.add(Segundo);
		Artistas Tercero = new Artistas("Adolfo","Aleman"); artista.add(Tercero);
		Artistas Quarto = new Artistas("Rigoberto", "Portugues"); artista.add(Quarto);
		Artistas Quinto = new Artistas("Andres","Ingles"); artista.add(Quinto);
		return artista;
	}
	//Public ArrayList<Obras> = new ArrayList<Obras>();
	public ArrayList<Espacio> inicializarEspacios() throws EspacioExeption{
		ArrayList<Espacio> espacios = new ArrayList<Espacio>();
		String[] Prim ={"Pintura"}; Espacio Primero = new Espacio("Cafeteria", "Un lugar agradable",Prim);espacios.add(Primero);
		String[] Seg ={"Pintura"}; Espacio Segundo = new Espacio("Cafeteria", "Un lugar agradable",Seg);espacios.add(Segundo);
		String[] Ter ={"Pintura"}; Espacio Tercero = new Espacio("Cafeteria", "Un lugar agradable",Ter);espacios.add(Tercero);
		String[] quar ={"Pintura"}; Espacio quararto = new Espacio("Cafeteria", "Un lugar agradable",quar);espacios.add(quararto);
		String[] qint ={"Pintura"}; Espacio qinto = new Espacio("Cafeteria", "Un lugar agradable",qint);espacios.add(qinto);
		return null;
	}
	
}
