import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*	Leer un numero por teclado e indicar
		 * 	si el numero ingresado es par o impar
		 * 
		 * 	Dato : Operador M�dulo (Residuo de la divisi�n)
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el n�mero a comparar");
		int n1 = entrada.nextInt();
		
		// n1%2 -> Almacenar el residuo de la divisi�n
		if(n1%2 == 0) {
			System.out.println("El n�mero "+n1+" es par!!");
		}else {
			System.out.println("El n�mero "+n1+" es impar!!");
		}
	}

}
