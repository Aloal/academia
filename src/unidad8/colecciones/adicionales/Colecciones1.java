package unidad8.colecciones.adicionales;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Colecciones1 {

	public static void eliminarLasDeLongitudPar(Set<String> set) {

		set.removeIf(s -> s.length() % 2 == 0);

		/*
		 * Una forma de hacerlo
		 */

//		Iterator<String> i = s.iterator();
//		while(i.hasNext())
//			if(i.next().length() % 2 == 0)
//				i.remove();

		/*
		 * Otra forma de hacerlo
		 */

//		Predicate<String> p = new Predicate<String>() {
//			@Override
//			public boolean test(String s) {
//				return s.length() % 2 == 0;
//			}
//		};

//		Predicate<String> p = (String s) -> { return s.length() % 2 == 0; };

//		Predicate<String> p = s -> s.length() % 2 == 0;
//		
//		set.removeIf(p);

		/*
		 * Lo mismo que la anterior, pero sin usar la variable
		 */

//		set.removeIf(new Predicate<String>() {
//			@Override
//			public boolean test(String s) {
//				return s.length() % 2 == 0;
//			}
//		});

//		set.removeIf((String s) -> { return s.length() % 2 == 0; });

	}

	public static boolean contieneImpares(Set<Integer> set) {

		/*
		 * Una forma de hacerlo
		 */

//		for (int n: set)
//		if (n % 2 == 1)
//			return true;
//		return false;

		/*
		 * Otra forma de hacerlo
		 */

		return set.stream().anyMatch(n -> n % 2 == 1);
	}

	public static boolean valoresUnicos(Map<String, String> mapa) {

		/*
		 * Una forma de hacerlo
		 */

//		Collection<String> v1 = mapa.values();
//		HashSet<String> v2 = new HashSet<>(v1);
//		return v1.size() == v2.size();

		/*
		 * Otra forma de hacerlo
		 */

		return mapa.values().stream().distinct().count() != mapa.values().size();
	}

	public static boolean algunaSeRepiteAlmenos3Veces(List<String> lista) {

		// la clave sera la cadena y el valor sera el numero de veces que se repite,

		HashMap<Integer, Integer> mapa = new HashMap<>();

		int tamaño = lista.size();

		for (int i = 0; i <= tamaño; i++) {
			int s = i;
			if (mapa.containsKey(s)) {
				mapa.put(s, mapa.get(s) + 1);
			} else {
				mapa.put(s, 1);
			}
		}
		for (Integer numeroveces : mapa.values())
			if (numeroveces >= 3) {
				return true;
			}
		return false;
	}

	
	
	
	// Ejercicio 6
	// la clave sera el numero y el valor mayor sera el contador,

	public static void moda(int[] lista) {

		HashMap<Integer, Integer> mapa = new HashMap<>();

		int tamaño = lista.length;

		for (int i = 0; i <= tamaño; i++) {
			int numero = lista [i];
			if (mapa.containsKey(numero)) {
				mapa.put(numero, mapa.get(numero) + 1);
			} else {
				mapa.put(numero, 1);
			}
		}

		int moda = 0, mayor = 0;
		for (HashMap.Entry<Integer, Integer> entry : mapa.entrySet()) {
			if (entry.getValue() > mayor) {
				mayor = entry.getValue();
				moda = entry.getKey();
			}
			if (mapa.isEmpty()) {
				System.out.printf("Lista vacia");
			}
		}
		System.out.printf("La moda es %d porque se repite %d veces", moda, mayor);

	}
	
	
	

	 //Ejercicio 9
	// la clave sera el nombre asociado a una edad  y las veces que se repite será el valor
	
	 
	/*public static List<Integer> valorMenosRepetido(int []numeros) {
		
        Map<Integer, Integer> auxNumeros = new HashMap<Integer,Integer>();
        
        for(int num : numeros) {
            if(!auxNumeros.containsKey(num)) {
                auxNumeros.put(num, 1);
            }else {
                auxNumeros.replace(num, auxNumeros.get(num) + 1);
            }
        }
        int min = Collections.min(auxNumeros.values());
        ArrayList<Integer> numMenores = new ArrayList<Integer>();
        auxNumeros.forEach((num, cant) -> {
            if(cant == min) {
                numMenores.add(num);
            }
        });
        return numMenores;
    }
*/
	
	
	//Ejercicio 9 
		// la clave sera la edad  y las veces que se repite será el valor
	
	
	  public static List<Integer> valorMenosRepetido(Map<String, Integer> mapa){
		  
		  Map<Integer, Integer> numeros = new HashMap<Integer,Integer>();
		  
		  Collection<Integer> edades = mapa.values();
		  
		  edades= new ArrayList<Integer>();
		  
		   for(int e: edades) {
			   
			   if(!numeros.containsKey(e)) {
			      numeros.put(e, 1);
		   }else {
			    numeros.replace(e, numeros.get(e) + 1);
		   }
		  
		 }
		   
		   int min=Collections.min(numeros.values());
		   ArrayList<Integer> numMenores = new ArrayList<Integer>();
		   numeros.forEach((e, cant) -> {
			   if(cant==min) {
				   numMenores.add(e);
	            }
	        });
			   return numMenores;
		   }
		  
		
		  
		  
		  
	  
	
	
	
	
	
	
	// Ejercicio 8

	public static Map<String, Integer> interseccion(Map<String, Integer> mapa1, Map<String, Integer> mapa2) {

		Map<String, Integer> mapainterseccion = new TreeMap<String, Integer>();

		for (String key : mapa1.keySet()) {
			if (mapa2.containsKey(key))
				mapainterseccion.put(key, mapa1.get(key));
		}
		return mapainterseccion;

	}

	
	
	
	
	// Ejercicio12

	public static void duplicar(Deque<Integer> pila) {

		/*Queue<Integer> cola1 = new LinkedList<>();
		while (pila.size() < 0)
			cola1.offer(pila.pop());

		while (cola1.size() < 0)
			pila.push(cola1.poll());

		System.out.println(pila);*/
		
		
		
		int[]vector=new int [6];
		
		System.out.println("vector1:");
		
		for(int i=0;!pila.isEmpty();i++) {
			vector[i]=pila.pop();
							
			 System.out.print(vector[i] + ", ");
					
	}
		int[]vector2=new int [6];
	    vector2= vector.clone();
		
	    System.out.println();		
			
		System.out.println("vector2");
		
		  for(int j=0; j<vector2.length;j++) {
		  System.out.print(vector2[j] + ", ");
		  }	  
		
		  
		  System.out.println();		
			
		  
		  int[] mezcla = new int [(6+6)];
		  

		//llena tu array mezcla con p vector y vector2 
		int indice = 0;
		int indicevector = 0;
		int indicevector2= 0 ;
		for (int x=0;x<mezcla.length;x++){
		   //si es elemento par
		   if (x%2 == 0 && indicevector < vector.length){
		     mezcla[x] =  vector[indicevector];
		     indicevector++;
		   } else if(indicevector2 < vector2.length){
		     mezcla[x] =  vector2[indicevector2];
		     indicevector2++;
		   }
		}

		System.out.println("mezcla de vectores:");
		
		for (int x=0 ;x<mezcla.length;x++){
		    System.out.print(mezcla[x] + " ");
		}
		
		Deque<Integer> inverso = new LinkedList<>();
		for (Integer item : mezcla) {
		   inverso.push(item);
		}
		 System.out.println( );
		 
		 System.out.println( );
		 
		  Collections.reverse((List<?>) inverso);
		  
		  System.out.println("Pila duplicada:" + inverso);
	}
	
	
	

	// Ejercicio 11
	

		
	/*public static List union(List<Integer> lista1, List<Integer> lista2) {
		
        Set<Integer> setunion = new HashSet<Integer>();

        setunion.addAll(lista1);
        setunion.addAll(lista2);

        return new ArrayList (setunion);
    }*/
	
	
	 
	public static void contarComunes(List<Integer> lista1, List<Integer> lista2) {
		
		List<Integer> listacomun = new ArrayList<Integer>();
                
	           for(Integer n:lista1) {
	        	   if(lista2.contains(n)) {
	        		   listacomun.add(n);
	        	   }
	           }
	           
	           Map<Integer, Integer> numeros = new HashMap<Integer,Integer>();
	           
	           for(int e: listacomun) {
				   
				   if(!numeros.containsKey(e)) {
				      numeros.put(e, 1);
			   }else {
				    numeros.replace(e, numeros.get(e) + 1);
			   }
			  
			 }
	           System.out.print("Numeros en comun:");
	           
	           for(Integer num: numeros.keySet())
	        	   System.out.print(num+ ",");
	        	   
	        	   
	        	   
	           
	          
	          // System.out.print(listacomun);           
	          // System.out.println("Cantidad de numeros en comun:" + listacomun.size());
		
	}
	
	
	 //Ejercicio5
	
	
	public static void negativosAbajoPositivosArriba(Deque<Integer> pila) {

		int[]vector=new int [6];
		int x =0;
		
		for(int i=0;!pila.isEmpty();i++) {
			vector[i]=pila.pop();
			x++;
		}
		
		Arrays.sort(vector);
		for(int i=0;i<x;i++){
		  pila.push(vector[i]);
		    
		}
		System.out.println(pila);

	}

	
	
	//Ejercicio 7
	
	
	public static void eliminarSiMayoresEncima(Deque<Integer> pila) {
		
	  Deque<Integer>cola=new LinkedList<Integer>();
	  
	    int x=0;
		
		for(int i=0;!pila.isEmpty();i++) {
			cola.add(pila.pop());
		   x++;
		}
		
		 for(int j=1;j<x;j++) {
			 if(j>j-1) {
				 cola.poll();
			 }
			 
		 }

	}
	
	
	   //Ejercicio 10
	// la clave sera cada grupo de 2 caracteres, el numero de veces que ser repite cada par pares de caracteres será el valor.
	
	  public static void cuentaPares(List<String> lista) {
		  
		   Map<String, Integer> mapaocurrencias = new TreeMap<String, Integer>();
		  
		   String[] miarray = new String[lista.size()];
		   
		   miarray=lista.toArray(miarray);
		   
		   for(String s : miarray)
			   System.out.print(s+ " ");
		   
		   
			   
			  
			  
		  }
		  
	  }
		

	

	
		

