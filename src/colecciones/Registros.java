package colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Registros {

	public static void main(String[] args) {
		 
		Scanner s=new Scanner(System.in);
		
		Map<Integer,String> registro =new HashMap<>();
		
		
		registro.put(1, "Marcos");
		registro.put(2, "Lucia");
		registro.put(3, "Roberto");
		registro.put(4, "David");
		registro.put(5, "Ana");
		registro.put(6, "Adolfo");
		registro.put(7, "Ernesto");
		registro.put(8, "Olivia");
		
		
				
		int Id;
		String nombre;
		int opcion;
		boolean salir=false;
		
		
		while(!salir) {
			
			  System.out.println("\n1. Añadir contacto");
			  System.out.println("2. Listar contactos");
			  System.out.println("3. Comprobar si existe contacto");
			  System.out.println("4. Eliminar contacto");
			  System.out.println("5. Salir");
			  
			  
			  try {
				  
				  System.out.print("Introduzca una opcion");
				  opcion=s.nextInt();
				  
				      switch(opcion) {
				      
				      case 1:
							
							System.out.println("Introduzca su Id");
					    	Id=s.nextInt();
					    	
					    	
					    	    if(!registro.containsKey(Id)) {
					    	    	
					    	    	 System.out.println("Introduzca su nombre");
								    	nombre=s.nextLine();			   	
							    	
					    	    	
					    	    	 registro.put(Id,nombre);
					    	    	 
							          System.out.println("El registro se ha añadido con exito");
							          
					    	    }else {
					    	    	System.out.println("Ya existe ese contacto");
					    	    }
					    						    	
							break;
						
						case 2:
							  
							 if(registro.entrySet().isEmpty()) {
								 System.out.println("No existe ese contacto");
								 
							 }else {
								 for(Map.Entry<Integer, String> i: registro.entrySet()) {
									 System.out.println("el nombre del contacto es" +" "+  i.getValue() + "y su numero es" +" " + i.getKey());
								 }
							 }
							
							break;
							
						case 3:
							
							 System.out.println("intoduzca el numero que desea comprobar si existe");
							 
							 Id=s.nextInt();
							 
							 if(registro.containsKey(Id)) {
								 System.out.println("Si existe el contacto");
							 }else {
								 System.out.println("No existe el contacto");
							 }
											
							break;	
							
							
						case 4:
							  
							 System.out.println("intoduzca el numero que desea eliminar");
							 
							 Id=s.nextInt();
							 
							 if(registro.containsKey(Id)) {
								 registro.remove(Id);
								 
								 System.out.println("Se ha eliminado el contacto");
								 
							 }else {
								 System.out.println("No existe el contacto");
							 }
							
							break;
							
						case 5:
							
							System.out.println("Gracias por su registro");
							System.exit(0);
							break;
							
						default:
							System.out.println("Opcion no disponible");
							
							break;
										    
				      }
				  
				  
			  }catch(Exception e) {
				  System.out.println("Error" + e);
			  }
		}
		

	}

}
