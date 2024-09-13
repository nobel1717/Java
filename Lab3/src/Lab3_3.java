class des3{
	double num1, num2,num3, total;
	void asignar () {
		num1=4;
		num2=2;
		num3=2;
	}
	void operacion() {
		total = (num3 + num2)*(3-num2);
		total = total / Math.pow(4, num1);
	}
	void desplegar() {
		System.out.println("Resultado");
		System.out.println("= " + total);
	}
}
public class Lab3_3 extends Lab3_2 {
	public static void main(String[] args) {
		des3 op3 = new des3();
		op3.asignar();
		op3.operacion();
		op3.desplegar();
	}
}
