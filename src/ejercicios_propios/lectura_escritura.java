package ejercicios_propios;

import java.io.*;

public class lectura_escritura {

	public static void main(String[] args) {

		int contador = 0;
		int datos_entrada[]=new int[250000];

		try {

			FileInputStream archivo_lectura = new FileInputStream("C:/Users/alped/Desktop/Docjava/Captura1.png");

			boolean final_ar = false;

			while (!final_ar) {

				int byte_entrada = archivo_lectura.read();
				
				if(byte_entrada!=-1)
				
				datos_entrada[contador]=byte_entrada;
				

				else 
					
				final_ar = true;

				System.out.println(datos_entrada[contador]);
				contador++;
			}

			archivo_lectura.close();

		} catch (IOException e) {
			System.out.println("no se encuentra imagen");
		}

		System.out.println(contador); // numero de bytes del archivo
		
		crea_fichero(datos_entrada);
	}
	
	
	 static void crea_fichero(int datos_nuevo_fichero []) {
		 
		 try {
			 
			 FileOutputStream fichero_nuevo=new FileOutputStream("C:/Users/alped/Desktop/Docjava/Captura1_copia.png");
			 
			 for(int i=0; i<datos_nuevo_fichero.length;i++) {
				 
				 fichero_nuevo.write(datos_nuevo_fichero[i]);
				 
			 }
			 
			 fichero_nuevo.close();
			 
		 }catch(IOException e) {
			 System.out.println("Error al crear el archivo");
		 }
		 
	 }

}
