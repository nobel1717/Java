import java.util.*;

class des{
	public int n1,n2,n3;
	
	void sumar(){
		Scanner lee = new Scanner(System.in);
		System.out.println("Ingrese el primer número: ");
		n1 = lee.nextInt();
		System.out.println("Ingrese el segundo número: ");
		n2 = lee.nextInt();
		
		n3 = n1 + n2;
	}
	void desplegar() {
		System.out.println("El resultado de la suma es: " + n3);
	}
}

public class Lab4_1 {
	public static void main(String[] args) {
		des po = new des();
		po.sumar();
		po.desplegar();				
	}
}
