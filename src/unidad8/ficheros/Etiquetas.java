package unidad8.ficheros;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Etiquetas {

	public static void main(String[] args) {
		
		MarcoEtiquetas mimarco=new MarcoEtiquetas();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

	}

}

 class MarcoEtiquetas extends JFrame{
	 
	 public MarcoEtiquetas() {
		 
		 setTitle("Etiquetas");
		 setBounds(500,300,450,300);
		 
 //agregamos al constructor la lamina creada
		 
		 LaminaEtiquetas milamina=new LaminaEtiquetas();
		 add(milamina);
		 pack();
	 }
	 
 }
 
 
  class LaminaEtiquetas extends JPanel{
	  
	   public LaminaEtiquetas() {
		   
		   	   			  
			  setLayout(new BorderLayout());
			  
			  titulo =new JLabel("Datos del archivo leido");
			  
			  		  
			  add(titulo,BorderLayout.NORTH);
			  
			  
			  //Ahora creamos el Grid de las etiquetas y los campos
		    
		   milamina=new JPanel();
		  
		  milamina.setLayout(new GridLayout(3,2));
		  
		  
		  ponerEtiqueta("numero de caracteres:");
		 
		  ponerEtiqueta2();
		  
		  ponerEtiqueta("numero de palabras:");
			 
		  ponerEtiqueta2();
		  
		  
		  ponerEtiqueta("numero de lineas:");
			 
		  ponerEtiqueta2();
		  
		  
		  
		  add(milamina,BorderLayout.CENTER);
	   }
	   
	   
	   
	   private JPanel milamina;
	   private JLabel titulo; 
	   
	     
	   
	   private void ponerEtiqueta(String rotulo) {
			  
			  JLabel etiqueta =new JLabel(rotulo);
			  
						  
			  milamina.add(etiqueta);
		  }
	   
	   
	   private void ponerEtiqueta2() {
		   
		    JLabel campo=new JLabel();
		    
		    campo.setText( + String.valueOf(contCaracteres) + "\n");
			milamina.append( + String.valueOf(contPalabras) + "\n");
			milamina.append( + String.valueOf(contLineas) + "\n"); */
		    
		    milamina.add(campo);
	   }
	   
	  
  }
  
  
  
  
