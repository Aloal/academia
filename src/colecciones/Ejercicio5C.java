package colecciones;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio5C {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce tres numeros enteros: (N,K,X)");

		String numeros;
		numeros = s.next();

		String[] valores = numeros.split("");

		int[] valor = new int[valores.length];

		for (int i = 0; i < valor.length; i++) {
			valor[i] = Integer.parseInt(valores[i]);

			// System.out.print( valor[i]+ " ");
		}
		
		N = valor[0];
		K = valor[1];
		X = valor[2];

		System.out.println("El numero N es: " + N);
		System.out.println("El numero K es: " + K);
		System.out.println("El numero X es: " + X);

		System.out.println("Introduce N numeros entre los que estará el numero X:");

		String numeros2;
		numeros2 = s.next();

		String[] valores2 = numeros2.split("");

		int[] valor2 = new int[valores2.length];

		for (int j = 0; j < valor2.length; j++) {
			valor2[j] = Integer.parseInt(valores2[j]);

			//System.out.print(valor2[j] + " ");
		}

	
		for (int k = 0; k < valor2.length; k++) {

			cola.add(valor2[k]);
		}

		System.out.println(" ");

		System.out.println("Elmentos cola:" + cola);

		int contador = 0;

		if (!cola.isEmpty())
			while (contador < K) {
				cola.poll();
				contador++;
			}

		System.out.println("cola exrtraidos K numeros:" + cola);
		
		
		comprobar(cola);
			
			
	}
	
	static Queue<Integer> cola = new LinkedList<Integer>();
	static int N, K, X;
	
	

	static Queue<Integer> comprobar(Queue<Integer> cola) {

		int tamañovector = N - K;
		int[] vector = new int[tamañovector];
		int i = 0;

		if (cola.contains(X)) {
			System.out.println("X aun está en la cola:" +  cola);
		} else {
			while (cola.size() > 0) {
				vector[i] = (int) (cola.poll());

				int menor;
				menor = vector[0];

				for (int j = 0; j < vector.length; j++) {

					if (vector[j] < menor) {
						menor = vector[j];

					}
					System.out.println("El menor valor es:" + menor);
				}
		        
			}
			

		}
		return cola;

	}
}
