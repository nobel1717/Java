import javax.swing.*;
class des5{
	Double b, h, ptotal, atotal;
	des5(){
		String ba, al;
		ba = JOptionPane.showInputDialog("Escribe la base: ");
		b= Double.parseDouble(ba);
		al = JOptionPane.showInputDialog("Escriba la altura: ");
		h= Double.parseDouble(al);
			
		atotal = (b * h);
		ptotal = 2 * (b + h);
	}
	void desplegar() {
		System.out.println("Área y Perímetro del triángulo");
		System.out.println("Área: " + atotal);
		System.out.println("Perímetro: " + ptotal);
	}
}
public class Lab4_5 {
	public static void main(String[] args) {
		des5 op5 = new des5();
		op5.desplegar();
	}
}
