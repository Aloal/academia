package colecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio7C {
	
	static Scanner s = new Scanner(System.in);


	public static void main(String[] args) {
		
		System.out.println("Introduce las cantidades de elementos  (N y  M) que tendrán dos conjuntos");

		String numeros;
		numeros = s.next();

		String[] cantidad= numeros.split("");
		
		int[]cant= new int[cantidad.length];
		
		for (int i = 0; i < cant.length; i++) {
			cant[i] = Integer.parseInt(cantidad[i]);
		
	    }
		
		N = cant[0];
		M = cant[1];
		
		System.out.println("Cantidad de elementos del conjunto 1:"+  N + " elementos");
		System.out.println("Cantidad de elementos del conjunto 2:"+  M +  " elementos");
		
		
		 Scanner n = new Scanner(System.in);
		
		System.out.println("Introduce en esta segunda linea, los N elmentos del conjunto1 y luego los M elmentos del conjunto2, separados por un espacio en blanco  ");
		
		String elementos;
		elementos=n.nextLine();
		
		String[] valores = elementos.split(" ");
		
					
		
		for(int j=0; j<N;j++) {
			
			conjunto1.add(valores[j]);
			
		}
		   System.out.println("Elmentos del conjunto1:" + conjunto1);
		   
		   
		  
       for(int j=N; j<valores.length;j++) {
			
			conjunto2.add(valores[j]);
			
		}
       System.out.println("Elmentos del conjunto2:" + conjunto2);	
       
       
       
		  
       Set<String> conjunto3 = new HashSet<String>(conjunto1);
		
    		// result.addAll(set2); // Union
    		
    		  conjunto3.retainAll(conjunto2); // Intersection
    		
    		  System.out.println("Interseccion de ambos conjuntos" + conjunto3);
		  
		  
}
	
	
	 static Set<String>conjunto1=new HashSet<String>();
	 static Set<String>conjunto2=new HashSet<String>();
	 static int N;
	 static int M;
	
}
