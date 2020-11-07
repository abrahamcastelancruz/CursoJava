import java.util.Random;
import java.util.Scanner;

public class JuegoMagico {

	public static void main(String[] args) {
		/* 	Reto 2 Juego de adivinar el número
		 * 
		 * -> Solicitar un número por consola
		 * -> definir un número entre 0 y 100 
		 * -> Juego de Adivinar un número
		 */
		Scanner entrada = new Scanner(System.in);
		/* 	Es una clase que nos permite generar números
		 	aleatorios */
		Random rmd = new Random();
		int numero;
		//int oculto = rmd.nextInt(101);
		int oculto = 90;
		System.out.println("Adivina un número entre 0 y 100");
		do {
			numero = entrada.nextInt();
			if(numero >= 0 && numero <= 100) {
				if(numero < oculto) {
					System.out.println("Debes ingresar un número mayor");
				}else if (numero > oculto) {
					System.out.println("Debes ingresar un número menor");
				}else if (numero == oculto) {
					System.out.println("Felicidades Adivinaste!!!");
				}
			}else if (numero < 0) {
				System.out.println("El número debe ser mayor o igual que 0");
			}else if (numero > 100) {
				System.out.println("El número debe ser menor que 100");
			}
		}while(numero != oculto);

	}

}
