
public class OperadoresRelacionales {

	public static void main(String[] args) {
		boolean x = true;
		boolean y = true;
		int n1 = 5;
		int n2 = 15;
		
		// Igual a ==
		/* 	Si las variables son iguales res = true
		 	Si son distintas el resultado es false
		 */
		boolean res = (n1 == n2);
		//System.out.println(res);
		
		// Diferente que !=
		/*	Si las variables son iguales res = false
			Si las variables son distintas res = true
		 */
		res = (n1 != n2);
		//System.out.println(res);
		
		// Mayor que >
		res = (n1 > n2);
		//System.out.println(res);
		
		// Menor que <
		res = (n1 < n2);
		//System.out.println(res);
		
		// Mayor o igual >=
		res = (n1 >= n2);
		//System.out.println(res);
		
		// Menor o igual <=
		res = (n1 <= n2);
		System.out.println(res);
		
	}

}
