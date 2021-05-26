package unidad8.ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;


public class Ejercicio3B {
	
	int caract=0;
    int palabras=0;
    int lineas=0;
    
    
    public Ejercicio3B() throws IOException{
    	 StreamTokenizer st=new StreamTokenizer(new FileReader("C:/Users/alped/Desktop/FORMACION PROFESIONAL/Programacion/El Quijote UTF-8.txt"));
			
 		while(st.nextToken()!=StreamTokenizer.TT_EOF){
 			 if(st.ttype==StreamTokenizer.TT_WORD) {
 				 palabras++;
 			 }
 			
 		}
 		
 		System.out.println("el numero de palabras en el archivo es: " + palabras);
 	 		
    	
    }

	public static void main(String[] args) throws IOException {
		
		new Ejercicio3B();

	}

}
