import java.util.Random;
import java.util.Scanner;

public class JuegoMagico {

	public static void main(String[] args) {
		/* 	Reto 2 Juego de adivinar el n�mero
		 * 
		 * -> Solicitar un n�mero por consola
		 * -> definir un n�mero entre 0 y 100 
		 * -> Juego de Adivinar un n�mero
		 */
		Scanner entrada = new Scanner(System.in);
		/* 	Es una clase que nos permite generar n�meros
		 	aleatorios */
		Random rmd = new Random();
		int numero;
		//int oculto = rmd.nextInt(101);
		int oculto = 90;
		System.out.println("Adivina un n�mero entre 0 y 100");
		do {
			numero = entrada.nextInt();
			if(numero >= 0 && numero <= 100) {
				if(numero < oculto) {
					System.out.println("Debes ingresar un n�mero mayor");
				}else if (numero > oculto) {
					System.out.println("Debes ingresar un n�mero menor");
				}else if (numero == oculto) {
					System.out.println("Felicidades Adivinaste!!!");
				}
			}else if (numero < 0) {
				System.out.println("El n�mero debe ser mayor o igual que 0");
			}else if (numero > 100) {
				System.out.println("El n�mero debe ser menor que 100");
			}
		}while(numero != oculto);

	}

}
