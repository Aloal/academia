package unidad8.ficheros;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class Ejercicio6B {

	static JFrame Frame = new JFrame("Ejercicio 6 de ficheros");
	static JTextArea textArea;

	public static void main(String[] args) {

		SwingUtilities.invokeLater(Ejercicio6B::crearGUI);

	}

	static void crearGUI() {

		JMenuBar barra = new JMenuBar();
		Frame.setJMenuBar(barra);

		JMenu menuArchivo = new JMenu("Archivos");
		barra.add(menuArchivo);

		JMenuItem opcion1 = new JMenuItem("Leer El Quijote UTF");
		opcion1.addActionListener(Ejercicio6B::leer1);
		menuArchivo.add(opcion1);

		JMenuItem opcion2 = new JMenuItem("Leer El Quijote Windows");
		opcion1.addActionListener(Ejercicio6B::leer2);
		menuArchivo.add(opcion2);

		JMenuItem salir = new JMenuItem("Salir");
		salir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
		salir.addActionListener(Ejercicio6B::salir);
		menuArchivo.add(salir);

		JPanel panel = (JPanel) Frame.getContentPane();
		panel.setLayout(new BorderLayout());

		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setPreferredSize(new Dimension(800, 600));
		panel.add(textArea, BorderLayout.CENTER);

		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		Frame.pack();
		Frame.setResizable(false);
		Frame.setLocationRelativeTo(null);
		Frame.setVisible(true);
	}

	static void leer1(ActionEvent evt) {

		File archivo = new File("C:/Users/alped/Desktop/FORMACION PROFESIONAL/Programacion/El Quijote ISO-8859-1.txt");

		try {
			String cadena;
			FileReader f = new FileReader(archivo);
			BufferedReader b = new BufferedReader(f);
			while ((cadena = b.readLine()) != null) {
				textArea.setText(cadena);
				textArea.setCaretPosition(0);
			}
			b.close();

		} catch (Exception e) {
			System.out.println(" El archivo no está disponible en este momento");
		}
	}

	static void leer2(ActionEvent evt)  {

		File archivo2 = new File("C:/Users/alped/Desktop/FORMACION PROFESIONAL/Programacion/El Quijote UTF-8.txt");

		try {
			String cadena;
			FileReader f = new FileReader(archivo2);
			BufferedReader b = new BufferedReader(f);
			while ((cadena = b.readLine()) != null) {
				textArea.setText(cadena);
			}
			b.close();

		} catch (Exception e) {
			System.out.println(" El archivo no está disponible en este momento");
		}
	}

	static void salir(ActionEvent evt) {

		System.exit(0);
	}

}
