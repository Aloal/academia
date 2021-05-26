package unidad8.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		

		Scanner in = new Scanner(System.in);

		System.out.println("¿Que fichero dedeas leer; El Quijote UTF8.txt ó  El Quijote Windows ISO-8559-1.txt?");

		do {
			System.out.println("Introduce   UTF8 , 8559 o fin para terminar");

		} while (ejecutar(in.nextLine()));

	}

	static boolean ejecutar(String linea) throws FileNotFoundException, IOException {
		

		File archivo=new File("C:/Users/alped/Desktop/FORMACION PROFESIONAL/Programacion/El Quijote ISO-8859-1.txt");
		
		File archivo2=new File("C:/Users/alped/Desktop/FORMACION PROFESIONAL/Programacion/El Quijote UTF-8.txt");
		
		
		Scanner s = new Scanner(linea);
		try {
			String cmd = s.next("UTF8|8559|fin");
			switch (cmd) {
			case "UTF8":
				cmdUtf8(archivo);
				break;
			case "8559":
				cmd8559(archivo2);
				break;
			case "fin":
				return false;

			}
		} catch (NoSuchElementException e) {
			System.out.println("no se reconoce el comando");
		} finally {
			s.close();
		}
		return true;

	}
	
				
		
		public static void cmdUtf8(File archivo) throws FileNotFoundException, IOException {
			
	        String cadena;
	        FileReader f = new FileReader(archivo);
	        BufferedReader b = new BufferedReader(f);
	        while((cadena = b.readLine())!=null) {
	            System.out.println(cadena);
	        }
	        b.close();
	    }
		
		
		
		public static void cmd8559(File archivo2) throws FileNotFoundException, IOException {
			
	        String cadena;
	        FileReader f = new FileReader(archivo2);
	        BufferedReader b = new BufferedReader(f);
	        while((cadena = b.readLine())!=null) {
	            System.out.println(cadena);
	        }
	        b.close();
	    }
	
	
	}

	

		
		
		
		
	
