import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		/*	-> Solicitar a el usuario los datos (numeros, operaciones)
		 * 	-> Sumas, Restas, Multiplicaciones, Divisiones
		 * 
		 */
		
		Scanner entrada =  new Scanner(System.in);
		//double numero1 =  entrada.nextDouble();
		
		int op;
		
		do {
			System.out.println("***** Men� *****\n1.-Ingresa 1 para Suma\n2.-Ingresa 2 para Resta\n3.-Ingresa 3 para Divisi�n\n4.-Ingresa 4 para Multipliacaci�n");
			op = entrada.nextInt();
		}while(op != 0);
	}

}
