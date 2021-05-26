package colecciones_adicionales;

import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class PruebaAdicionales {

	public static void main(String[] args) {

		Deque<Integer> pila1 = new LinkedList<>();
		pila1.push(5);
		pila1.push(8);
		pila1.push(1);
		pila1.push(3);
		pila1.push(4);
		pila1.push(7);

		System.out.println(pila1);
		
		//Colecciones1.duplicar(pila1);

		
	  // Ejercicio 3
		
		
		
		  Map<String, String> mapa1 = new TreeMap<String, String>();
		  mapa1.put("Fernando", "56");
		  mapa1.put("Lucia", "22");
		  mapa1.put("Roberto", "78");
		  mapa1.put("Fernando", "43");
		  mapa1.put("Recaredo", "65");
		  mapa1.put("Ana", "86");
		  
		
		     valoresUnicos(mapa1);
		
		
		
		
		
	
	
	 //Ejercicio 8
	
			
	  Map<String, Integer> mapa1 = new TreeMap<String, Integer>();
	  mapa1.put("Fernando", 56);
	  mapa1.put("Lucia", 22);
	  mapa1.put("Roberto", 78);
	  mapa1.put("Marta", 43);
	  mapa1.put("Recaredo", 65);
	  mapa1.put("Ana", 86);
	  
	  	  	  
	// Imprimimos mapa1 con un Iterador
	  
	mapa1.forEach((nombre,edad)->System.out.println("nombre:" + nombre+ " - "+ "edad:"+ edad));
		  
	  	
	  Map<String, Integer> mapa2 = new TreeMap<String, Integer>();
	  mapa2.put("Carlos", 54);
	  mapa2.put("Lucia", 22);
	  mapa2.put("Roberto", 78);
	  mapa2.put("Enrique", 35);
	  mapa2.put("Oscar", 59);
	  mapa2.put("Ana", 86);
	  
	// Imprimimos mapa1 con un Iterador
	  
	  mapa2.forEach((nombre,edad)->System.out.println("nombre:" + nombre+ " - "+ "edad:"+ edad)); 
	  
	
	  Map<String, Integer> mapa3 = new TreeMap<String, Integer>();
	  
	  mapa3 = Colecciones1.interseccion(mapa1, mapa2);  
	  
	  mapa3.forEach((nombre,edad)->System.out.println("nombre:" + nombre+ " - "+ "edad:"+ edad));
	 	  
	  
	        
	         
		
		  
	  
	
	
	
	}

	
	
}


