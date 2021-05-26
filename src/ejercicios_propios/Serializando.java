package ejercicios_propios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializando {

	  public static void main(String[] args) {
		   
		    Departamento[] seccion=new Departamento[5];
		   
		    seccion[0]= new Departamento(1,"Informatica","Soria");
			seccion[1]= new Departamento(2,"Administracion","Oviedo");
			seccion[2]= new Departamento(3,"Enfermeria","Sevilla");
			seccion[3] = new Departamento(4,"Tecnicos","Valencia");
			seccion[4]= new Departamento(5,"Jefatura","Madrid");
			
			
			 try {
				 
				 //Escribimos el objeto en un medio de almacenamiento externo
				 
			 ObjectOutputStream escribiendo_fichero=new ObjectOutputStream(new FileOutputStream("C:/Users/alped/Desktop/Docjava/departamento.dat"));
				 
				escribiendo_fichero.writeObject(seccion); 
				
				escribiendo_fichero.close();
				
				//Recupramos el objetos del media de almacenamiento externo
				
				ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream("C:/Users/alped/Desktop/Docjava/departamento.dat"));
			 
				Departamento[] departamentos_recuperados=(Departamento[]) recuperando_fichero.readObject();
				
				recuperando_fichero.close();
				
				for(Departamento e: departamentos_recuperados) {
					System.out.println(e);
				}
				
			 }catch(Exception e) {
				 
			 }
				 
			 
			 
		   
		   
	       }
	
}
