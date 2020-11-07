import java.util.Scanner;

public class ConvertidorVelocidad {

	public static void main(String[] args) {
		/*	Reto 4 Convertir de Km/h a m/s
		 * 
		 * -> Solicitar un número por consola
		 * -> Imprimir la conversión de Km/h a m/s
		 * 
		 */
		Scanner entrada =  new Scanner(System.in);
		System.out.println("Ingresa la velocidad en Km/s");
		double velocidad = entrada.nextInt();
		
		double ms = velocidad*1000/3600;
		
		System.out.println(velocidad +" Km/s es igual que "+ms+" m/s");

	}

}
