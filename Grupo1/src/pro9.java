import java.util.*;

class des9 {
	double cate1, cate2,hypo;
	des9(){
		Scanner lec = new Scanner(System.in);
		System.out.println("Ingrese el primer número: ");
		cate1 = lec.nextDouble();
		System.out.println("Ingrese el segundo número: ");
		cate2 = lec.nextDouble();
	}
	void calcular() {
		//hypo = Math.sqrt(Math.pow(cate1, 2) + Math.pow(cate2, 2));//
		hypo = Math.hypot(cate1, cate2);
	}
	void desplegar() {
		System.out.println("Área del triángulo");
		System.out.println("= " + hypo);}
}
public class pro9 {
	public static void main(String[] args) {
		des9 op9 = new des9();
		op9.calcular();
		op9.desplegar();
	}

}
