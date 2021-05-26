package unidad8.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio5 {

	public static void main(String[] args) throws Exception, Throwable {
	
		leercontarPalabrasLineasCaracter(archivo);
		escribir_en_ficheroBinario(archivo);
		leer_ficheroBinario(archivo);
		escribir_en_otro_ficheroTexto(archivo);

	}

	static File archivo = new File("C:/Users/alped/Desktop/FORMACION PROFESIONAL/Programacion/El Quijote UTF-8.txt");
	static int contCaracteres;
	static int contPalabras;
	static int contLineas;

	static void leercontarPalabrasLineasCaracter(File file) {

		try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
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

		} catch (Exception e) {
			System.out.println("No es posible acceder al archivo");
		}
	}

	static void escribir_en_ficheroBinario(File file) throws Exception, Throwable {

		try (DataOutputStream fich = new DataOutputStream(
				new FileOutputStream("C:/Users/alped/Desktop/Docjava/binario.ddt"));) {

			fich.writeInt(contCaracteres);
			fich.writeInt(contPalabras);
			fich.writeInt(contLineas);
		} catch (Exception e) {

			System.out.println("Error entrada/salida de datos");
		}

	}
	
	
	 static void leer_ficheroBinario(File file) throws Exception, Exception {
		 
		 try (DataInputStream bin = new DataInputStream(
					new FileInputStream("C:/Users/alped/Desktop/Docjava/binario.ddt"));) {
			 
			    System.out.println("Caracteres:" + bin.readInt());
			    System.out.println("Palabras:" +bin.readInt());
			    System.out.println("Lineas:" +bin.readInt());
		 }catch(Exception e) {
			 System.out.println("Error entrada/salida de datos");
		 }
	 }


	 
	  static void escribir_en_otro_ficheroTexto(File file) throws Exception {
		  
		  
		 try {
			    FileWriter fr=new FileWriter("C:/Users/alped/Desktop/Docjava/otrofichero.txt");
		 		            
		       fr.write(contCaracteres);
		       fr.write(contPalabras);
		       fr.write(contLineas);
		       
		       fr.close();
		       
		 }catch(Exception e) {
			 System.out.println("Error entrada/salida de datos");
		 }
		  
}
}