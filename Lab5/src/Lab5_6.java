import java.util.*;
class des6{
	int v,num2;
	
	des6(){
		Scanner ea = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		v = ea.nextInt();
		System.out.println("Ingrese otro número (del 0-3): ");
		num2 = ea.nextInt();
		
	}
	void desplegar() {
		switch (num2){
		case 1:
			v = 100 * v;
			break;
		case 2:
			v = 100 + v;
			break;
		case 3:
			v = 100 / v;
			break;
		default:
			v = 0;
		}
		System.out.println("El total es: " + v);
	}
}
public class Lab5_6 {
	public static void main(String[] arg) {
		des6 p6 = new des6();
		p6.desplegar();
	}
}
