package unidad8.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ejercicio10B {

	static private Map<String, Set<String>> agenda = new TreeMap<>();	

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		System.out.print("> ");
		linea = in.readLine();
		while (!linea.equalsIgnoreCase("salir")) {
			ejecutarComando(linea);
			System.out.print("> ");
			linea = in.readLine();
		}
	}

	static void ejecutarComando(String linea) {
		String [] cmd = linea.split(":");
		switch (cmd[0]) {
		case "buscar":
			System.out.println(agenda.get(cmd[1]));
			break;
		case "eliminar":
			agenda.remove(cmd[1]);
			break;
		case "contactos":
			Set<Entry<String, Set<String>>> contactos = agenda.entrySet();
			System.err.println(contactos);
			break;
		case "cargar":
			cargar(cmd[1]);
			break;
		case "guardar":
			guardar(cmd[1]);
			break;
		default:
			if (agenda.containsKey(cmd[0])) {
				agenda.get(cmd[0]).add(cmd[1]);
			}
			else {
				Set<String> telefonos = new HashSet<>();
				telefonos.add(cmd[1]);
				agenda.put(cmd[0], telefonos);
			}
		}
	}

	static void guardar(String ruta) {                    //Guardar datos de la agenda en un fichero de texto
		File fichero = new File(ruta);
		if (fichero.exists())
			cargar(ruta);
		try (PrintWriter out = new PrintWriter(new FileWriter(ruta))) {
			Set<Entry<String, Set<String>>> contactos = agenda.entrySet();
			for(Entry<String, Set<String>> contacto: contactos) {
				out.print(contacto.getKey() + "-");
				Iterator<String> i = contacto.getValue().iterator();
				while (i.hasNext()) {
					String telefono = i.next();
					if (i.hasNext())
						out.print(telefono + ",");
					else
						out.println(telefono);
				}
			}
		} catch (IOException e) {
			
		}
	}

	static void cargar(String ruta) {                                            // cargar datos de la agenda desde fichero externo
		try (BufferedReader in = new BufferedReader(new FileReader(ruta))) {
			String linea;
			while ((linea = in.readLine()) != null) {
				String [] entrada = linea.split("-");
				String [] telefonos = entrada[1].split(",");
				for(String telefono: telefonos)
					if (agenda.containsKey(entrada[0])) {
						agenda.get(entrada[0]).add(telefono);
					}
					else {
						Set<String> set = new HashSet<>();
						set.add(telefono);
						agenda.put(entrada[0], set);
					}
			}
		}
		catch (IOException e) {
			System.out.println("Error:" + e.getMessage());
		}
	}
}
