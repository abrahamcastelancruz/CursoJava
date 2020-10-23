import java.util.Scanner;

public class ObtencionTexto {

	public static void main(String[] args) {
		// Declaración del objeto de entrada estandar
		Scanner entrada = new Scanner(System.in);
	
		//Entrada de una cadena(String)
		System.out.println("Ingresa tu nombre: ");
		String nombre = entrada.nextLine();
		System.out.println("Hola "+nombre+", Bienvenido.");
	}

}
