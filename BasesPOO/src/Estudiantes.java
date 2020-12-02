
public class Estudiantes {
	
	/*	Constructor  -> Asignar los valores iniciales del objeto
	 * 	
	 * 	- Nombre
	 * 	- Apellidos
	 * 	- Edad
	 * 	- Sexo 
	 * 	- Escuela
	 */
	
	String nombre;
	String apellidos;
	int edad;
	char sexo;
	String escuela;
	
	public Estudiantes(String nombre, String apellidos, int edad, char sexo, String escuela) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
		this.escuela = escuela;
	}
	
	public void Datos() {
		System.out.println("El estudiante "+this.nombre+" tiene "+this.edad+" años");
	}
	
	public boolean pasarLista() {
		return true;
	}
	
}
