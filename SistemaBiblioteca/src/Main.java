import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nombre;
		String email;
		String cad;
		char genero;
		boolean aux = true;
		
		Scanner entrada = new Scanner(System.in);
		
		do{
			System.out.println("Ingresa el nombre del Autor");
			nombre = entrada.nextLine();
		}while(nombre.length() <= 0);
		
		do{
			System.out.println("Ingresa el email del Autor");
			email = entrada.nextLine();
		}while(email.length() <= 0);
		
		do {
			System.out.println("Ingresa el genero del Autor (f -> Femenino | m -> Masculino)");
			cad = entrada.nextLine();
			genero = cad.charAt(0);
			if((genero == 'm' || genero == 'f') && cad.length() == 1) {
				aux = false;
			}
		}while(aux);
		
		Autor autor = new Autor(nombre, email, genero);
		System.out.println(autor.toString());
		
		Autor a = new Autor("Abraham Castelan", "abraham@gmail.com", 'm');
		Libro java = new Libro("Java Desde Cero", a, 200, 10);
		System.out.println(java.toString());
	}

}
