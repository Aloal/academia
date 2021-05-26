package colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ejercicio8 {

	public static void main(String[] args) throws IOException {
		
				
		System.out.println("JUEGO DE CARTAS");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		do {
			
		System.out.println("Introduce un comando:[añadirjugador: o  fin]");
		} while (ejecutar(in.readLine()));
		
		
		
	}
	

	private static String [] rango={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	private static String [] palo={"S","H","D","C"};

	
		
		
	static boolean ejecutar(String linea) {
				
		Scanner s = new Scanner(linea);
		
		try {
			String cmd = s.next("añadirjugador:|fin");
			switch (cmd) {
			case "añadirjugador:":
				nuevoJugador();
				break;
		    case "fin":
		    	finalPartida();
				return false;
			}
		} catch (NoSuchElementException e) {
			System.out.println("no se reconoce el comando");
		} finally {
			s.close();
		}
		return true;
	}
	
	
	
	
	   static void nuevoJugador() {
		   
		   Scanner n=new Scanner(System.in);
		   
		   jugadores=new TreeMap<String, Set<String>>();			
						
			System.out.println("Introduce el nombre del jugador");
			String nombre=n.next();
			
			 System.out.println("¿Cuantas cartas deseas?");
			int numCartas=n.nextInt();
			
			Set<String>mano=new HashSet<String>();

			do {		
		        generarNaipe();
			    
			    mano.add(Naipe);
				
			  }while(mano.size()<numCartas);
			
			System.out.println("Mano del jugador:" + nombre + mano);
			
			jugadores.put(nombre, mano);
			
	   }
	   
	  
		 static Map<String, Set<String>>jugadores;
		 
		 
	
		
		 
		 
	     static void finalPartida() {
	    	 
	    	
	    	 
	    	 System.out.println("los jugadores son los siguientes:");
	    	 
	    	 	    	
			Iterator<Entry<String,Set<String>>> i= jugadores.entrySet().iterator();
	    	  while(i.hasNext()) {
	    		  Entry<String,Set<String>>e=i.next();
	    		  System.out.printf("Nombre:- Mano:",  e.getKey(), e.getValue());
	    		  
	    	  }
	    	 
	     }
	   
	  
	   
	   
		 
	   static String Naipe;
	   
	   
	   static void generarNaipe() {
			 
			 Random s= new Random();
				
				int iPalo = (int) (Math.random()*4);
				int iRango = (int) (Math.random()*13);
				
			String Naipe= rango[iRango] + palo[iPalo];
				
						 
		 }
	   
	   
	   static int valorarNaipe(String naipe) {
		   
		   String [] parte= Naipe.split("");
		   
		   String rangos=parte[0];
		   String palos=parte[1];
		   
		  
		      
		     
		   
		return 0;
		   
	   }
	   
	   
			
			
	   
			
		
	   
	}
	
	
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		



