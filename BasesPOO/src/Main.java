
public class Main {
	
	public static void main(String[] args ) {
		/*	Programaci�n Orientada a Objetos
		 * 	
		 * 	Objetos -> Son cosas que encontramos en el mundo real (perspna, arbol , carro).
		 * 
		 * 	Clase -> Molde o plantilla en donde podremos crear objetos que sean similares.
		 * 
		 * 		- Atributos : Son las caracter�sticas del objeto.
		 * 		- Metodos : Acciones de ese objeto	
		 * 
		 * Instancia : Elementos que tienen un lugar en la memoria 
		 * 
		 */
		
		Estudiantes pedro = new Estudiantes("Pedro", "L�pez Hern�ndez", 8, 'M', "Benito Juarez");
		Estudiantes ana =  new Estudiantes("Ana", "Gonz�lez Marquez", 6, 'F', "Benito Juarez");
		
		pedro.Datos();
		ana.Datos();
	}

}
