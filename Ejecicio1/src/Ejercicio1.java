import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/* Declarar 2 variables del tipo que sea
		 * y del valor que sea e indicar que variable
		 * es la que contiene el valor más alto.		 
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el valor de n1: ");
		int n1 = entrada.nextInt();
		
		System.out.println("Ingresa el valor de n2: ");
		int n2 = entrada.nextInt();
		
		if(n1 == n2) {
			System.out.println("Las variables son iguales");
		}else if(n1 < n2) {
			System.out.println("El número "+n2+" es mayor");
		}else {
			System.out.println("El número "+n1+" es mayor");
		}
	}

}
