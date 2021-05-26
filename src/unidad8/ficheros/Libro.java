package unidad8.ficheros;

import java.io.Serializable;

public class Libro  extends Publicaci�n {

	private String autor;

	public Libro(int c�digo, String t�tulo, int a�o, String autor) {
		super();
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return super.toString() + "[autor=" + autor + "]";
	}
	
	public void unMetodo() {
		System.out.println("soy un m�todo");
	}
}
