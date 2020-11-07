import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		/* Reto 1 Serie de Fibonacci
		 * 
		 * -> Solicitar un n�mero por consola 
		 * -> El n�mero va a indicar el l�mite de la serie.
		 * 
		 */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el l�mite de la serie");
		int veces = entrada.nextInt();
		
		int anterior = 0, actual = 1, fibonacci = 0;
		
		for (int i = 0; i < veces; i++) {
			fibonacci = anterior + actual;
			anterior = actual;
			actual = fibonacci;
			System.out.println("Fibonacci = "+fibonacci);
		}

	}

}
