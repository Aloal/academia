package colecciones;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Jugador {
	
	private String nombre;
	private Map<String, String>mano;
	
	
	public Jugador() {
		
		 this.nombre=nombre;
		 this.mano=mano;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Map<String, String> getMano() {
		return mano;
	}


	public void setMano(Map<String, String> mano) {
		this.mano = mano;
	}


	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", mano=" + mano + "]";
	}

		
	
}
