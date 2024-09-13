import java.util.*;
class de6{
	int num, cont1,con2;
	int par, cero, impar, posi,nega;
	
	de6(){
		Scanner ea = new Scanner(System.in);
		System.out.println("¿Cuántos números enteros va a ingresar? ");
		con2 = ea.nextInt();
		cont1 = 1;	
		do {
			System.out.println("Ingrese un número: ");
			num = ea.nextInt();
			if(num == 0) {
				cero ++;
			}else {
				if(num >0) {
					posi ++;
				}else {
					nega++;
				}
			}
			if(num %2==0){
				par= par+ 1;
			} else {
				impar ++;
			}
			
			cont1 ++;
		}while(cont1 <= con2);
	}
	void desplegar() {
		
		System.out.println("Ceros totales = " + cero); 
		System.out.println("Pares totales = "+ par);
		System.out.println("Impares totales = " + impar);
		System.out.println("Positivos totales = "+ posi);
		System.out.println("Negativos totales = " + nega);
	}
}
public class Lab5b_6 {
	public static void main(String[] args){
		de6 p6 = new de6();
		p6.desplegar();
	}
}
