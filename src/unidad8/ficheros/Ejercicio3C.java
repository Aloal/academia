package unidad8.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Ejercicio3C {

	static int palabrasTotales=0;
	static int lineasTotales=0;
	static int caracterTotal=0;
	
	
	
	public static void main(String[] args) {
	
		 //objeto archivo, con la ruta del archivo a leer.
		
		File archivo=new File("C:/Users/alped/Desktop/FORMACION PROFESIONAL/Programacion/El Quijote UTF-8.txt");
		
		 contarPalabrasLineasCaracter(archivo);

	}
	
	
	public static void contarPalabrasLineasCaracter(File archivo) {
		
		try {
			if(archivo.exists()) {            //Si existe el archivo se lee
				BufferedReader archivoleer=new BufferedReader(new FileReader (archivo));
				
				 String linealeida;
				 //Mientras la linea leida no se nula
				 
				 while((linealeida=archivoleer.readLine())!=null) {
					 
					 //contamos las palabras
					 
					 StringTokenizer st=new StringTokenizer(linealeida);
					 
					 										 
					 //aumentamos las lineas y las palabras.
					 
					 
					 lineasTotales=lineasTotales+1;
					 
														
					 caracterTotal=caracterTotal+st.countTokens();
				 }
				 
				 System.out.println("");
				 System.out.println("Numero de lineas totales:" + lineasTotales);
				 System.out.println("Numero de palabras totales:" + palabrasTotales);
				 System.out.println("Numero de caracteres totales:" + caracterTotal);
				 
				 //SE cierra la lectura del archivo
				 
			}else {
				 System.out.println("No existe el archivo" );
			}
		}catch(Exception e){
		     System.out.println(e.getMessage());
		}
	}
	
	 
}
