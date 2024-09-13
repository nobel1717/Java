import java.util.*;
class des2{
	int num;
	
	des2(){
		Scanner ea = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		num = ea.nextInt();
	}
	void desplegar() {
		if (num % 2 == 0) {
			System.out.println("Es par.");
		}else {
			System.out.println("Es impar.");
		}
	}
}
public class Lab5_2 {
	public static void main(String[]arg) {
		des2 p2 = new des2();
		p2.desplegar();
	}
}
