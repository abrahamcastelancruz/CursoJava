
public class Cliente {
	
	private int ID;
	private String nombre;
	private int descuento;
	
	public Cliente(int iD, String nombre, int descuento) {
		ID = iD;
		this.nombre = nombre;
		this.descuento = descuento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDescuento() {
		return descuento;
	}
	
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	public int getID() {
		return ID;
	}
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", descuento=" + descuento + "]";
	}
	
	
}
