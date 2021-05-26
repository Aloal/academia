package ejercicios_propios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class buffer {

	public static void main(String[] args) {
	

	}
	
	
	
	class leerfichero{
		
		public void lee() {
			
			try {
				FileReader entrada=new FileReader("C:/Users/alped/Desktop/FORMACION PROFESIONAL/Programacion/El Quijote UTF-8.txt");
				
				BufferedReader mibuffer=new BufferedReader(entrada);
				
				String linea="";
				
				while(linea!=null) {
					
					linea=mibuffer.readLine();
					
					System.out.println(linea);
				}
				
			}catch(IOException e) {
				System.out.println("No se ha encontrado el archivo");
			}finally {
				try {
					entrada.close();
				}catch(IOException e) {
					
				}
			}
		}
	}

}
