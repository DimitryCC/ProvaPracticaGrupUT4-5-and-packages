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
		
		try {
			this.usuariosMuseo = iniciadorUsuarios(usuariosMuseo);
			this.comentariosMuseo = inicializadorComentarios(usuariosMuseo, comentariosMuseo);
			this.espaciosMuseo = inicializarEspacios(espaciosMuseo);
			this.artistasMuseo = inicialiArtistas(artistasMuseo);
			this.obrasMuseo = inicializadorObras(obrasMuseo, artistasMuseo);
			this.exposicionesMuseo = inicialitzadorExposicions(exposicionesMuseo);
			this.valoracionesMuseo = inicializadorValoraciones(usuariosMuseo, espaciosMuseo, valoracionesMuseo);
		} catch (UsuariExeption | ComentariosException | EspacioExeption | ObrasExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void Valorar(Usuari creador, int valoracio) {
		
	}
	public void Comentar(Usuari creador, String Comentario) throws ComentariosException {
		Comentarios comentario = new Comentarios(creador, Comentario);
	}
	public String Filtro(String busqueda) {
		for (int i = 0; i < espaciosMuseo.size(); i++) {
			if (espaciosMuseo.get(i).getNom().equals(busqueda)) {
				return espaciosMuseo.get(i).toString();
			}
		}
		return "No esncontrado";
	}
	public String mostrarExpos() {
		String G="";
		G+="Exposiciones \n";
		for (int i = 0; i < exposicionesMuseo.size(); i++) {
			G+=exposicionesMuseo.get(i).toString()+"\n";
		}
		return G+="Usuarios: \n";
	}
	private ArrayList<Usuari> iniciadorUsuarios(ArrayList<Usuari> usuarios) throws UsuariExeption {
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
		String[] Prim ={"Pintura"}; Espacio Primero = new Espacio("Recepcion", "Un lugar agradable",Prim);espacios.add(Primero);
		String[] Seg ={"Pintura"}; Espacio Segundo = new Espacio("Cafeteria", "Un lugar agradable",Seg);espacios.add(Segundo);
		String[] Ter ={"Pintura"}; Espacio Tercero = new Espacio("Piscina", "Un lugar agradable",Ter);espacios.add(Tercero);
		String[] quar ={"Pintura"}; Espacio quararto = new Espacio("gipnasio", "Un lugar agradable",quar);espacios.add(quararto);
		String[] qint ={"Pintura"}; Espacio qinto = new Espacio("Bar", "Un lugar agradable",qint);espacios.add(qinto);
		return espacios;
	}
	private ArrayList<Exposicions> inicialitzadorExposicions(ArrayList<Exposicions> expos){
			Exposicions Primero = new Exposicions("Antigua grecia", 2021, 12, 06);expos.add(Primero);
			Exposicions Segundo = new Exposicions("Antigua grecia", 2022, 05, 16);expos.add(Segundo);
			Exposicions Tercero = new Exposicions("Antigua grecia", 2022, 05 , 12);expos.add(Tercero);
			Exposicions Quinto = new Exposicions("Antigua grecia", 2022, 05, 23);expos.add(Quinto);
			Exposicions Quarto = new Exposicions("Antigua grecia", 2022, 05, 11);expos.add(Quarto);
		return expos;
	}
	private ArrayList<Comentarios> inicializadorComentarios(ArrayList<Usuari> usuaris,ArrayList<Comentarios> coment) throws ComentariosException{
			Comentarios Primero = new Comentarios(usuaris.get(0), "Ha sido genial");
			Comentarios Segundo = new Comentarios(usuaris.get(1), "Ha sido genial");
			Comentarios Tercero = new Comentarios(usuaris.get(2), "Ha sido genial");
			Comentarios Quinto = new Comentarios(usuaris.get(3), "Ha sido genial");
			Comentarios Quarto = new Comentarios(usuaris.get(4), "Ha sido genial");
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
	private ArrayList<Obras> inicializadorObras(ArrayList<Obras> obrass, ArrayList<Artistas> artista) throws ObrasExeption{
		Obras Primero = new Obras("primero", "fotos", artista.get(0)); obrass.add(Primero);
		Obras Segunda = new Obras("segundo", "pintura", artista.get(0)); obrass.add(Segunda);
		Obras Tercero = new Obras("tercero", "escultura", artista.get(0)); obrass.add(Tercero);
		Obras Quarto = new Obras("quarto", "video", artista.get(0)); obrass.add(Quarto);
		Obras Quinto = new Obras("quinto", "arte digital", artista.get(0)); obrass.add(Quinto);
		Obras sexto = new Obras("sexto", "escultura", artista.get(0)); obrass.add(sexto);
		Obras octavo = new Obras("octavo", "fotos", artista.get(0)); obrass.add(octavo);
		Obras noveno = new Obras("noveno", "video", artista.get(0)); obrass.add(noveno);
		Obras decimo = new Obras("decimo", "pintura", artista.get(0)); obrass.add(decimo);
		Obras undecimo = new Obras("undecimo", "pintura", artista.get(0)); obrass.add(undecimo);
		return obrass;
	}
	public String mostrarTodo() {
		String G="";
		G+="Usuarios: \n";
		for (int i = 0; i < usuariosMuseo.size(); i++) {
			G+=usuariosMuseo.get(i).toString()+"\n";
		}
		G+="Artistas: \n";
		for (int i = 0; i < artistasMuseo.size(); i++) {
			G+=artistasMuseo.get(i).toString()+"\n";
		}
		G+="Espacios \n";
		for (int i = 0; i < espaciosMuseo.size(); i++) {
			G+=espaciosMuseo.get(i).toString()+"\n";
		}
		G+="Exposiciones \n";
		for (int i = 0; i < exposicionesMuseo.size(); i++) {
			G+=exposicionesMuseo.get(i).toString()+"\n";
		}
		G+="Comentarios \n";
		for (int i = 0; i < comentariosMuseo.size(); i++) {
			G+=comentariosMuseo.get(i).toString()+"\n";
		}
		G+="Valoraciones \n";
		for (int i = 0; i < valoracionesMuseo.size(); i++) {
			G+=valoracionesMuseo.get(i).toString()+"\n";
		}
		G+="Obras \n";
		for (int i = 0; i < obrasMuseo.size(); i++) {
			G+=obrasMuseo.get(i).toString()+"\n";
		}
		return G;
		
	}
}
