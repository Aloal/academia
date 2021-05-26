package unidad8.ficheros;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class SwingLayoutDemo {

	 private JFrame mainFrame;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel;
	   private JLabel msglabel;
	   
	   public void SwingLayoutDemo(){
	      prepareGUI();
	   }
	   
	   public static void main(String[] args){
	      SwingLayoutDemo swingLayoutDemo = new SwingLayoutDemo();  
	      swingLayoutDemo.showGridLayoutDemo(); 
	      
	   }
	   private void prepareGUI(){
	      mainFrame = new JFrame("Java SWING Examples");
	      mainFrame.setSize(400,400);
	      mainFrame.setLayout(new SwingLayoutDemo(3, 1));

	      headerLabel = new JLabel("",JLabel.CENTER );
	      statusLabel = new JLabel("",JLabel.CENTER);        
	      statusLabel.setSize(350,100);
	      
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());

	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.add(statusLabel);
	      mainFrame.setVisible(true);  
	   }
	   private void showGridLayoutDemo(){
	      headerLabel.setText("Layout in action: GridLayout");      
	      
	      JPanel panel = new JPanel();
	      panel.setBackground(Color.darkGray);
	      panel.setSize(300,300);
	      SwingLayoutDemo layout = new SwingLayoutDemo(0,3);
	      layout.setHgap(10);
	      layout.setVgap(10);
	      
	      panel.setLayout(layout);        
	      panel.add(new JButton("Button 1"));
	      panel.add(new JButton("Button 2")); 
	      panel.add(new JButton("Button 3")); 
	      panel.add(new JButton("Button 4")); 
	      panel.add(new JButton("Button 5")); 
	      controlPanel.add(panel);
	      mainFrame.setVisible(true);  
	   }
}
