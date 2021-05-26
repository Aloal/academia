package unidad8.ficheros;

import java.io.Serializable;

public abstract class Publicaci�n implements Serializable {

	private int c�digo;
	private String t�tulo;
	private int a�o;
	
	public void Publicaci�n(int c�digo, String t�tulo, int a�o) {
		this.c�digo = c�digo;
		this.t�tulo = t�tulo;
		this.a�o = a�o;
	}

	public int getC�digo() {
		return c�digo;
	}

	public String getT�tulo() {
		return t�tulo;
	}

	public int getA�o() {
		return a�o;
	}

	@Override
	public String toString() {
		return "Publicaci�n [c�digo=" + c�digo + ", t�tulo=" + t�tulo + ", a�o=" + a�o + "]";
	}

	

	
	 
}
