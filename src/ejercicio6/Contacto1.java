package ejercicio6;

public class Contacto1 {
	
   
	private String nombre;
	private String telefono;
	private String telefono2;
	 
	 
	    public Contacto1() {
	    	
	    }
	 
	    
		public Contacto1(String nombre, String telefono,String telefono2) {
		
			this.nombre = nombre;
			this.telefono = telefono;
			this.telefono2=telefono2;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getTelefono() {
			return telefono;
			
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		
		
		public String getTelefono2() {
			return telefono2;
			
		}

		public void setTelefono2() {
			this.telefono2 = telefono2;
		}
		
		
		public boolean equals(Contacto1 c) {
			if(this.nombre.equalsIgnoreCase(c.getNombre())) {
				return true;
			}
			return false;
			
		}

		@Override
		public String toString() {
			return "nombre=" + nombre + ", telefono=" + telefono+ " telefono2=" + telefono2;
		}
	    

}
