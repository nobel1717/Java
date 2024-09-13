import java.util.*;
class de8{
	int i, num, res;
	de8(){
		Scanner entra = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		num = entra.nextInt();
	}
	void desplegar() {
		for(i=1; i<=12; i++){
			res = num * i;
			System.out.println(num + " X " + i + " = " + res);}
	}
}
public class Lab5b_8 {
	public static void main(String[] args){
		de8 p8 = new de8();
		p8.desplegar();
	}
}
