package unidad8.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ejercicio3P {

	public static void main(String[] args) {
	
		
		 contarPalabrasLineasCaracter(archivo);

	}
	
	
	 static File archivo=new File("C:/Users/alped/Desktop/FORMACION PROFESIONAL/Programacion/El Quijote UTF-8.txt");
	 static int contCaracteres;
	 static int contPalabras;
	 static int contLineas;
	 
	
	 static void contarPalabrasLineasCaracter(File file) {
		 
		  
			try (BufferedReader br= new BufferedReader(new FileReader(archivo))){
				contCaracteres = 0;
				contPalabras = 0;
				contLineas = 0;
				String line;
				
				while ((line = br.readLine()) != null) {
					contLineas++;
					for (String palabra : line.split("\\P{L}+")) {
						contPalabras++;
						contCaracteres += palabra.length();
					}
				}
				System.out.println("Número de caracteres: " + String.valueOf(contCaracteres));
				System.out.println("Número de palabras: " + String.valueOf(contPalabras));
				System.out.println("Número de líneas: " + String.valueOf(contLineas));
				
		 }catch(Exception e) {
			 System.out.println("No es posible acceder al archivo");
		 }
	 }

	 
	 
	 
}
