import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu nombre : ");
		String nombre = entrada.nextLine();
		
		//System.out.println("Hola "+nombre);
		switch(nombre) { // inicia el switch
			case "Paco": 
				System.out.println("Hola "+nombre);
				break;
			case "Angel":
				System.out.println("Hola "+nombre);
				break;
			case "Abraham":
				System.out.println("Hola "+nombre);
				System.out.println("adsada");
				break;
			default:
				System.out.println("El nombre no existe en la BD");
		} // termina el switch
		
		System.out.println("Fuera del Switch");
		
		
		/*if (nombre.equals("Paco")) {
			System.out.println("Hola "+nombre);
		}else if (nombre.equals("Angel")) {
			System.out.println("Hola "+nombre);
		}else if (nombre.equals("Abraham")) {
			System.out.println("Hola "+nombre);
		}else {
			System.out.println("El nombre no existe en la BD");
		}*/	
		
	}

}
