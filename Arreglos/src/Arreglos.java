import java.util.Arrays;
import java.util.Scanner;

public class Arreglos {

	public static void main(String[] args) {
		/*	Los arreglos son estructuras de datos que contiene
		 * 	elementos de un mismo tipo (esos elementos los podemos
		 * 	ver como variables) 
		 * 
		 * 	-> Dato importante la primer posición de un arreglo es la 0
		 */
		
		// Formas de Crear un Arreglo
		/*int numeros[] = new int[4]; //Declarando un arreglo de tipo int, creandolo
		
		int n1[]; // Declarando el arreglo
		
		n1 = new int[10]; //Creación del arreglo 
		
		// Ejemplo de como recorrer un arreglo
		
				//  0    1   2  3    4   5
		int n2[] = {10, 20, 30, 50, 60, 70};
		
		for (int i = 0; i < n2.length; i++) {
			System.out.println(n2[i]);
		}
		
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la cantidad de Materias");
		int cantidad = entrada.nextInt();
		int materias[] = new int[cantidad];
		
		for (int i = 0; i < materias.length; i++) {
			System.out.println("Ingresa la calificación de la materia "+(i+1));
			int calificacion = entrada.nextInt();
			materias[i] = calificacion;
		}
		
		System.out.println(Arrays.toString(materias));
		
		String cadena = "Hola desde Mexico mi nombre es Abraham";
		//System.out.println(cadena.length());
		for (int i = 0; i < cadena.length();i++) {
			System.out.println(cadena.charAt(i));
		}*/
		
		Scanner entrada = new Scanner(System.in); 		// Declarando nuestro objeto para entradas
		System.out.println("Ingresa una frase");  		// Solicitar a el usuario una frase
		String cadena = entrada.nextLine();  			// Declarando un String y le estamos asignando el valor de entrada
		
		char caracteres[];								// Declaramos un arreglo de caracteres
		int longitud = cadena.length();					// Declaro una variable int y le asigno el valor de la longitud del String
		caracteres = new char[longitud];				// Creamos el arreglo caracteres
		
		for (int i = 0; i < cadena.length(); i++) {
			caracteres[i] = cadena.charAt(i);
			// asigno un elemento en la posición 'i' que sera el caraceter de el String en la posición 'i';
		}
		
		// caracteres [ 0 ] = H
		// caracteres [ 1 ] = o
		// caracteres [ 2 ] = l
		// caracteres [ 3 ] = a
		//.....
		// caracteres [ 37 ] = m
		
		System.out.println(Arrays.toString(caracteres));
	}

}
