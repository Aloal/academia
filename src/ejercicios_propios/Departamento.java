package ejercicios_propios;

import java.io.Serializable;

public class Departamento implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private int codigo;
	  private String area;
	  private String localidad;
	  
	  
	  public Departamento(int codigo,String area, String localidad) {
		  this.codigo=codigo;
		  this.area=area;
		  this.localidad=localidad;
		  
	  }
	

	  
   
   }