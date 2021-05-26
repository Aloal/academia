package colecciones_adicionales;

import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import unidad8.colecciones.Nodo5;



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
		
 	Collection<String> v1 = mapa.values();
	HashSet<String> v2 = new HashSet<>(v1);
	return v1.size() == v2.size();
		
		/* 
		 * Otra forma de hacerlo
		 */
		
		//return mapa.values().stream().distinct().count() != mapa.values().size();
	}
	

    
    public static boolean algunaSeRepiteAlmenos3Veces(List<String> lista) {
    	
    	// la clave sera la cadena y el valor sera el numero de veces que se repite,
    	
    	HashMap<Integer, Integer> mapa = new HashMap<>();
    	
    	int tamaño=lista.size();
    	
    	for(int i=0; i<=tamaño;i++) {
    		int s=i;
    		if(mapa.containsKey(s)) {
    			mapa.put(s, mapa.get(s)+1);
    		}else {
    			mapa.put(s, 1);
    		}
    	}
         return true;
	    	
         
    }
    
    
    
    // la clave sera el numero y el valor mayor sera el contador,
    
    public static void moda(List<Integer>lista) {
    	
    	HashMap<Integer, Integer> mapa = new HashMap<>();
    	
    	int tamaño=lista.size();
    	
    	for (int i = 0; i <=tamaño; i++) {
			int numero = i;
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
		}if(mapa.isEmpty()) {
			System.out.printf("Lista vacia");
		}
	}
	System.out.printf("La moda es %d porque se repite %d veces", moda, mayor);
    
    
    
   }
    
    
    
    public static void valorMenosRepetido(Map<String, Integer> mapa) {
    	
    	HashMap<String, Integer> mapa1 = new HashMap<>();
    	
       int tamaño=mapa.size();
    	
    	for (int i = 0; i <=tamaño; i++) {
			String nombre = i;
			if (mapa.containsKey(nombre)) {
				mapa.put(nombre, mapa.get(nombre) + 1);
			} else {
				mapa.put(nombre, 1);
			}
		}
    
    
    String modamenor;
    int menor = 0;
	for (HashMap.Entry<String, Integer> entry : mapa1.entrySet()) {
		if (entry.getValue() < menor) {
			menor = entry.getValue();
			modamenor = entry.getKey();
		}
	}
	System.out.printf("La edad" + modamenor+ "es la que menos se repite"+  menor + " veces");
    
    
    
   }
    
    
    
    static Map interseccion(Map mapaUno, Map mapaDos)
    {
            TreeMap intersection = new TreeMap();
           for (Object key: mapaUno.keySet())
           {
               if (mapaDos.containsKey(key))
                  intersection.put(key, mapaUno.get(key));
           }
           return intersection;
    }
    
    
    
    	
    }
    
    
    

		
	
    
    
    
    
    

