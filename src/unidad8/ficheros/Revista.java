package unidad8.ficheros;

import java.io.Serializable;

public class Revista extends Publicaci�n {

	private int d�a;
	private int mes;
	private int n�mero;
	
	public Revista(int c�digo, String t�tulo, int d�a, int mes, int a�o, int n�mero) {
		super();
		this.d�a = d�a;
		this.mes = mes;
		this.n�mero = n�mero;
	}

	public int getD�a() {
		return d�a;
	}

	public int getMes() {
		return mes;
	}

	public int getN�mero() {
		return n�mero;
	}

	@Override
	public String toString() {
		return "Revista [d�a=" + d�a + ", mes=" + mes + ", n�mero=" + n�mero + ", toString()=" + super.toString() + "]";
	}
	
}
