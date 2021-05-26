package colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio4 {

	static Palabras palabras = new Palabras();

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.print("> ");
		} while (ejecutar(in.readLine()));
	}

	static boolean ejecutar(String linea) {
		Scanner s = new Scanner(linea);
		try {
			String cmd = s.next("a�adir:|lista|borrar$|borrar:|fin$");
			switch (cmd) {
			case "a�adir:":
				cmdA�adir(s);
				break;
			case "lista":
				cmdLista(s);
				break;
			case "borrar":
			case "borrar:":
				cmdBorrar(s);
				break;
			case "fin":
				return false;
			}
		} catch (NoSuchElementException e) {
			System.out.println("no se reconoce el comando");
		} finally {
			s.close();
		}
		return true;
	}

	static void cmdA�adir(Scanner s) {
		palabras.addPalabras(s.nextLine());
	}

	static void cmdBorrar(Scanner s) {
		palabras.eliminarTodas();
		if (s.hasNext())
			cmdA�adir(s);
//			palabras.addPalabras(s.nextLine());
	}

	static void cmdLista(Scanner s) {
		try {
			int longitud = s.nextInt();
			if (s.hasNext())
				System.out.println("error: no se esperaba: " + s.nextLine());
			else {
				Set<String> lista = palabras.get(longitud);
				System.out.println(lista == null ? "no hay palabras de longitud " + longitud : lista);
			}
		} catch (NoSuchElementException e) {
			System.out.println("error: no es un n�mero entero: " + s.next());
		}
		;
	}

}
