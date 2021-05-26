package unidad8.ficheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import ejercicios_propios.Departamento;

public class Serializandolibros {

	public static void main(String[] args) {
	
		Publicación[] publicaciones=new Publicación[5];
		
		
		    publicaciones[0]= new Libro(1, "El Quijote", 1605, "Cervantes");             //Libros
			publicaciones[1]= new Libro(2,"La Celestina", 1938, "Fernando de Rojas");
			publicaciones[2]= new Libro(3,"El viejo y el mar", 1943, "Hemingway");
			publicaciones[3] = new Revista(4,"Muy interesante", 5 , 9 ,2018, 169);        //Revistas
			publicaciones[4]= new Revista(5,"Hola", 1, 4, 2013, 5896);
			
 try {
				 
				 //Escribimos el objeto en un medio de almacenamiento externo
				 
			 ObjectOutputStream escribiendo_fichero=new ObjectOutputStream(new FileOutputStream("C:/Users/alped/Desktop/Docjava/publicaciones.dat"));
				 
				escribiendo_fichero.writeObject(publicaciones); 
				
				escribiendo_fichero.close();
				
				//Recupramos el objetos del medio de almacenamiento externo
				
				ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream("C:/Users/alped/Desktop/Docjava/publicaciones.dat"));
			 
				Publicación[] publicaciones_recuperadas=(Publicación[]) recuperando_fichero.readObject();
				
				
				recuperando_fichero.close();
				
				// Recuperamos la informacion a ver si contiene el array
				
				for(Publicación e: publicaciones_recuperadas) {
					System.out.println(e);
				}
				
				
				
				
			 }catch(Exception e) {
				 
			 }
			
	}

}
