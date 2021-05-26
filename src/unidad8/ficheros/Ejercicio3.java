package unidad8.ficheros;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Ejercicio3 {

	static JFrame appFrame = new JFrame("Ejercicio 3 de ficheros");

	public static void main(String[] args) {

//		SwingUtilities.invokeLater(new Runnable() {
//		@Override
//		public void run() {
//			crearGUI();
//		}
//	});

		SwingUtilities.invokeLater(() -> crearGUI());
	}

	static void crearGUI() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menuArchivo = new JMenu("Archivo");
		menuArchivo.setMnemonic(KeyEvent.VK_A);
		JMenuItem menuArchivoAbrir = new JMenuItem("Abrir");
		menuArchivoAbrir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				abrir();
			}
		});
		menuArchivo.add(menuArchivoAbrir);
		menuBar.add(menuArchivo);
		appFrame.setJMenuBar(menuBar);

		Container panel = appFrame.getContentPane();
		panel.setLayout(new BorderLayout());

		JTextArea textArea = new JTextArea();
		textArea.setPreferredSize(new Dimension(700, 500));
		panel.add(textArea, BorderLayout.CENTER);

		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.pack();
		appFrame.setLocationRelativeTo(null);
		appFrame.setVisible(true);
	}

	static void abrir() {
		JFileChooser fileChooser = new JFileChooser();
		JOptionPane.showMessageDialog(appFrame, "Opcion abrir seleccionada", "Menú Abrir", JOptionPane.OK_OPTION);
	}
	
	
	
				
		
		
	}


