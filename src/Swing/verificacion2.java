package Swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

public class verificacion2 {

	public static void main(String[] args) {
		
		Marco2 mimarco = new Marco2();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}

class Marco2 extends JFrame{
	 
	 
	
	private static final long serialVersionUID = 1L;

	public Marco2() {
		 setTitle("Casillas/Cuadro de botones");
		 setBounds(600, 300, 600, 350);
		 LaminaCuadros milamina=new LaminaCuadros();
		 
		 add(milamina);

		  setVisible(true);
		 
	 }
 }
 
 
  class LaminaCuadros extends JPanel{
	  
	

	public LaminaCuadros() {
		  
		 	  
		 setLayout(new BorderLayout());
		 
		 JPanel lamina2=new JPanel();
		 
		 lamina2.setLayout(new FlowLayout());
		 
		 JCheckBoxMenuItem carnet=new JCheckBoxMenuItem(" Carnet B1");
		 JCheckBoxMenuItem coche=new JCheckBoxMenuItem(" Coche propio");
		 
		 lamina2.add(carnet);
		 lamina2.add(coche);
		 
		 add(carnet,BorderLayout.WEST);
		 add(carnet,BorderLayout.WEST);
		 
		 JRadioButtonMenuItem soltero = new JRadioButtonMenuItem("Soltero/a");
		 JRadioButtonMenuItem casado = new JRadioButtonMenuItem("Casado/a");
		 JRadioButtonMenuItem divorciado = new JRadioButtonMenuItem("Divorciado/a");
		 
		 lamina2.add(soltero);
		 lamina2.add(casado);
		 lamina2.add(divorciado);
		 
		 ButtonGroup bg = new ButtonGroup();  //grupo de botones radio para que salgo o uno u otro
			bg.add(soltero);     
			bg.add(casado);
		    bg.add(divorciado);
		    
		    
		   add(soltero,BorderLayout.EAST);
		   add(casado,BorderLayout.EAST);
		   add(divorciado,BorderLayout.EAST);
		   
		   
		   
			JButton boton1 = new JButton("Aceptar");
		    lamina2.add(boton1);
			  
			JButton boton2 = new JButton("Cancelar");
		    lamina2.add(boton2); 
		 
	}	 
		  
  }
		  
		  
		  
		
		
		  
		 
	  
		  