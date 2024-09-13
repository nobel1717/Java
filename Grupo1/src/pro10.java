import java.util.*;

class des10{
	int year;
	des10(){
		Scanner lec = new Scanner(System.in);
		System.out.println("Ingrese un año: ");
		year = lec.nextInt();
	}
	void desplegar() {
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
			System.out.println("El año es bisiesto");
		else
			System.out.println("El año no es bisiesto");
	}
}
public class pro10 {
	public static void main(String[] args) {
		des10 op10 = new des10();
		op10.desplegar();
	}

}
