import java.util.Scanner;

public class CelciusFahrenheit {

	public static void main(String[] args) {
		/* Reto 3 Convertidor de C° a F°
		 * 
		 * -> Solicitar un número por consola
		 * -> Convertir de C° a F°
		 * 
		 */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un número");
		int gradosCentigrados = entrada.nextInt();
		
		double gradosFahrenheit = 32 + (9 * gradosCentigrados / 5);
		
		System.out.println(gradosCentigrados +" C° es igual que "+ gradosFahrenheit+" F°");

	}

}
