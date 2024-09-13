import java.util.*;
class des8 {
	int b, h, atotal;
	des8(){
		Scanner lec = new Scanner(System.in);
		System.out.println("Ingrese el primer número: ");
		b= lec.nextInt();
		System.out.println("Ingrese el segundo número: ");
		h=lec.nextInt();
			
		atotal = (b * h)/2;
	}
	void desplegar() {
		System.out.println("Área del triángulo");
		System.out.println("= " + atotal);
	}
}
public class Lab4_8 {
	public static void main(String[] args) {
		des8 op8 = new des8();
		op8.desplegar();
	}
}
