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
		do {
			System.out.println("**** Menú *****\n1.- Ingresa 1 para Depositar\n2.- Ingresa 2 para Retirar\n3.- Ingresa 3 para Consultar Saldo\n4.- Ingresa 0 para salir");
			op = entrada.nextInt();
			if(op == 1) {
				System.out.println("**** Menú ****\n1.-Ingresa 1 para depositar $200\n2.-Ingresa 2 para depositar $500\n3.-Ingresa 3 para depositar $1000\n4.-Ingresa 4 para otro monto");
				op = entrada.nextInt();
				if((op > 0) || (op < 5)) {
					System.out.println(Depositar(op));
				}else {
					System.out.println("Ingresa una opción válida");
				}
				
			}
		}while(op != 0);
		
		
		/*int op = entrada.nextInt(); 
		if(op == 1) {
			System.out.println("**** Menú ****\n1.-Ingresa 1 para depositar $200\n2.-Ingresa 2 para depositar $500\n3.-Ingresa 3 para depositar $1000\n4.-Ingresa 4 para otro monto");
			
			if(op > 0  || op < 5) {
				if(op == 1) {
					System.out.println("Ingresa '1' para confirmar o '2' para cancelar");
					conf = entrada.nextInt();
					if(conf == 1) {
						cuenta += 200;
					}else if(conf == 2) {
						System.out.println("Operación Cancelada");
					}
				}else if(op == 2) {
					System.out.println("Ingresa '1' para confirmar o '2' para cancelar");
					conf = entrada.nextInt();
					if(conf == 1) {
						cuenta += 500;
					}else if(conf == 2) {
						System.out.println("Operación Cancelada");
					}
				}else if (op == 3) {
					System.out.println("Ingresa '1' para confirmar o '2' para cancelar");
					conf = entrada.nextInt();
					if(conf == 1) {
						cuenta += 1000;
					}else if(conf == 2) {
						System.out.println("Operación Cancelada");
					}
				}else {
					System.out.println("Ingresa el monto a depositar");
					aux = entrada.nextInt();
					if(aux > 0) {
						cuenta += aux;
					}else {
						System.out.println("Ingresa un monto válido");
					}
				}
			}
		}
		
		System.out.println(cuenta);*/
	}
	
	public static int Depositar(int opcion) {
		return opcion;
	}

}
