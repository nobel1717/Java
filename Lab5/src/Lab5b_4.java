import java.util.*;
class de4 {
	int i, n, re;
	
	de4(){
		Scanner nu = new Scanner(System.in);
		System.out.println("Ingrese un número entero: ");
		n = nu.nextInt();
	
	}
	void calcular(){
		i = 1;
		while(i<=9) {
			re = (int) Math.pow(n,i);
			if (re >=2000 ) {
				break;
			}else {
				System.out.println(i + " elevado a " + n + " es = " + re);
			}
			i++;
		}
	}
}
public class Lab5b_4 {
	public static void main(String[] args){
		de4 p4 = new de4();
		p4.calcular();
	}
}
