
public class Main {
	
	public static void main(String[] args ) {
		/*	Programación Orientada a Objetos
		 * 	
		 * 	Objetos -> Son cosas que encontramos en el mundo real (perspna, arbol , carro).
		 * 
		 * 	Clase -> Molde o plantilla en donde podremos crear objetos que sean similares.
		 * 
		 * 		- Atributos : Son las características del objeto.
		 * 		- Metodos : Acciones de ese objeto	
		 * 
		 * Instancia : Elementos que tienen un lugar en la memoria 
		 * 
		 */
		
		Estudiantes pedro = new Estudiantes("Pedro", "López Hernández", 8, 'M', "Benito Juarez");
		Estudiantes ana =  new Estudiantes("Ana", "González Marquez", 6, 'F', "Benito Juarez");
		
		pedro.Datos();
		ana.Datos();
	}

}
