import java.util.*;

class des4 {
	int num1, num2, num3, total;
	String nombre,n1,n2,n3;
	des4(){
		Scanner lea = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		nombre = lea.nextLine();
		System.out.println("Ingrese El número 1: ");
		n1= lea.nextLine();
		num1 = Integer.parseInt(n1);
		System.out.println("Ingrese El número 2: ");
		n2 = lea.nextLine();
		num2 = Integer.parseInt(n2);
		System.out.println("Ingrese El número 3: ");
		n3= lea.nextLine();
		num3 = Integer.parseInt(n3);
		total = (num1 + num2 + num3)/3;
	}
	void desplegar() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Promedio= " + total);
	}
}
public class Lab4_4 {
	public static void main(String[] args) {
		des4 op4 = new des4();
		op4.desplegar();	
	}

}
