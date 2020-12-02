
public class Circulos {
	/*	Atributos
	 * 
	 * 	-> radio
	 * 	-> color 
	 */
	
	// Setter -> nos permiten asignar valores a variables
	// Getter -> retornan u obtiene un valor(devuelven la informacion del atributo solicitado)
	
	// toString -> es usado para mostrar u obtener la informacion del objeto
	
	double radio;
	String color;
	
	public Circulos() {
		radio = 1.5;
		color = "verde";
	}
	
	public Circulos(double radio) {
		this.radio = radio;
		color = "rojo";
	}
	
	public Circulos(double radio, String color) {
		this.radio = radio;
		this.color = color;
	}
	
	public double Area() {
		return radio*radio*Math.PI;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circulos radio=" + radio + ", color=" + color;
	}
}
