package unidad8.ficheros;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4P {

	public static void main(String[] args) throws Exception, Throwable {

		leercontarPalabrasLineasCaracter(archivo);
		escribir_en_ficheroBinario(archivo);
		leer_ficheroBinario(archivo);

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
				new FileOutputStream("C:/Users/alped/Desktop/Docjava/binario.ddt",true));) {

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

}
