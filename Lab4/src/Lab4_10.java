import javax.swing.*;
class des10{
	double a,b;
	des10(){
		String n1;
		n1 = JOptionPane.showInputDialog("Ingrese la cantidad de galones: ");
		a = Double.parseDouble(n1);
		b = a * 3.785 * 1.025;
	}
	void desplegar(){
		System.out.println("El pago es de: " + b + "$.");
	}
}
public class Lab4_10 {
	public static void main(String[]arg) {
		des10 po10 = new des10();
		po10.desplegar();
	}
}
