import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		
		/* FOR
		 * 
		 * Estructura : for (inicio; condición; iteración){
		 * 					sentencia;
		 * 				}
		 * -> Ejecutar la sentencia de inicio
		 * -> Verifica o Evalua la Condición
		 * -> Si es cierta ejecutar la sentencia y la iteración
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
		 * while (condición){
		 *	sentencia;
		 *	contador++;
		 * }
		 * 
		 * -> Evaluar la condición
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
		 * 				}while(condición);
		 * 
		 * -> Sentencia
		 * -> Evalua la Condición
		 * -> true --> vuelte a ejecutar la sentencia
		 * -> false --> ignorar o seguir con la ejecución
		 * 
		 */
		
		Scanner entrada =  new Scanner(System.in);
		int n;
		
		do {			
			System.out.println("Ingresa un número mayor que 0");
			n = entrada.nextInt();
		}while(n <= 0);
		
		
		/* Reto 1 Serie de Fibonacci
		 * 
		 * -> Solicitar un número por consola 
		 * -> El número va a indicar el límite de la serie.
		 * 
		 */
		
		/* 	Reto 2 Juego de adivinar el número
		 * 
		 * -> Solicitar un número por consola
		 * -> definir un número entre 0 y 100 
		 * -> Juego de Adivinar un número
		 */
		
		/* Reto 3 Convertidor de C° a F°
		 * 
		 * -> Solicitar un número por consola
		 * -> Convertir de C° a F°
		 * 
		 */
		
		/*	Reto 4 Convertir de Km/h a m/s
		 * 
		 * -> Solicitar un número por consola
		 * -> Imprimir la conversión de Km/h a m/s
		 * 
		 */
		
	}

}
