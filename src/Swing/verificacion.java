package Swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

public class verificacion {

	public static void main(String[] args) {
		
		Marco mimarco = new Marco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

 class Marco extends JFrame{
	 
	 
	
	private static final long serialVersionUID = 1L;

	public Marco() {
		 setTitle("Casillas/Cuadro de botones");
		 setBounds(600, 300, 600, 350);
		 LaminaCuadros milamina=new LaminaCuadros();
		 
		 add(milamina);

		  setVisible(true);
		 
	 }
 }
 
 
  class LaminaCuadros extends JPanel{
	  
	
	private static final long serialVersionUID = 1L;

	public LaminaCuadros() {
		  
		 JPanel principal=new JPanel();
		  
		 principal.setLayout(new GridLayout(2,2));
		  
		  JPanel zona1=new JPanel();
		  
		  JCheckBoxMenuItem Carnet=new JCheckBoxMenuItem(" Carnet B1");
		  zona1.add(Carnet);
		  JCheckBoxMenuItem Coche=new JCheckBoxMenuItem(" Coche propio");
		  zona1.add(Coche);
		  principal.add(zona1);
		  
		  
		  JPanel zona2=new JPanel();
		  
		  JRadioButtonMenuItem soltero = new JRadioButtonMenuItem("Soltero/a");
		  zona2.add(soltero);
		  JRadioButtonMenuItem casado = new JRadioButtonMenuItem("Casado/a");
		  zona2.add(casado);
		  JRadioButtonMenuItem divorciado = new JRadioButtonMenuItem("Divorciado/a");
		  zona2.add(divorciado);
		  
		  ButtonGroup bg = new ButtonGroup();  //grupo de botones radio para que salgo o uno u otro
			bg.add(soltero);     
			bg.add(casado);
		    bg.add(divorciado);
		  
		  principal.add(zona2);
		  
		  
		  
		  JButton boton1 = new JButton("Aceptar");
		  principal.add(boton1);
		  
		  JButton boton2 = new JButton("Cancelar");
		  principal.add(boton2);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
		  
		  
		  
		 
		    
		    		    
		    
		    
		    
		   
		  
		    
		    
		    
		    
		    
	  }
	  
  }
 
 
 
