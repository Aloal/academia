package ejercicio6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio6 {
	
	

	public static void main(String[] args) {
		
		 Contacto1 contacto = new Contacto1("Andrea","89658742","685748523");
		 Contacto1 contacto1 = new Contacto1("Luis","89658111","658741256");
		 Contacto1 contacto2 = new Contacto1("Marcos","78588742", "sin telefono adicional");
		 Contacto1 contacto3 = new Contacto1("Marta","98541255", "895632541");
		 
		  
		 Scanner s = new Scanner(System.in);
										
		Agenda1 agendaTelefonica=new Agenda1();
	 
	  
				 		
		String nombre;
		String numero;
		boolean salir=false;
		
		while(!salir) {
			
			System.out.println("1. Añadir contacto");
			System.out.println("2. Buscar contacto por nombre");
			System.out.println("3. Eliminar contacto por nombre");
			System.out.println("4. Mostrar todos los contactos");
			System.out.println("5. Salir");
		
						
		try {
					
			System.out.println("Introduce un comando [ añadir:|buscar:|eliminar:|contactos|salir ]");
					
			String cmd = s.next("añadir:|buscar:|eliminar:|contactos|salir");
			switch (cmd) {
			case "añadir:":
				
				System.out.println("Escribe un nombre");
		    	nombre=s.next();
		    	
		    	System.out.println("Escribe un telefono");
		    	numero=s.nextLine();
		    	
		    	/*Pattern p = Pattern.compile("\\+[0-9]"); 
				   Matcher matcher=p.matcher(numero.substring(0,9));
			        
			       
				   if(matcher.matches())
			        {
					   agendaTelefonica.addContacto(nombre, numero);
			            
			        }else{
			            System.out.println("No es correcto este telefono");
			        }    s.nextLine();
		    	
		    	*/
		    	agendaTelefonica.addContacto(nombre, numero);
		    	
		    		            		    			    												
				break;
				
			case "buscar:":
				
				System.out.println("Escribe un nombre");
		    	nombre=s.next();
		    	
		    	agendaTelefonica.buscarContacto(nombre);
		    	
				break;
				
				
			case "eliminar:":
				  
				System.out.println("Escribe un nombre");
		    	nombre=s.next();
		    	
		    	agendaTelefonica.eliminarContacto(nombre);
				
				break;
				
			case "contactos":
				
				 agendaTelefonica.mostrarContactos();
				
				
				break;	
				
			case "salir":
				salir=true;
				break;	
			
			default:
				System.out.println("solo uno de esos comandos");
			}
		    
	  }catch(Exception e) {
		  System.out.println("debes insertar uno de los comandos");
		  s.next();
	  }
	
		
	
		}
	}
	
}
		   


