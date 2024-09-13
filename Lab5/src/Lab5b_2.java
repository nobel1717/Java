import java.util.*;
class de2 {
	double fact;
	int num;
	de2() {
		
		Scanner teclado = new Scanner( System.in );
		System.out.print("Introduce un número: ");
		 num=teclado.nextInt();
	}
	void desplegar() {
		fact = 1; 
		for (int i=num;i>0;i--)
		 {
		 fact = fact * i;

		 }
		 System.out.println("El factorial de " + num + " es: " + fact);

	}
}
public class Lab5b_2 {
	public static void main(String[] args) {
		de2 p2 = new de2();
		p2.desplegar();
	}
}
