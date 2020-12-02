
public class Main {

	public static void main(String[] args) {
		Circulos c1 = new Circulos();
		System.out.println("El area de C1 es");
		System.out.println(c1.Area());
		System.out.println(c1.getRadio());
		System.out.println(c1.getColor());
		c1.setRadio(6.0);
		System.out.println(c1.getRadio());
		c1.setColor("morado");
		System.out.println(c1.getColor());
		System.out.println(c1.toString());
		
		System.out.println("-------------------------------");
		Circulos c2 =  new Circulos(3.0);
		System.out.println("El area de C2 es");
		System.out.println(c2.Area());
		c2.setRadio(1.8);
		System.out.println(c2.Area());
		System.out.println(c2.getRadio());
		System.out.println(c2.getColor());
		c2.setColor("dorado");
		System.out.println(c2.getColor());
		System.out.println(c2.toString());
		
		System.out.println("-------------------------------");
		Circulos c3 = new Circulos(4.5, "azul");
		System.out.println("El area de C3 es");
		System.out.println(c3.Area());
		System.out.println(c3.toString());
	}

}
