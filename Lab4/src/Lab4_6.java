import java.io.*;
class des6 {
	int num1, num2, total1, total2, total3, total4;
	des6() throws IOException {
		InputStreamReader ee = new InputStreamReader(System.in);
		BufferedReader en = new BufferedReader(ee);
		System.out.println("Ingrese el número 1: ");
		num1= Integer.parseInt(en.readLine());
		System.out.println("Ingrese el número 2: ");
		num2= Integer.parseInt(en.readLine());
	}
	void opera() {
		total1 = num1 + num2;
		total2 = num1 - num2;
		total3 = num1 * num2;
		total4 = num1 / num2;
	}
	void desplegar() {
		System.out.println("Resultados");
		System.out.println("Suma= " + total1);
		System.out.println("Resta= " + total2);
		System.out.println("Multiplicación= " + total3);
		System.out.println("División= " + total4);
	}
}
public class Lab4_6 {
	public static void main(String []arg) throws IOException{
		des6 op6 = new des6();
		op6.opera();
		op6.desplegar();
	}
}