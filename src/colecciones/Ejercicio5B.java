package colecciones;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio5B {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Deque<Integer> cola1 = new ArrayDeque<Integer>();
		System.out.println("Insertamos tres numeros enteros en la cola");

		System.out.print("Inserta un numero N:");
		int n = s.nextInt();

		System.out.print("Inserta un numero K:");
		int k = s.nextInt();

		System.out.print("Inserta un numero X:");
		int x = s.nextInt();

		cola1.add(n);
		cola1.add(k);
		cola1.add(x);

		int tamaño = cola1.size();

		System.out.println("El tamaño de la cola1 es:" + tamaño);

		Deque<Integer> cola2 = new ArrayDeque<Integer>();

		System.out.println("Introduce N, numeros entre los que estará el numero X, para la cola2");

		do {

			System.out.println("Inserta un numero para la cola");
			int numero = s.nextInt();
			cola2.add(numero);

		} while (cola2.size() < n);

		System.out.println("cola:" + cola2);

		// Extraemos K elementos de la cola2, que tiene N elementos

		int z = 0;
		if (!cola2.isEmpty())
			while (z < k) {
				cola2.remove();
				z++;
			}

		System.out.println("cola exrtraidos K numeros:" + cola2);

		int tamañovector = n - k;
		int[] vector = new int[tamañovector];
		int i = 0;

		if (cola2.contains(x)) {
			System.out.println(" el numero X aún esta en la cola: " + x);
		} else  {
			while (cola2.size() > 0) {
				vector[i] = (cola2.poll());

				int menor;
				menor = vector[0];
				

				for (int j = 0; j < vector.length; j++) {

					if (vector[j] < menor) {
						menor = vector[j];
						
					}

				}
				
				System.out.println(" El menor valor de los restantes es:"  + menor);
			}

		}
		

	/*	System.out.println("Cantidad de elementos en la cola:" + cola2.size());

		int v = cola2.size();

		if (v == 0) {
			System.out.println("La cola tiene:" + v + " elementos");
		}

		/*
		 * System.out.println("Extraemos un elemento de la cola:" + cola2.poll()); //
		 * System.out.println("Consultamos el primer elemento de la cola sin extraerlo:"
		 * + cola2.peek()); //System.out.
		 * println("Extraemos uno a uno cada elemento de la cola mientras no este vacía:"
		 * );
		 * 
		 * // System.out.print(cola2.poll() + "-"); //System.out.println();
		 * 
		 * 
		 * cola2.add(70); cola2.add(120); cola2.add(6);
		 * System.out.println("Imprimimos la cola de enteros"); for (Integer elemento :
		 * cola2) System.out.print(elemento + "-"); System.out.println();
		 * System.out.println("Borramos toda la cola"); cola2.clear();
		 * System.out.println("Cantidad de elementos en la cola de enteros:" +
		 * cola2.size());
		 */
	}

}
