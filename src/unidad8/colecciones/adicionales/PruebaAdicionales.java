package unidad8.colecciones.adicionales;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class PruebaAdicionales {

	public static void main(String[] args) {
		
	//Ejercicio12

		Deque<Integer> pila1 = new LinkedList<>();
		pila1.push(5);
		pila1.push(8);
		pila1.push(1);
		pila1.push(3);
		pila1.push(4);
		pila1.push(7);

		//System.out.println(pila1);
		
		//Colecciones1.duplicar(pila1);

		
	
	
	//Ejercicio11
		
		List<Integer>lista1=new ArrayList<Integer>();
		
		lista1.add(5);
		lista1.add(8);
		lista1.add(6);
		lista1.add(1);
		lista1.add(4);
		lista1.add(1);
		
   List<Integer>lista2=new ArrayList<Integer>();
		
		lista2.add(2);
		lista2.add(6);
		lista2.add(7);
		lista2.add(3);
		lista2.add(1);
		
		System.out.println(lista1);
		System.out.println(lista2);
		
		//Colecciones1.union(lista1, lista2);
		Colecciones1.contarComunes(lista1, lista2);
	
		
		 System.out.println("");
		
	 //Ejercicio 8
	
	  Map<String, Integer> mapa1 = new TreeMap<String, Integer>();
	  mapa1.put("Fernando", 56);
	  mapa1.put("Lucia", 22);
	  mapa1.put("Roberto", 78);
	  mapa1.put("Marta", 43);
	  mapa1.put("Recaredo", 65);
	  mapa1.put("Ana", 86);
	  
	  
	  System.out.println("");
	  	  	  
	// Imprimimos mapa1 con un Iterador
	  
	      System.out.println("primer mapa:");
		
	      System.out.println("");
	  
	mapa1.forEach((nombre,edad)->System.out.println("nombre:" + nombre+ " - "+ "edad:"+ edad));
	
	       System.out.println("");
	
	      System.out.println("segundo mapa:");
	
	      System.out.println("");
		  
	  	
	  Map<String, Integer> mapa2 = new TreeMap<String, Integer>();
	  mapa2.put("Carlos", 54);
	  mapa2.put("Lucia", 22);
	  mapa2.put("Roberto", 78);
	  mapa2.put("Enrique", 35);
	  mapa2.put("Oscar", 59);
	  mapa2.put("Ana", 86);
	  
	// Imprimimos mapa2 con un Iterador
	  
	  mapa2.forEach((nombre,edad)->System.out.println("nombre:" + nombre+ " - "+ "edad:"+ edad)); 
	  
	
	  Map<String, Integer> mapa3 = new TreeMap<String, Integer>();
	  
	  mapa3 = Colecciones1.interseccion(mapa1, mapa2);  
	  
	        System.out.println("");
	  
	        System.out.println("mapa interseccion:");
	  
	  mapa3.forEach((nombre,edad)->System.out.println("nombre:" + nombre+ " - "+ "edad:"+ edad));
	 	  
	  
	        
	  //Ejercicio5
	  
	  Deque<Integer> pila3 = new ArrayDeque<>();
		pila3.push(75);
		pila3.push(15);
		pila3.push(-10);
		pila3.push(6);
		pila3.push(-25);
		pila3.push(46);
	  
	  
	  System.out.println(" pila sin ordenar"+ pila3);
	  System.out.print(" pila ordenada:  ");
	   Colecciones1.negativosAbajoPositivosArriba(pila3);
	  
	  
	         
	  // Ejercicio7
	  
	  Deque<Integer> pila4 = new ArrayDeque<>();
		pila4.push(1);
		pila4.push(25);
		pila4.push(10);
		pila4.push(12);
		pila4.push(6);
		pila4.push(89);
	  
		System.out.println(pila4);
	    Colecciones1.eliminarSiMayoresEncima(pila4);
	  
	    
	    
	    
	    
	     
	     //Ejercicio 12
	     
	     Deque<Integer> pila5 = new ArrayDeque<>();
			pila5.push(2);
			pila5.push(6);
			pila5.push(9);
			pila5.push(4);
			pila5.push(3);
			pila5.push(7);
		  
		  
		  System.out.println(pila5);
		  Colecciones1.duplicar(pila5);
		  
		  
		  
		  //Ejercicio9
			
		  Map<String, Integer> mapa6 = new HashMap<String, Integer>();
		  mapa6.put("Carlos", 54);
		  mapa6.put("Lucia", 22);
		  mapa6.put("Roberto", 54);
		  mapa6.put("Enrique", 35);
		  mapa6.put("Oscar", 35);
		  mapa6.put("Ana", 54);
	       System.out.println("La edad que menos se repite es:"+ Colecciones1.valorMenosRepetido(mapa6) );
	    
	
		  
		  
	       
	         // Ejercicio 10
	       
	       List<String>frutas=new ArrayList<String>();
	       
	       frutas.add("banana");
	       frutas.add("melon");
	       frutas.add("pera");
	       frutas.add("tomate");
	       
	       
	       Colecciones1.cuentaPares(frutas);
	       
	       
	}
	
	
	
	  
}


