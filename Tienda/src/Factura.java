
public class Factura {
	private int ID;
	private Cliente cliente;
	private double total;
	
	public Factura(int iD, Cliente cliente, double total) {
		ID = iD;
		this.cliente = cliente;
		this.total = total;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getNombreCliente() {
		return this.cliente.getNombre();
	}
	
	public double getTotalDespuesDeDescuento() {
		int descuentoCliente = this.cliente.getDescuento();
		double precioFinal = this.total - ((descuentoCliente*this.total)/100);
		return precioFinal;
	}
	
}
