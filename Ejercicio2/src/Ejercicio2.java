import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*	Leer un numero por teclado e indicar
		 * 	si el numero ingresado es par o impar
		 * 
		 * 	Dato : Operador Módulo (Residuo de la división)
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el número a comparar");
		int n1 = entrada.nextInt();
		
		// n1%2 -> Almacenar el residuo de la división
		if(n1%2 == 0) {
			System.out.println("El número "+n1+" es par!!");
		}else {
			System.out.println("El número "+n1+" es impar!!");
		}
	}

}
