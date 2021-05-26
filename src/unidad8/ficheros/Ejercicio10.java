package unidad8.ficheros;

import java.awt.event.ActionEvent;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

import ejercicio6.Contacto1;
import ejercicios_propios.Departamento;

public class Ejercicio10 implements Serializable {

	 static Map<String, Contacto1> agenda= new TreeMap<>();
	 
	 
		public static void main(String[] args) throws IOException {
					
			agenda.put("Marcos",new Contacto1("Marcos", "788965874","658965241"));
			
			agenda.put("Andrea",new Contacto1("Andrea", "98574125", "sin telefono adicional"));
			
	        agenda.put("Luis",new Contacto1("Luis", "69857412", "98745214"));
			
			agenda.put("Marta",new Contacto1("Marta", "600258963", "sin telefono adicional"));
			 
							
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			do {
				System.out.print("> ");
			} while (ejecutar(in.readLine()));
		}



			static String nombre;
			static String numero;
			static String numero2;
			
			static boolean ejecutar(String linea) {
				Scanner s = new Scanner(linea);
				try {
					String cmd = s.next("añadir:|buscar:|eliminar:|contactos:|guardarDatos:|cargarDatos:|salir");
					switch (cmd) {
					case "añadir:":
						addContacto();
						break;
						
					case "buscar:":
						buscarContacto();
						break;
						
					case "eliminar:":
						eliminarContacto();
						
					case "contactos:":
						mostrarContactos();	
						break;
						
					case "guardarDatos:":
					      guardarDatos();
					      
					case "cargarDatos:":
					      cargarDatos();
					      
					case "salir":
						return false;
					}
				} catch (NoSuchElementException e) {
					System.out.println("no se reconoce el comando");
				} finally {
					s.close();
				}
				return true;
			}
			
			
			 static Scanner n= new Scanner (System.in);
			 
			static void addContacto() {
				System.out.println("introduce nombre del contacto a añadir");
				  nombre=n.next();
				
				
						if(agenda.containsKey(nombre))
							System.out.println("el contacto ya existe");
						else {
							System.out.println("El contacto es nuevo");
							
							System.out.println("Introduce un numero de telefono para el contacto");
							
					         numero=n.next();
					         
					         
					         
					         System.out.println("Introduce otro numero de telefono para el contacto si es que tiene mas de un telefono"); 
					         
					         numero2=n.next();
					         
					         
						     System.out.println("Contacto agregado con exito");
						     
						     agenda.put(nombre,new Contacto1(nombre, numero, numero2));
						}
					     
					
		       }
			
			

			 static  void eliminarContacto() {
				 System.out.println("introduce nombre del contacto a eliminar");
				  nombre=n.next();
				 
					 if (agenda.containsKey(nombre)) {
						  agenda.get(nombre);
					        agenda.remove(nombre);
					    } else {
					        System.out.println("No hay ningun contacto con ese nombre.");  
				 }
			}
			
			
			   
			   static boolean buscarContacto() {
				   System.out.println("introduce nombre del contacto a buscar");
					  nombre=n.next();
				   
					  if (agenda.containsKey(nombre)) {
						  System.out.println( " Los numeros del contacto " +  "son"  + agenda.get(nombre));
					      return true;
					  } else {
						  System.out.println("No hay ningun contacto con ese nombre."); 
					  }
					  return false;
					  
				  }
			   
			   
			 static  void mostrarContactos() {
				      
					Iterator<Entry<String, Contacto1>> i= agenda.entrySet().iterator();
					 while(i.hasNext()){
					   Entry<String, Contacto1> e =i.next();
					   System.out.println("Contacto:"  + e.getValue());
					 }
			  }
			  
			  
		 static void guardarDatos() {
			 
			 
			    try {    //Escribimos el objeto en un fichero externo
			    	
			    	ObjectOutputStream escribir_en_fichero=new ObjectOutputStream(new FileOutputStream("C:/Users/alped/Desktop/Docjava/agendacontactos.txt", true));
			    	
			    	escribir_en_fichero.writeObject(agenda);
					
					escribir_en_fichero.close();
					
					System.out.println("Informacion guardada en fichero");
				
					
			    }catch(Exception e) {
			    	System.out.println("No se ha encontrado fichero para guardar");
			    }
			 
		}
			 
			 
			 
			static void cargarDatos() {
				
				//Recupramos el objeto del medio de almacenamiento externo
				
				
				try {
					
					ObjectInputStream recuperar_fichero=new ObjectInputStream(new FileInputStream("C:/Users/alped/Desktop/Docjava/agendacontactos.txt"));
					
					
					Map agenda_recuperada=(Map) recuperar_fichero.readObject();
					
					recuperar_fichero.close();
					
					
					Iterator<Entry<String,Contacto1>> i= agenda_recuperada.entrySet().iterator();
					while(i.hasNext()) {
						Entry<String,Contacto1> e= i.next();
						System.out.println( e.getValue());
					}
					
				}catch(Exception e) {
					System.out.println("No se ha podido recuperar informacion del fichero");
				}
				
				
				
			}
			 
			
			
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			
}
