package com.Isac.Dimitry.Tomas.Execucio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import com.Isaac.Dimitry.Clases.*;
import com.Isaac.Dimitry.Exeptions.*;

public class Controlador {
	//Atributos este objeto controlador contrirnr las arrays (al crear un nuevo controlador se genera un nuevo "museo")
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
		ArrayList<Obras> obrasMuseo = new ArrayList<Obras>();
		ArrayList<Exposicions> exposicionesMuseo = new ArrayList<Exposicions>();
		ArrayList<Comentarios> comentariosMuseo = new ArrayList<Comentarios>();
		ArrayList<Valoraciones> valoracionesMuseo = new ArrayList<Valoraciones>();
		inicializador();
	}
	
	//Registrar servicio
	public void registrarServicio(Espacio espai ,String servicio) throws EspacioExeption {
		espaciosMuseo.get(espaciosMuseo.indexOf(espai)).setServicios(servicio);
	}
	public void registrarServicio(Espacio espai ,String...servicios) throws EspacioExeption {
		for (int i = 0; i < servicios.length; i++) {
			espaciosMuseo.get(espaciosMuseo.indexOf(espai)).setServicios(servicios[i]);
		}
	}
	//Eliminar servicio
	public void eliminarServicio(Espacio espai ,String servicio) throws EspacioExeption {
		espaciosMuseo.get(espaciosMuseo.indexOf(espai)).removeServicio(servicio);
	}
	public void eliminarServicio(Espacio espai ,String...servicios) throws EspacioExeption {
		for (int i = 0; i < servicios.length; i++) {
			espaciosMuseo.get(espaciosMuseo.indexOf(espai)).removeServicio(servicios[i]);
		}
	}
	//Funcion para buscar un artista
	public Artistas buscarArtista(String nombre) {
		for (Artistas artistas : artistasMuseo) {
			if (artistas.filtreArtista(nombre) == true) {
				return artistas;
			}
		}
		return null;
	}
	//Filtrar por dia.
	public Exposicions filtroPorFecha(int ano, int mes, int dia) {
		LocalDate fecha = LocalDate.of(ano, mes, dia);
		for (Exposicions expo : exposicionesMuseo) {
			if (expo.compararFechas(fecha)) {
				return expo;
			}
		}
		return null;
	}
	//Funcion para generar una valoracion
	public void Valorar(Usuari creador, int valoracio, Espacio espai) throws ValoracionesExeption, EspacioExeption {
		Valoraciones valorado = new Valoraciones(creador, valoracio, espai);
		valoracionesMuseo.add(valorado);
		espaciosMuseo.get(espaciosMuseo.indexOf(espai)).setValor(valorado);
		usuariosMuseo.get(usuariosMuseo.indexOf(creador)).setValor(valorado);
	}
	//Funcion para generar un comentario
	public void Comentar(Usuari creador, String Comentario, Espacio espai) throws ComentariosException, EspacioExeption {
		Comentarios comentario = new Comentarios(creador, Comentario);
		espaciosMuseo.get(espaciosMuseo.indexOf(espai)).setComentario(comentario);
		usuariosMuseo.get(usuariosMuseo.indexOf(creador)).setComentario(comentario);
	}
	//Funcion para estraer buscar un espacio
	public String Filtro(String busqueda) {
		for (int i = 0; i < espaciosMuseo.size(); i++) {
			if (espaciosMuseo.get(i).getNom().equals(busqueda)) {
				return espaciosMuseo.get(i).toString();
			}
		}
		return "No esncontrado";
	}
	//Funcion ara extraer un espacio (usando un objeto espacio)
	public int Filtro(Espacio busqueda) {
		for (int i = 0; i < espaciosMuseo.size(); i++) {
			if (espaciosMuseo.get(i).equals(busqueda)) {
				return i;
			}
		}
		//El Espacio 0 es el not found (No encontrado indicando que no se ha encontrado nigun espacio con ese nombre)
		return 0;
	}
	//Funcion para poder sisulizar todas las exposiciones
	public String mostrarExpos() {
		String G="";
		G+="Exposiciones \n";
		for (int i = 0; i < exposicionesMuseo.size(); i++) {
			G+=exposicionesMuseo.get(i).toString()+"\n";
		}
		return G+="Usuarios: \n";
	}
	//Constructores de de objetos individuales
	private void gen(String nombre) throws UsuariExeption {
		Usuari hola = new Usuari(nombre);
		usuariosMuseo.add(hola);
	}
	private void gen(String nomObra, String modalitat, Artistas artista, String imatge) throws ObrasExeption {
		Obras hola = new Obras(nomObra, modalitat, artista, imatge);
		obrasMuseo.add(hola);
	}
	private void gen(String Nombre, int ano, int mes, int dia, ArrayList<Obras> obrasEntrada) {
		Exposicions hola = new Exposicions(Nombre, ano, mes, dia, obrasEntrada);
		exposicionesMuseo.add(hola);
	}
	private void gen(String nom, String detalles, String imagen, String...servicios) throws EspacioExeption {
		Espacio hola = new Espacio(nom, detalles, imagen, servicios);
		espaciosMuseo.add(hola);
	}
	private void gen(String nomArtista, String nacionalitat, String imagen) throws ArtistaExeption {
		Artistas hola = new Artistas(nomArtista, nacionalitat, imagen);
		artistasMuseo.add(hola);
	}
	//eliminar elemnetos
	private void delete(Usuari nombre) throws UsuariExeption {
		usuariosMuseo.remove(nombre);
	}
	private void delete(Obras hola) throws ObrasExeption {
		obrasMuseo.remove(hola);
	}
	private void delete(Exposicions hola) {
		exposicionesMuseo.remove(hola);
	}
	private void delete(Espacio hola) throws EspacioExeption {
		espaciosMuseo.remove(hola);
	}
	private void delete(Artistas hola) throws ArtistaExeption {
		artistasMuseo.add(hola);
	}
	//Inicializador (de todos los objetos a la vez)
	private void inicializador(){
		try {
			this.usuariosMuseo = iniciadorUsuarios(usuariosMuseo);
			this.comentariosMuseo = inicializadorComentarios(usuariosMuseo, comentariosMuseo);
			this.espaciosMuseo = inicializarEspacios(espaciosMuseo);
			this.artistasMuseo = inicialiArtistas(artistasMuseo);
			this.obrasMuseo = inicializadorObras(obrasMuseo, artistasMuseo);
			this.exposicionesMuseo = inicialitzadorExposicions(exposicionesMuseo);
			this.valoracionesMuseo = inicializadorValoraciones(usuariosMuseo, espaciosMuseo, valoracionesMuseo);
		} catch (UsuariExeption | ComentariosException | EspacioExeption | ObrasExeption | ArtistaExeption | ValoracionesExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Generador de usuarios
	private ArrayList<Usuari> iniciadorUsuarios(ArrayList<Usuari> usuarios) throws UsuariExeption {
		String[] nombre= {"Juan","Miriam","Adian","eduardo","Bladislab"};
		Usuari primero = new Usuari(nombre[0]);usuarios.add(primero);Usuari segundo = new Usuari(nombre[1]);usuarios.add(segundo);Usuari tercero = new Usuari(nombre[2]);usuarios.add(tercero);Usuari quarto = new Usuari(nombre[3]);usuarios.add(quarto);Usuari quinto = new Usuari(nombre[4]);usuarios.add(quinto);
		return usuarios;
	}
	//Generador de Artistas 
	private ArrayList<Artistas> inicialiArtistas(ArrayList<Artistas> artista) throws ArtistaExeption {
		Artistas primero = new Artistas("Juana", "Espanol", "C:\\Users\\museo\\Downloads\\imagen.png"); artista.add(primero);
		Artistas segundo = new Artistas("Enrique", "Frances", "C:\\Users\\museo\\Downloads\\imagen.png"); artista.add(segundo);
		Artistas tercero = new Artistas("Adolfo","Aleman", "C:\\Users\\museo\\Downloads\\imagen.png"); artista.add(tercero);
		Artistas quarto = new Artistas("Rigoberto", "Portugues", "C:\\Users\\museo\\Downloads\\imagen.png"); artista.add(quarto);
		Artistas quinto = new Artistas("Andres","Ingles", "C:\\Users\\museo\\Downloads\\imagen.png"); artista.add(quinto);
		return artista;
	}
	//Generador de Espacios
	private ArrayList<Espacio> inicializarEspacios(ArrayList<Espacio> espacios) throws EspacioExeption{
		Espacio notfound = new Espacio("notfound", "notfound", "notfoundl", "C:\\Users\\museo\\Downloads\\imagen.png");espacios.add(notfound);
		Espacio primero = new Espacio("Recepcion", "Un lugar agradable", "C:\\Users\\museo\\Downloads\\imagen.png");espacios.add(primero);
		Espacio segundo = new Espacio("Cafeteria", "Un lugar agradable", "C:\\Users\\museo\\Downloads\\imagen.png");espacios.add(segundo);
		Espacio tercero = new Espacio("Piscina", "Un lugar agradable", "C:\\Users\\museo\\Downloads\\imagen.png");espacios.add(tercero);
		Espacio quararto = new Espacio("gipnasio", "Un lugar agradable", "C:\\Users\\museo\\Downloads\\imagen.png");espacios.add(quararto);
		Espacio qinto = new Espacio("Bar", "Un lugar agradable", "C:\\Users\\museo\\Downloads\\imagen.png");espacios.add(qinto);
		return espacios;
	}
	//Generador de Exposisiones
	private ArrayList<Exposicions> inicialitzadorExposicions(ArrayList<Exposicions> expos){
			Exposicions primero = new Exposicions("Antigua grecia", 2021, 12, 06, obrasMuseo);expos.add(primero);
			Exposicions segundo = new Exposicions("Antigua grecia", 2022, 05, 16, obrasMuseo);expos.add(segundo);
			Exposicions tercero = new Exposicions("Antigua grecia", 2022, 05 , 12, obrasMuseo);expos.add(tercero);
			Exposicions quinto = new Exposicions("Antigua grecia", 2022, 05, 23, obrasMuseo);expos.add(quinto);
			Exposicions quarto = new Exposicions("Antigua grecia", 2022, 05, 11, obrasMuseo);expos.add(quarto);
		return expos;
	}
	//Generador de Comentarios
	private ArrayList<Comentarios> inicializadorComentarios(ArrayList<Usuari> usuaris,ArrayList<Comentarios> coment) throws ComentariosException{
			Comentarios primero = new Comentarios(usuaris.get(0), "Ha sido genial");
			Comentarios segundo = new Comentarios(usuaris.get(1), "Ha sido genial");
			Comentarios tercero = new Comentarios(usuaris.get(2), "Ha sido genial");
			Comentarios quinto = new Comentarios(usuaris.get(3), "Ha sido genial");
			Comentarios quarto = new Comentarios(usuaris.get(4), "Ha sido genial");
		return coment; 
	}
	//Generador de Valoraciones
	private ArrayList<Valoraciones> inicializadorValoraciones(ArrayList<Usuari> usuaris, ArrayList<Espacio> espai ,ArrayList<Valoraciones> Valors) throws ValoracionesExeption{
		Valoraciones primero = new Valoraciones(usuaris.get(0), 6, espai.get(0)); Valors.add(primero);
		Valoraciones segundo = new Valoraciones(usuaris.get(1), 6, espai.get(1)); Valors.add(segundo);
		Valoraciones tercero = new Valoraciones(usuaris.get(2), 6, espai.get(2)); Valors.add(tercero);
		Valoraciones quinto = new Valoraciones(usuaris.get(3), 6, espai.get(3)); Valors.add(quinto);
		Valoraciones quarto = new Valoraciones(usuaris.get(4), 6, espai.get(4)); Valors.add(quarto);
		return Valors;
	}
	//Generador de Obras
	private ArrayList<Obras> inicializadorObras(ArrayList<Obras> obrass, ArrayList<Artistas> artista) throws ObrasExeption{
		Obras primero = 	new Obras("primero", "fotos", artista.get(0), "C:\\Users\\museo\\Downloads\\imagen.png"); obrass.add(primero);
		Obras segunda = 	new Obras("segundo", "pintura", artista.get(0), "C:\\Users\\museo\\Downloads\\imagen.png"); obrass.add(segunda);
		Obras tercero = 	new Obras("tercero", "escultura", artista.get(0), "C:\\Users\\museo\\Downloads\\imagen.png"); obrass.add(tercero);
		Obras quarto = 		new Obras("quarto", "video", artista.get(0), "C:\\Users\\museo\\Downloads\\imagen.png"); obrass.add(quarto);
		Obras quinto = 		new Obras("quinto", "arte digital", artista.get(0), "C:\\Users\\museo\\Downloads\\imagen.png"); obrass.add(quinto);
		Obras sexto =	 	new Obras("sexto", "escultura", artista.get(0), "C:\\Users\\museo\\Downloads\\imagen.png"); obrass.add(sexto);
		Obras octavo = 		new Obras("octavo", "fotos", artista.get(0), "C:\\Users\\museo\\Downloads\\imagen.png"); obrass.add(octavo);
		Obras noveno = 		new Obras("noveno", "video", artista.get(0), "C:\\Users\\museo\\Downloads\\imagen.png"); obrass.add(noveno);
		Obras decimo = 		new Obras("decimo", "pintura", artista.get(0), "C:\\Users\\museo\\Downloads\\imagen.png"); obrass.add(decimo);
		Obras undecimo = 	new Obras("undecimo", "pintura", artista.get(0), "C:\\Users\\museo\\Downloads\\imagen.png"); obrass.add(undecimo);
		return obrass;
	}
	//Esta funcion solo tiene el objetivo de poser visualizar el estado del programa (objetos existentes etc)
	public String mostrarTodo() {
		String salida="";
		salida+="Usuarios: \n";
		for (int i = 0; i < usuariosMuseo.size(); i++) {
			salida+=usuariosMuseo.get(i).toString()+"\n";
		}
		salida+="Artistas: \n";
		for (int i = 0; i < artistasMuseo.size(); i++) {
			salida+=artistasMuseo.get(i).toString()+"\n";
		}
		salida+="Espacios \n";
		for (int i = 0; i < espaciosMuseo.size(); i++) {
			salida+=espaciosMuseo.get(i).toString()+"\n";
		}
		salida+="Exposiciones \n";
		for (int i = 0; i < exposicionesMuseo.size(); i++) {
			salida+=exposicionesMuseo.get(i).toString()+"\n";
		}
		salida+="Comentarios \n";
		for (int i = 0; i < comentariosMuseo.size(); i++) {
			salida+=comentariosMuseo.get(i).toString()+"\n";
		}
		salida+="Valoraciones \n";
		for (int i = 0; i < valoracionesMuseo.size(); i++) {
			salida+=valoracionesMuseo.get(i).toString()+"\n";
		}
		salida+="Obras \n";
		for (int i = 0; i < obrasMuseo.size(); i++) {
			salida+=obrasMuseo.get(i).toString()+"\n";
		}
		return salida;
		
	}
}
