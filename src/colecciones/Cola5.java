package colecciones;

import java.util.Scanner;

public class Cola5 {
	
	Nodo5 primero;
	Nodo5 ultimo;
	
	Scanner in = new Scanner(System.in);
	
	public Cola5() {
		primero=null;
		ultimo=null;
	}
	
	public void insertarNodo() {
		
		Nodo5 nuevo=new Nodo5();
		System.out.println("introduzca numero");
		nuevo.dato=in.nextInt();
		if(primero==null) {
			primero=nuevo;
			primero.siguiente=null;
			ultimo=nuevo;
		}else {
			ultimo.siguiente=nuevo;
			nuevo.siguiente=null;
			ultimo=nuevo;
		}
		System.out.println("\n numero ingresado con exito\n");
		
	}
	
	public void mostrarCola() {
		Nodo5 actual=new Nodo5();
		actual=primero;
		if(primero!=null) {
			while(actual!=null) {
				System.out.println(" " + actual.dato);
				actual=actual.siguiente;
			}
			
		}else {
			System.out.println("La cola esta vacía");
		}
	}
	
	
	
	public void extraer(int numk) {
		if(primero==null) {
			Nodo5 extraer=primero;
			primero=primero.siguiente;
			extraer.siguiente=null;
			if(primero==null) {
				ultimo=null;
			}
		}
		

	}

		
}
