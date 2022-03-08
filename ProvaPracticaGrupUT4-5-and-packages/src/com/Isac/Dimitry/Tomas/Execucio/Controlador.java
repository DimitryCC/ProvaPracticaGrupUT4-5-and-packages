package com.Isac.Dimitry.Tomas.Execucio;

import com.Isaac.Dimitry.Clases.*;
import com.Isaac.Dimitry.Exeptions.ValoracionesExeption;

public class Controlador {
	public void Valorar(Usuari creador, int valoracio) {
		try {
			Valoraciones valoracion = new Valoraciones(creador, valoracio);
			
		} catch (ValoracionesExeption e) {
			e.printStackTrace();
		}
	}
	public void iniciador() {
		
	}
}
