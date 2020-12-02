import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*	Obtener por teclado un número entero 
		 * 	e imprimir el doble y el triple de el 
		 * 	número.
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un número");
		int n1 = entrada.nextInt();
		
		System.out.println("El doble de "+n1+" es : "+(n1*2));
		System.out.println("El triple de "+n1+" es : "+(n1*3));
	}

}
