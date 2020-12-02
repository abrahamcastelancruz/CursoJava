
public class EstructurasCondicionales {

	public static void main(String[] args) {
		/* Un algoritmo es cualquier procedimiento 
		 	computacional que tiene una entrada (valor)
		 	y nos retorna una salida.
		 */
		
		// Estructura condicional IF
		/*
		 if(condición){
		 	ejecuta el bloque
		 }
		 */
		
		int n1 = 10;
		int n2 = 20;
		
		if(n1 == n2) {
			System.out.println("Son iguales");
		}else if(n1 < n2){
			System.out.println("El número "+n1+" es menor que "+n2);
		}else {
			
		}
		
		System.out.println("fuera del if");
	}

}
