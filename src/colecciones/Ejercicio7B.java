package colecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio7B {
public static void main(String[] args) {
		
		System.out.println("Se crearán dos conjuntos de numeros con n y m elementos");
		
		Scanner in = new Scanner(System.in);
		
		Set<Integer> lista1 = new HashSet<Integer>();
		Set<Integer> lista2 = new HashSet<Integer>();
		
		System.out.println("Introduce una cantidad (n) de numeros para conjunto 1:");	
						
		int n = in.nextInt();
		
		do {
			System.out.println("Introduce un numero para el conjunto 1");
		    
			Integer numeros1 = in.nextInt();
			lista1.add(numeros1);
			
		}while(lista1.size()<n);
		
		System.out.println(" Conjunto 1:" + lista1);
		
		 		
		System.out.println("Introduce una cantidad (m) de numeros para conjunto 2:");
		
		int m=in.nextInt();
		
		do {
			System.out.println("Introduce un numero para el conjunto 2");
		    
			Integer numeros2 = in.nextInt();
			lista2.add(numeros2);
			
		}while(lista2.size()<m);
		
		
				
			
		System.out.println("Conjunto 2: " + lista2);
		
		in.close();
		
		
       Set<Integer> lista3 = new HashSet<Integer>(lista1);
		
		// result.addAll(set2); // Union
		
		  lista3.retainAll(lista2); // Intersection
		
		  System.out.println("Interseccion de ambos conjuntos" + lista3);
	   }
		
	}




