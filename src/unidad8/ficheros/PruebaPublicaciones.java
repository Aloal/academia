package unidad8.ficheros;

import java.util.ArrayList;

 

public class PruebaPublicaciones {


		public static void main(String[] args) {
			
			ArrayList<Publicaci�n> publicaciones = new ArrayList<>();
			
			procesarPublicaci�n(new Libro(1, "El Quijote", 1605, "Cervantes"));
			procesarPublicaci�n(new Revista(2, "x", 1, 1, 2021, 100));
			
		}
		
		static void procesarPublicaci�n(Publicaci�n p) {
			System.out.println(p.toString());
		}


	}


