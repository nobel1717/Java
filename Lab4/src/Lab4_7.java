import javax.swing.*;

class des7{
	Double costo, pago, cambio;
	void asignar() {
		String co, pa;
		co = JOptionPane.showInputDialog("Ingrese el costo del vehículo: ");
		costo = Double.parseDouble(co);
		pa = JOptionPane.showInputDialog("Ingrese el pago: ");
		pago = Double.parseDouble(pa);
	}
	void restar() {
		cambio = pago - costo;
	}
	void desplegar() {
		System.out.println("El cambio a pagar es de: " + cambio);
	}
}

public class Lab4_7 {
	public static void main(String[] args) {
		des7 op7 = new des7();
		op7.asignar();
		op7.restar();
		op7.desplegar();
	}
}
