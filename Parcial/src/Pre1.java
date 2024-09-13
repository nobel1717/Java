class Primero{
	private String nom, marca;
	private double precio;
	
	void asignar(String xnom,String xmarca, double xpre) {
		nom =xnom;
		marca = xmarca;
		precio = xpre;		
	}
	void calcular() {
		double pf = precio + (precio*0.25);
		System.out.println("Nombre: " + nom + " Marca: "+ marca + " Precio: "+ pf);
	}
}
public class Pre1 {
	public static void main(String[]arg) {
		String nombre, marca;
		Double precio;
		Primero p1 = new Primero();
		nombre = "Juan";
		marca = "Kia";
		precio = 2000.00;
		
		p1.asignar(nombre, marca, precio);
		p1.calcular();
	}
	
	
}
