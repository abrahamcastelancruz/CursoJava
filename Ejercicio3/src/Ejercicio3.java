import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*	Obtener por teclado un n�mero entero 
		 * 	e imprimir el doble y el triple de el 
		 * 	n�mero.
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un n�mero");
		int n1 = entrada.nextInt();
		
		System.out.println("El doble de "+n1+" es : "+(n1*2));
		System.out.println("El triple de "+n1+" es : "+(n1*3));
	}

}
