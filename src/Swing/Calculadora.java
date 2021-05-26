package Swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		
		MarcoCalculadora mimarco=new MarcoCalculadora();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
	}

}

 class MarcoCalculadora extends JFrame{
	 
	 public MarcoCalculadora() {
		 
		 setTitle("Calculadora");
		 //setBounds(500,300,450,300);
		 
		 //agregamos al constructor la lamina creada
		 
		 LaminaCalculadora milamina=new LaminaCalculadora();
		 add(milamina);
		 pack();
	 }
 }
 
 
 class LaminaCalculadora extends JPanel{
	 
	  public LaminaCalculadora() {
		  
		  principio=true;
		  
		  setLayout(new BorderLayout());
		  
		  pantalla =new JButton("0");
		  
		  pantalla.setEnabled(false);
		  
		  add(pantalla,BorderLayout.NORTH);
		  
		  
		  //Ahora creamos el Grid de las teclas
		  
		   milamina2=new JPanel();
		  
		  milamina2.setLayout(new GridLayout(4,4));
		  
		   ActionListener insertar=new InsertaNumero();
		  
		  //Agregamos botones
		  
		  ponerBoton("7",insertar);
		  
		  ponerBoton("8",insertar);
		  
		  ponerBoton("9",insertar);
		  
		  ponerBoton("6",insertar);
		  
		  ponerBoton("5",insertar);
		  
		  ponerBoton("4",insertar);
		  
		  ponerBoton("3",insertar);
		  
		  ponerBoton("2",insertar);
		  
		  ponerBoton("1",insertar);
		  
		//  ponerBoton("+");
		  
		 // ponerBoton("-");
		  
		 // ponerBoton("*");
		  
		 // ponerBoton("/");
		  
		  ponerBoton("0",insertar);
		  
		 // ponerBoton("=");
		  
		 // ponerBoton(".");
		  
		  
		  add(milamina2,BorderLayout.CENTER);
		  
	  }
	  
	  private JPanel milamina2;
	  
	  private JButton pantalla;
	  
	  private boolean principio;
	  
	  
	  
	  private void ponerBoton(String rotulo, ActionListener oyente) {
		  
		  JButton boton =new JButton(rotulo);
		  
		  boton.addActionListener(oyente);
		  
		  milamina2.add(boton);
	  }
	  
	  
	  private class InsertaNumero implements ActionListener{

		  
		@Override
		public void actionPerformed(ActionEvent e) {
			
			 String entrada=e.getActionCommand();
			 
			 if(principio==true) {
				 
				 pantalla.setText("");
				 
				 principio=false;
			 }
			
			 pantalla.setText(pantalla.getText()+ entrada);
		}
		  
	  }
 }