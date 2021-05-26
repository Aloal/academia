package unidad8.ficheros;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class Ejercicios3_4_5B {

	static JFrame appFrame = new JFrame("Ejercicio 3 de ficheros");
	static JTextArea textArea;
	static int contCaracteres;
	static int contPalabras;
	static int contLineas;
	static File ficheroTexto = null;
	static JMenuItem menuArchivoGuardar;

	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//			@Override
//			public void run() {
//				crearGUI();
//			}
//		});

//		SwingUtilities.invokeLater(() -> crearGUI());

		SwingUtilities.invokeLater(Ejercicios3_4_5::crearGUI);
	}

	static void crearGUI() {
		JMenuBar menuBar = new JMenuBar();
		appFrame.setJMenuBar(menuBar);

		JMenu menuArchivo = new JMenu("Archivo");
		menuArchivo.setMnemonic(KeyEvent.VK_A);
		menuBar.add(menuArchivo);

		JMenuItem menuArchivoAbrirTexto = new JMenuItem("Abrir fichero de texto");
		menuArchivoAbrirTexto.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		menuArchivoAbrirTexto.addActionListener(Ejercicios3_4_5::abrir);
		menuArchivo.add(menuArchivoAbrirTexto);
		
		
//		menuArchivoAbrir.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent evt) {
//				abrir();
//			}
//		});

//		menuArchivoAbrir.addActionListener(e -> abrir());


		JMenuItem menuArchivoAbrirBin = new JMenuItem("Abrir fichero binario");
		menuArchivoAbrirBin.addActionListener(Ejercicios3_4_5::abrirBinario);
		menuArchivo.add(menuArchivoAbrirBin);

		menuArchivoGuardar = new JMenuItem("Guardar");
		menuArchivoGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		menuArchivoGuardar.addActionListener(Ejercicios3_4_5::guardar);
		menuArchivoGuardar.setEnabled(false);
		menuArchivo.add(menuArchivoGuardar);

		JMenuItem menuArchivoSalir = new JMenuItem("Salir");
		menuArchivoSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
		menuArchivoSalir.addActionListener(Ejercicios3_4_5::salir);
		menuArchivo.add(menuArchivoSalir);

		JPanel panel = (JPanel) appFrame.getContentPane();
		panel.setLayout(new BorderLayout());
		
		
		 class LaminaEtiquetas extends JPanel{
			  
			 public LaminaEtiquetas() {

		 JLabel titulo=new JLabel ("Datos del archivo leido");
		 
		   add(titulo,BorderLayout.NORTH);
		   
		 JPanel milamina=new JPanel ();
		 milamina.setLayout(new GridLayout(3,2));
		 
		 
		 
		 
		 
		 JLabel etiqueta =new JLabel("Número de caracteres");
		 milamina.add(etiqueta);
		 
		 JLabel campo=new JLabel(  String.valueOf(contCaracteres) + "\n");
		     milamina.add(campo);
		     
		     
		 JLabel etiqueta2 =new JLabel("Número de palabras");
			 milamina.add(etiqueta2);
			 
	     JLabel campo2=new JLabel(  String.valueOf(contPalabras) + "\n");
			     milamina.add(campo2);   
		     
		     
		  JLabel etiqueta3 =new JLabel("Número de lineas");
				 milamina.add(etiqueta3);
				 
		  JLabel campo3=new JLabel(  String.valueOf(contLineas) + "\n");
				     milamina.add(campo3);     
		     
		     
				 add(milamina,BorderLayout.CENTER); 
		 
	
	}

		 }
		 
	}

	static boolean confirmaGuardarDatos(String mensaje) {
		if (ficheroTexto != null) {
			switch (JOptionPane.showConfirmDialog(appFrame, mensaje)) {
			case JOptionPane.YES_OPTION:
				guardar(null);
				if (ficheroTexto == null)
					return true;
				return false;
			case JOptionPane.NO_OPTION:
				return true;
			default:
				return false;
			}
		}
		return true;
	}

	static void abrir(ActionEvent evt) {
		
			
		if (confirmaGuardarDatos("¿Guardar datos actuales antes de abrir el fichero de texto?")) {
			JFileChooser fileChooser = new JFileChooser();
			if (fileChooser.showOpenDialog(appFrame) == JFileChooser.APPROVE_OPTION) {
				ficheroTexto = fileChooser.getSelectedFile();
				try (BufferedReader br = new BufferedReader(new FileReader(ficheroTexto))) {
					contCaracteres = 0;
					contPalabras = 0;
					contLineas = 0;
					String line;
					while ((line = br.readLine()) != null) {
						contLineas++;
						for (String palabra : line.split("\\P{L}+")) {
							contPalabras++;
							contCaracteres += palabra.length();
						}
					}
					
					 				 
					 
					 
					menuArchivoGuardar.setEnabled(true);
				} catch (IOException e) {
					ficheroTexto = null;
					menuArchivoGuardar.setEnabled(false);
					JOptionPane.showMessageDialog(appFrame, e.getMessage(), "Abrir archivo",
							JOptionPane.ERROR_MESSAGE + JOptionPane.OK_OPTION);
				}
			}
		}
	}
	
	
	static void crearEtiquetas() {
		
		 class LaminaEtiquetas extends JPanel{
			  
			   public LaminaEtiquetas() {
				   
				   	   			  
					  setLayout(new BorderLayout());
					  
					  titulo =new JLabel("Datos del archivo leido");
					  
					  		  
					  add(titulo,BorderLayout.NORTH);
					  
					  
					  //Ahora creamos el Grid de las etiquetas y los campos
				    
				   milamina=new JPanel();
				  
				  milamina.setLayout(new GridLayout(3,2));
				  
				  
				  ponerEtiqueta("numero de caracteres:");
				 
				  ponerCampo(campo1);
				  
				  ponerEtiqueta("numero de palabras:");
					 
				  ponerCampo(campo2);
				  
				  
				  ponerEtiqueta("numero de lineas:");
					 
				  ponerCampo(campo3);
				  
				  
				  
				  add(milamina,BorderLayout.CENTER);
			   }
			   
			   
			   
			   private JPanel milamina;
			   private JLabel titulo; 
			 
			     
			   
			   private void ponerEtiqueta(String rotulo) {
					  
					  JLabel etiqueta =new JLabel(rotulo);
					  
								  
					  milamina.add(etiqueta);
				  }
			   
			   
			   
			    String campo1=(  String.valueOf(contCaracteres) + "\n");
				String campo2=(  String.valueOf(contPalabras) + "\n");
				String campo3=(  String.valueOf(contLineas) + "\n"); 
			    
			   
			   private void ponerCampo(String n) {
				   
				 JLabel campo=new JLabel();
				    				    
				    milamina.add(campo);
			   }
			   
			  
		  }
	}

	
	
	
	static void abrirBinario(ActionEvent evt) {
		if (confirmaGuardarDatos("¿Guardar datos actuales antes de abrir el fichero binario?")) {
			JFileChooser fileChooser = new JFileChooser();
			if (fileChooser.showOpenDialog(appFrame) == JFileChooser.APPROVE_OPTION) {
				try (DataInputStream in = new DataInputStream(
						new BufferedInputStream(new FileInputStream(fileChooser.getSelectedFile())))) {
					StringBuilder sb = new StringBuilder();
					try {
						while (true) {
							sb.append(in.readUTF() + "\n");
							sb.append(String.valueOf(in.readInt()) + "\n");
							sb.append(String.valueOf(in.readInt()) + "\n");
							sb.append(String.valueOf(in.readInt()) + "\n");
						}
					} catch (EOFException e) {
						ficheroTexto = null;
						menuArchivoGuardar.setEnabled(false);
						textArea.setText(sb.toString());
					}
				} catch (IOException e) {
					JOptionPane.showMessageDialog(appFrame, e.getMessage(), "Abrir archivo binario",
							JOptionPane.ERROR_MESSAGE + JOptionPane.OK_OPTION);
				}
			}
		}
	}

	static void guardar(ActionEvent evt) {
		JFileChooser fileChooser = new JFileChooser();
		if (fileChooser.showSaveDialog(appFrame) == JFileChooser.APPROVE_OPTION) {
			try (DataOutputStream out = new DataOutputStream(
					new BufferedOutputStream(new FileOutputStream(fileChooser.getSelectedFile(), true)))) {
				out.writeUTF(ficheroTexto.getAbsolutePath());
				out.writeInt(contCaracteres);
				out.writeInt(contPalabras);
				out.writeInt(contLineas);
				ficheroTexto = null;
				menuArchivoGuardar.setEnabled(false);
				textArea.setText("");
			} catch (IOException ex) {
				JOptionPane.showMessageDialog(appFrame, ex.getMessage(), "Guardar archivo",
						JOptionPane.ERROR_MESSAGE + JOptionPane.OK_OPTION);
			}
		}
	}

	static void salir(ActionEvent evt) {
		if (confirmaGuardarDatos("¿Guardar datos actuales antes de salir?")) 
			System.exit(0);
	}
	
}
