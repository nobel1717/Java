class des7{
	int costo, pago, cambio;
	void asignar() {
		costo = 10;
		pago = 15;
	}
	void restar() {
		cambio = pago - costo;
	}
	void desplegar() {
		System.out.println("El cambio a pagar es de: " + cambio);
	}
}
public class Lab3_7 {
	public static void main(String[] args) {
		des7 op7 = new des7();
		op7.asignar();
		op7.restar();
		op7.desplegar();
	}
}
