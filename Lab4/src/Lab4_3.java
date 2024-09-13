import java.io.*;
class des3 {
	double num1, num2,num3, total;
	void asignar () throws IOException{
		InputStreamReader  lea =  new InputStreamReader(System.in);
		BufferedReader lec = new BufferedReader(lea);
		System.out.println("Ingrese el primer número: ");
		num1 = Double.parseDouble(lec.readLine());
		System.out.println("Ingrese el segundo número: ");
		num2 = Double.parseDouble(lec.readLine());
		System.out.println("Ingrese el tercer número: ");
		num3 = Double.parseDouble(lec.readLine());
	}
	void operacion() {
		total = (num3 + num2)*(3-num2);
		total = total / Math.pow(4, num1);
	}
	void desplegar() {
		System.out.println("Resultado");
		System.out.println("= " + total);
	}
}
public class Lab4_3 {
	public static void main(String[] args) throws IOException{
		des3 op3 = new des3();
		op3.asignar();
		op3.operacion();
		op3.desplegar();
	}
}
