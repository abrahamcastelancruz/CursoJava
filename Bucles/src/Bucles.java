import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		
		/* FOR
		 * 
		 * Estructura : for (inicio; condici�n; iteraci�n){
		 * 					sentencia;
		 * 				}
		 * -> Ejecutar la sentencia de inicio
		 * -> Verifica o Evalua la Condici�n
		 * -> Si es cierta ejecutar la sentencia y la iteraci�n
		 * 
		 */
		
		/*
		System.out.println("Tabla de Multiplicar del 5");
		for (int i = 0; i <= 10; i++) {
			System.out.println("5 * "+ i + " = "+ (5*i));
		}
		
		System.out.println("Termino el bucle for");
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}*/
		
		
		/* While
		 * 
		 * Estructura 
		 * 
		 * int contador = 0 // Nuestro inicio
		 * 
		 * while (condici�n){
		 *	sentencia;
		 *	contador++;
		 * }
		 * 
		 * -> Evaluar la condici�n
		 * -> true --> se ejecuta la sentencia;
		 * -> false --> saltar a las lineas siguientes
		 * 
		 */
		
		/*int contador = 0;
		
		while (contador <= 100) {
			System.out.println(contador);
			contador++;
		}*/
		
		
		/* Do While
		 * 
		 * Estructura: do {
		 * 				sentencia;
		 * 				}while(condici�n);
		 * 
		 * -> Sentencia
		 * -> Evalua la Condici�n
		 * -> true --> vuelte a ejecutar la sentencia
		 * -> false --> ignorar o seguir con la ejecuci�n
		 * 
		 */
		
		Scanner entrada =  new Scanner(System.in);
		int n;
		
		do {			
			System.out.println("Ingresa un n�mero mayor que 0");
			n = entrada.nextInt();
		}while(n <= 0);
		
		
		/* Reto 1 Serie de Fibonacci
		 * 
		 * -> Solicitar un n�mero por consola 
		 * -> El n�mero va a indicar el l�mite de la serie.
		 * 
		 */
		
		/* 	Reto 2 Juego de adivinar el n�mero
		 * 
		 * -> Solicitar un n�mero por consola
		 * -> definir un n�mero entre 0 y 100 
		 * -> Juego de Adivinar un n�mero
		 */
		
		/* Reto 3 Convertidor de C� a F�
		 * 
		 * -> Solicitar un n�mero por consola
		 * -> Convertir de C� a F�
		 * 
		 */
		
		/*	Reto 4 Convertir de Km/h a m/s
		 * 
		 * -> Solicitar un n�mero por consola
		 * -> Imprimir la conversi�n de Km/h a m/s
		 * 
		 */
		
	}

}
