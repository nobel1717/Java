import java.io.*;

class des2{
	public double n1,n2,n3;
	
	void sumar(double xn1, double xn2){
			n1 = xn1;
			n2 = xn2;
			n3 = (n1+n2)/3;
	}
	void desplegar() {
		System.out.println("El resultado de la suma es: " + n3);
	}
}
public class Lab4_2 {
	public static void main(String[] args) throws IOException {
		double n1,n2;
		InputStreamReader lector = new InputStreamReader(System.in);
		BufferedReader entrada = new BufferedReader(lector);
		System.out.println("Inicio");
		System.out.println("Ingrese el primer número: ");
		n1 = Double.parseDouble(entrada.readLine());
		System.out.println("Ingrese el segundo número: ");
		n2 = Double.parseDouble(entrada.readLine());
		
		des2 po = new des2();
		po.sumar(n1,n2);
		po.desplegar();				
	}
}
