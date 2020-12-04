
public class Main {

	public static void main(String[] args) {
		/*String n1 = "1";
		
		int n2 = Integer.parseInt(n1);
		System.out.println(n2+1);*/
		
		Cliente rubi = new Cliente(1, "Rubi Ramírez Santiago", 10);
		
		Cliente abraham = new Cliente(2, "Abraham Castelan Cruz", 0);
		
		rubi.setNombre("Rubi");;
		rubi.setDescuento(30);
		
		Factura factura = new Factura(1, rubi, 1500);
		
		// Cliente Original
		System.out.println(factura.getNombreCliente());
		
		//System.out.println(factura.getCliente());
		
		//factura.setCliente(abraham);
		// Cliente Actualizado (Nuevo)
		//System.out.println(factura.getNombreCliente());
		
		/*System.out.println(factura.getCliente());
		System.out.println(factura.getTotal());
		factura.setTotal(1300);
		System.out.println(factura.getTotal());*/
		
		System.out.println(factura.getTotalDespuesDeDescuento());
		
	}

}
