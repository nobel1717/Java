class des2{
	int num1, num2, total;
	des2(){
		num1=10;
		num2=5;
	}
	void sumar() {
		total = (num1 + num2)/3;
	}
	void desplegar() {
		System.out.println("Resultado");
		System.out.println("= " + total);
	}
}

public class Lab3_2 {

	public static void main(String[] args) {
		des2 po2 = new des2();
		po2.sumar();
		po2.desplegar();				
	}
}
