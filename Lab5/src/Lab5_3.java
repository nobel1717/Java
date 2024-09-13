import java.util.*;
class des3{
	int num1,num2;
	
	des3(){
		Scanner ea = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		num1 = ea.nextInt();
		System.out.println("Ingrese otro número: ");
		num2 = ea.nextInt();
	}
	void desplegar() {
		if (num1 > num2) {
			System.out.println( num1 + " es el mayor");
		}else if( num1 < num2){
			System.out.println( num2 + " es el mayor");
		}else {
			System.out.println( num1 + " y " + num2 + " tienen el mismo valor");
		}
	}
}
public class Lab5_3 {
	public static void main(String[] arg) {
		des3 p3 = new des3();
		p3.desplegar();
	}
}
