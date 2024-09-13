import java.io.*;
class des5{
		int min, ad;
		double total;
	void asignar() throws IOException {
		InputStreamReader lea = new InputStreamReader(System.in);
		BufferedReader lee = new BufferedReader(lea);
		System.out.println("Ingrese la cantidad de minutos en la llamada: ");
		min = Integer.parseInt(lee.readLine());
	}
	void calcular() {
		if (min > 0) {
			if (min <= 3) {
				total =  0.50;
			} else {
				ad = min - 3;
				total = 0.50 + (ad *0.1);
			}
		System.out.println("El monto a pagar es de: " + total);
		}else {
			System.out.println("Error, ingrese un número entero positivo");
		}
	}
}
public class Lab5_5 {
	public static void main (String []arg) throws IOException {
		des5 p5 = new des5();
		p5.asignar();
		p5.calcular();
	}
}
