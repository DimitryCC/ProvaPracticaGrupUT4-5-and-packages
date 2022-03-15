package com.Isac.Dimitry.Tomas.Execucio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import com.Isaac.Dimitry.Clases.*;
import com.Isaac.Dimitry.Exeptions.*;

public class Controlador {
	private ArrayList<Usuari> usuariosMuseo;
	private ArrayList<Artistas> artistasMuseo;
	private ArrayList<Espacio> espaciosMuseo;
	private ArrayList<Exposicions> exposicionesMuseo;
	private ArrayList<Comentarios> comentariosMuseo;
	private ArrayList<Valoraciones> valoracionesMuseo;
	private ArrayList<Obras> obrasMuseo;
	
	public Controlador() throws ArtistaExeption, ValoracionesExeption {
		ArrayList<Usuari> usuariosMuseo = new ArrayList<Usuari>();
		ArrayList<Artistas> artistasMuseo = new ArrayList<Artistas>();
		ArrayList<Espacio> espaciosMuseo = new ArrayList<Espacio>();
		ArrayList<Exposicions> exposicionesMuseo = new ArrayList<Exposicions>();
		ArrayList<Comentarios> comentariosMuseo = new ArrayList<Comentarios>();
		ArrayList<Valoraciones> valoracionesMuseo = new ArrayList<Valoraciones>();
		ArrayList<Obras> obrasMuseo = new ArrayList<Obras>();
		iniciadorUsuarios(usuariosMuseo);
		inicialiArtistas(artistasMuseo);
		inicialitzadorExposicions(exposicionesMuseo);
		inicializadorComentarios(usuariosMuseo, comentariosMuseo);
		inicializadorObras(obrasMuseo, artistasMuseo);
		inicializadorValoraciones(usuariosMuseo, espaciosMuseo, valoracionesMuseo);
		inicializadorObras(obrasMuseo, artistasMuseo);
	}
	public void Valorar(Usuari creador, int valoracio) {
		
	}
	public void Comentar(Usuari creador, String Comentario) {
		Comentarios comentario = new Comentarios(creador, Comentario);
	}
	
	private ArrayList<Usuari> iniciadorUsuarios(ArrayList<Usuari> usuarios) {
		String[] nombre= {"Juan","Miriam","Adian","eduardo","Bladislab"};
		Usuari Primero = new Usuari(nombre[0]);usuarios.add(Primero);Usuari Segundo = new Usuari(nombre[1]);usuarios.add(Segundo);Usuari Tercero = new Usuari(nombre[2]);usuarios.add(Tercero);Usuari Quarto = new Usuari(nombre[3]);usuarios.add(Quarto);Usuari Quinto = new Usuari(nombre[4]);usuarios.add(Quinto);
		return usuarios;
	}
	private ArrayList<Artistas> inicialiArtistas(ArrayList<Artistas> artista) throws ArtistaExeption {
		Artistas Primero = new Artistas("Juana", "Espanol"); artista.add(Primero);
		Artistas Segundo = new Artistas("Enrique", "Frances"); artista.add(Segundo);
		Artistas Tercero = new Artistas("Adolfo","Aleman"); artista.add(Tercero);
		Artistas Quarto = new Artistas("Rigoberto", "Portugues"); artista.add(Quarto);
		Artistas Quinto = new Artistas("Andres","Ingles"); artista.add(Quinto);
		return artista;
	}
	//Public ArrayList<Obras> = new ArrayList<Obras>();
	private ArrayList<Espacio> inicializarEspacios(ArrayList<Espacio> espacios) throws EspacioExeption{
		String[] Prim ={"Pintura"}; Espacio Primero = new Espacio("Cafeteria", "Un lugar agradable",Prim);espacios.add(Primero);
		String[] Seg ={"Pintura"}; Espacio Segundo = new Espacio("Cafeteria", "Un lugar agradable",Seg);espacios.add(Segundo);
		String[] Ter ={"Pintura"}; Espacio Tercero = new Espacio("Cafeteria", "Un lugar agradable",Ter);espacios.add(Tercero);
		String[] quar ={"Pintura"}; Espacio quararto = new Espacio("Cafeteria", "Un lugar agradable",quar);espacios.add(quararto);
		String[] qint ={"Pintura"}; Espacio qinto = new Espacio("Cafeteria", "Un lugar agradable",qint);espacios.add(qinto);
		return espacios;
	}
	private ArrayList<Exposicions> inicialitzadorExposicions(ArrayList<Exposicions> expos){
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
	private ArrayList<Comentarios> inicializadorComentarios(ArrayList<Usuari> usuaris,ArrayList<Comentarios> coment){
			Comentarios Primero = new	Comentarios(usuaris.get(0), "Ha sido genial");
			Comentarios Segundo = new	Comentarios(usuaris.get(1), "Ha sido genial");
			Comentarios Tercero = new	Comentarios(usuaris.get(2), "Ha sido genial");
			Comentarios Quinto = new	Comentarios(usuaris.get(3), "Ha sido genial");
			Comentarios Quarto = new	Comentarios(usuaris.get(4), "Ha sido genial");
		return coment; 
	}
	private ArrayList<Valoraciones> inicializadorValoraciones(ArrayList<Usuari> usuaris, ArrayList<Espacio> espai ,ArrayList<Valoraciones> Valors) throws ValoracionesExeption{
		Valoraciones Primero = new Valoraciones(usuaris.get(0), 6, espai.get(0)); Valors.add(Primero);
		Valoraciones Segundo = new Valoraciones(usuaris.get(1), 6, espai.get(1)); Valors.add(Segundo);
		Valoraciones Tercero = new Valoraciones(usuaris.get(2), 6, espai.get(2)); Valors.add(Tercero);
		Valoraciones Quinto = new Valoraciones(usuaris.get(3), 6, espai.get(3)); Valors.add(Quinto);
		Valoraciones Quarto = new Valoraciones(usuaris.get(4), 6, espai.get(4)); Valors.add(Quarto);
		return Valors;
	}
	private ArrayList<Obras> inicializadorObras(ArrayList<Obras> obrass, ArrayList<Artistas> artista){
		
		return obrass;
	}
	public String mostrarTodo() {
		String G="";
		G+="Usuarios: \n";
		for (int i = 0; i < usuariosMuseo.size(); i++) {
			G+=(usuariosMuseo.toString())
		}
		return G;
		
	}
}
