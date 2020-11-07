import java.util.Scanner;

public class SistemaBanco {

	public static void main(String[] args) {
		/*	-> Ingresar un Nip(4 digitos)
		 * 	-> Depositar
		 * 	-> Retirar
		 * 	-> Consultar Saldo	
		 * 	-> Imprimir el voucher
		 */
		
		Scanner entrada =  new Scanner(System.in);
		System.out.println("Bienvenido Ingresa tu NIP");
		int nip = entrada.nextInt();
		int cuenta = 0;
		int conf;
		int aux;
		int op;
		int res;
		String operaciónExitosa = "La Operación Se Realizo Con Éxito!!";
		
		do {
			System.out.println("**** Menú *****\n1.- Ingresa 1 para Depositar\n2.- Ingresa 2 para Retirar\n3.- Ingresa 3 para Consultar Saldo\n4.- Ingresa 0 para salir");
			op = entrada.nextInt();
			if(op == 1) {
				System.out.println("**** Menú ****\n1.-Ingresa 1 para depositar $200\n2.-Ingresa 2 para depositar $500\n3.-Ingresa 3 para depositar $1000\n4.-Ingresa 4 para otro monto");
				op = entrada.nextInt();
				if((op > 0) && (op < 5)) {
					 res = Depositar(op);
					 if(res == 200) {
						 cuenta += res;
						 System.out.println(operaciónExitosa);
					 }else if(res == 500) {
						 cuenta += res;
						 System.out.println(operaciónExitosa);
					 }else if(res == 1000) {
						 cuenta += res;
						 System.out.println(operaciónExitosa);
					 }else {
						 int monto = 0;
						 do {
							 System.out.println("Ingresa el monto a depositar");
							 monto = entrada.nextInt();
						 }while(monto <= 0);
						 cuenta += monto;
						 System.out.println(operaciónExitosa);
					 }
				}else {
					System.out.println("Ingresa una opción válida");
				}
				
			}else if(op == 2) {
				System.out.println("**** Menú ****\n1.-Ingresa 1 para retirar $200\n2.-Ingresa 2 para retirar $500\n3.-Ingresa 3 para retirar $1000\n4.-Ingresa 4 para otro monto");
				op = entrada.nextInt();
				if((op > 0) && (op < 5)) {
					 res = Retirar(op);
					 if(res == 200) {
						 if(cuenta >= res) {
							 cuenta -= res;
							 System.out.println(operaciónExitosa);
						 }
					 }else if(res == 500) {
						 if(cuenta >= res) {
							 cuenta -= res;
							 System.out.println(operaciónExitosa);
						 }
					 }else if(res == 1000) {
						 if(cuenta >= res) {
							 cuenta -= res;
							 System.out.println(operaciónExitosa);
						 }
					 }else {
						 int monto = 0;
						 do {
							 System.out.println("Ingresa el monto a retirar");
							 monto = entrada.nextInt();
						 }while(monto <= 0);
						 if(cuenta >= monto) {
							 cuenta -= monto;
							 System.out.println(operaciónExitosa);
						 }
					 }
				}else {
					System.out.println("Ingresa una opción válida");
				}
			}
		}while(op != 0);
		System.out.println(cuenta);
	}
	
	public static int Depositar(int opcion) {
		int dinero = 0;
		switch(opcion) {
			case 1:
				dinero = 200;
				break;
			case 2:
				dinero = 500;
				break;
			case 3:
				dinero = 1000;
				break;
			case 4:
				dinero = 1;
				
		}
		return dinero;
	}
	
	public static int Retirar(int opcion) {
		int dinero = 0;
		switch(opcion) {
			case 1:
				dinero = 200;
				break;
			case 2:
				dinero = 500;
				break;
			case 3:
				dinero = 1000;
				break;
			case 4:
				dinero = 1;
				
		}
		return dinero;
		
	}

}
