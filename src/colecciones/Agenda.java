package colecciones;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Agenda {
	
	  private Contacto [] contactos;
	  
	  
	  
	  public Agenda() {
		  
		  this.contactos=new Contacto[1000];
	  }
	  
	  public Agenda(int tamaño) {
		  
		  this.contactos=new Contacto[tamaño];
		  
	  }
	  
	   public void AniadirContacto(Contacto c) {
		   
		   if(existeContacto(c)) {
			   System.out.println("Este contacto ya existe");
		   }else {
			   boolean encontrado=false;
			   
			   for(int i=0;i<contactos.length;i++) {
				   if(contactos[i]==null) {
					   contactos[i]=c;
					   encontrado=true;
				   }
			   }
			   
			   if(encontrado==false) {
				   System.out.println("Se ha añadido el contacto");
			   }else {
				   System.out.println("no se ha podido añadir");
			   }
		   }
		   
	   }
	   
	   
	   
	   public boolean existeContacto(Contacto c) {
       
		   for(int i=0;i<contactos.length;i++) {
			   if(contactos[i]!=null && c.equals(contactos[i])) {
				  return true;
			   }
		   }
		   return false;
	   }
	   
	   
	   public void listarContacto() {
		   for(int i=0;i<contactos.length;i++) {
			   if(contactos[i]!=null) {
				   System.out.println("contactos[i]");
			   }
		   }
	   }
		   
		   
		 public void buscaPorNombre(String nombre) {
			 
			 boolean encontrado= false;
		 
			 for(int i=0;i<contactos.length && !encontrado;i++) {
				   if(contactos[i]!=null && contactos[i].getNombre().equalsIgnoreCase(nombre)) {
					   System.out.println("Su telefono es" + contactos[i].getTelefono());
					   encontrado=true;
				   }
		 }
			 if(!encontrado) {
				 System.out.println("no se ha encontrado el contacto");
			 }
	 } 
		   
		   
		   
		   public void eliminarContacto(Contacto c) {
			   
			   boolean encontrado =false;
			   for(int i=0;i<contactos.length;i++) {
				   if(contactos[i]!=null && contactos[i].equals(c)) {
					   contactos[i]=null;
					   encontrado= true;
				   }
		   }
			   
			   if(!encontrado) {
				   System.out.println("No se ha elminado el contacto");
			   }
		   
		   
		   }
		   
		   
		   
		   
		   
	   
	   
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	/*static void addContacto( int numero, String nombre) {
		for(Integer numeros: agenda.keySet())
			if(agenda.containsKey(numero))
				System.out.println("el numero de telefono ya existe");
			else 
				System.out.println("El numero es nuevo, se procederá a añadir el contacto con ese numero");
				        
		     agenda.put(numero, nombre);
  	  
			
	}

	  
	  static void mostrarContactos() {
	      
		Iterator<Entry<Integer,String>> i= agenda.entrySet().iterator();
		 while(i.hasNext()){
		   Entry<Integer,String> e =i.next();
		   System.out.println("Clave: " + e.getKey() + " -> Valor: " + e.getValue());
		 }
  }
	 
	 
	 
	 static void eliminarContacto(String nombre) {
		 
		 if (agenda.containsKey(nombre)) {
			  agenda.get(nombre);
		        agenda.remove(nombre);
		    } else {
		        System.out.println("No hay ningun contacto con ese nombre.");  
	 }
}
	 
	 
	  static boolean buscarContacto(String nombre) {
		  if (agenda.containsKey(nombre)) {
			  System.out.println( " El numero del contacto " + nombre + "es"  + agenda.get(nombre));
		      return true;
		  } else {
			  System.out.println("No hay ningun contacto con ese nombre."); 
		  }
		  return false;
		  
	  }*/
	

}
