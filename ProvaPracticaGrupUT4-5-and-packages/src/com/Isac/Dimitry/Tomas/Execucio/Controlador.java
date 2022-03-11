package com.Isac.Dimitry.Tomas.Execucio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

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
		return espacios;
	}
	public ArrayList<Exposicions> inicialitzadorExposicions(){
		ArrayList<Exposicions> expos = new ArrayList<Exposicions>();
			String[] mod1 ={"Pintura", "Escultura",};
			String[] mod2 ={"Realisme","Abstraccio"};
			String[] mod3 ={"Pintura","Realisme","Abstraccio"};
			String[] mod4 ={"Fotografia","Realisme","Abstraccio"};
			String[] mod5 ={"Realisme"};
			Exposicions Primero = new Exposicions(mod1, "Antigua grecia", "26-05-2022");expos.add(Primero);
			Exposicions Segundo = new Exposicions(mod2, "Antigua grecia", "26-05-2022");expos.add(Segundo);
			Exposicions Tercero = new Exposicions(mod3, "Antigua grecia", "26-05-2022");expos.add(Tercero);
			Exposicions Quinto = new Exposicions(mod4, "Antigua grecia", "26-05-2022");
			Exposicions Quarto = new Exposicions(mod5, "Antigua grecia", "26-05-2022");
		return expos;
	}
	public ArrayList<Comentarios> inicializadorComentarios(ArrayList<Usuari> usuaris){
		ArrayList<Comentarios> coment = new ArrayList<Comentarios>();
		
			Comentarios Primero = new	Comentarios(usuaris.get(0), "Ha sido genial");
			Comentarios Segundo = new	Comentarios(usuaris.get(1), "Ha sido genial");
			Comentarios Tercero = new	Comentarios(usuaris.get(2), "Ha sido genial");
			Comentarios Quinto = new	Comentarios(usuaris.get(3), "Ha sido genial");
			Comentarios Quarto = new	Comentarios(usuaris.get(4), "Ha sido genial");
		return coment; 
	}
}
