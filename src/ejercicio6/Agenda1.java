package ejercicio6;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Agenda1 {
	
   private Map<String, String> agenda;
   
	
	 public Agenda1() {
		agenda = new TreeMap<>();
	  }
	 
	 
	  	 
	  void addContacto(String nombre, String numero) {
			for(String numeros: agenda.keySet())
				if(agenda.containsKey(numero))
					System.out.println("el numero de telefono ya existe");
				else 
					System.out.println("El numero es nuevo, se procederá a añadir el contacto con ese numero");
					        
			     agenda.put(numero, nombre);
			     

       }
	  
	  
	  boolean buscarContacto(String nombre) {
		  if (agenda.containsKey(nombre)) {
			  System.out.println( " El numero del contacto " + nombre + "es"  + agenda.get(nombre));
		      return true;
		  } else {
			  System.out.println("No hay ningun contacto con ese nombre."); 
		  }
		  return false;
		  
	  }
	  
	  
	   void eliminarContacto(String nombre) {
			 
			 if (agenda.containsKey(nombre)) {
				  agenda.get(nombre);
			        agenda.remove(nombre);
			    } else {
			        System.out.println("No hay ningun contacto con ese nombre.");  
		 }
	}
	  
	  
	   
	    void mostrarContactos() {
		      
			Iterator<Entry<String, String>> i= agenda.entrySet().iterator();
			 while(i.hasNext()){
			   Entry<String, String> e =i.next();
			   System.out.println("Numero Telf: " + e.getKey() + " -> Nombre: " + e.getValue());
			 }
	  }
	  
	  
}
