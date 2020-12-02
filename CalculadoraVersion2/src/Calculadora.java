import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		/*	-> Solicitar a el usuario los datos (numeros, operaciones)
		 * 	-> Sumas, Restas, Multiplicaciones, Divisiones
		 * 
		 */
		
		Scanner entrada =  new Scanner(System.in);
		
		double n1;
		double n2;
		double resultado;
		int op;
		
		do {
			System.out.println("***** Menú *****\n1.-Ingresa 1 para Suma\n2.-Ingresa 2 para Resta\n3.-Ingresa 3 para División\n4.-Ingresa 4 para Multipliacación\n5.-Ingresa 5 para Mod\n6.-Ingresa 6 para Calcualr el áres de un circulo");
			op = entrada.nextInt();
			if (op == 1) {
				System.out.println("Ingresa el 1er número");
				n1 = entrada.nextDouble();
				System.out.println("Ingresa el 2do número");
				n2 = entrada.nextDouble();
				resultado = Suma(n1, n2);
				System.out.println("El resultado de la suma es : "+resultado);
			}else if (op == 2) {
				System.out.println("Ingresa el 1er número");
				n1 = entrada.nextDouble();
				System.out.println("Ingresa el 2do número");
				n2 = entrada.nextDouble();
				resultado = Resta(n1, n2);
				System.out.println("El resultado de la resta es : "+resultado);
			}else if (op == 3) {
				System.out.println("Ingresa el 1er número");
				n1 = entrada.nextDouble();
				System.out.println("Ingresa el 2do número");
				n2 = entrada.nextDouble();
				resultado = Division(n1, n2);
				System.out.println("El resultado de la división es : "+resultado);
			}else if (op == 4) {
				System.out.println("Ingresa el 1er número");
				n1 = entrada.nextDouble();
				System.out.println("Ingresa el 2do número");
				n2 = entrada.nextDouble();
				resultado = Multiplicacion(n1, n2);
				System.out.println("El resultado de la multiplicación es : "+resultado);
			}else if (op == 5) {
				System.out.println("Ingresa el 1er número");
				n1 = entrada.nextDouble();
				System.out.println("Ingresa el 2do número");
				n2 = entrada.nextDouble();
				resultado = Modulo(n1, n2);
				System.out.println("El resultado del Modulo es : "+resultado);
			}else if (op == 6) {
				System.out.println("Ingresa el radio");
				n1 = entrada.nextDouble();
				resultado = AreaCirculo(n1);
				System.out.println("El área del circulo es : "+resultado);
			}
		}while((op >= 1) && (op <= 6));
	}
	
	public static double Suma(double n1, double n2) {
		double res = n1 + n2;
		return res;
	}
	
	public static double Resta(double n1, double n2) {
		double res = n1 - n2;
		return res;
	}
	
	public static double Division(double n1, double n2) {
		double res = n1 / n2;
		return res;
	}

	public static double Multiplicacion(double n1, double n2) {
		double res = n1 * n2;
		return res;
	}
	
	public static double Modulo(double n1, double n2) {
		double res = n1 % n2;
		return res;
	}
	
	public static double AreaCirculo(double radio) {
		double res = Math.PI*(radio*radio);
		return res;
	}
}
