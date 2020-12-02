
public class Autor {
	String nombre;
	String email;
	char genero;
	
	public Autor(String nombre, String email, char genero) {
		this.nombre = nombre;
		this.email = email;
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public char getGenero() {
		return genero;
	}

	@Override
	public String toString() {
		return "\n*** Autor ***\nnombre =" + nombre + "\nemail=" + email + "\ngenero=" + genero;
	}
	
}
