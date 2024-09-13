import java.util.*;
class de10{
	int a,b,c,i,num;
	void asignar() {
		Scanner p = new Scanner(System.in);
		System.out.println("Digite un número entero: ");
		num = p.nextInt();
		a = 0;
		b = 1;
	}
	void desplegar() {
		for(i=0; i<= num; i++){
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}
}
public class Lab5b_10 {
	public static void main(String[] args) {
		de10 p10 = new de10();
		p10.asignar();
		p10.desplegar();
	}

}
