import java.util.Scanner;

import com.sun.source.tree.CaseTree.CaseKind;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*	Pedir por teclado un número entre 0 y 10, si
		 * 	el número es diferente que imprima que se debe
		 * 	ingresar un número entre 0 y 10, indicar si el número
		 * 	es menor de 7 entonces imprimir que reporobó, si el número
		 * 	es mayor o igual de 70 imprimir que aprobo
		 * 	y si el número es 10 imprimir que saco excelencia
		 */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu calificación : ");
		int calificacion = entrada.nextInt();
		
		if((calificacion < 0) || (calificacion > 10)) {
			System.out.println("Ingresa un número entre 0 y 10");
		}else if(calificacion < 7) {
			System.out.println("Estas reprobado!!");
		}else if(calificacion >= 7) {
			if(calificacion == 10) {
				System.out.println("Excelente sacaste 10!!");
			}else {
				System.out.println("Felicidades aprobaste!!");
			}
		}
	}

}
