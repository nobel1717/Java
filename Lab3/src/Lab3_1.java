public class Lab3_1 {

	public static void main(String[] args) {
		des1 po1 = new des1();
		po1.asignar();
		po1.presentar();				
	}
}

class des1 {
	int num1, num2, total;
	void asignar() {
		num1=55;
		num2=45;
		total = num1 + num2;
	}
	void presentar() {
		System.out.println("Resultado");
		System.out.println("= " + total);
	}
}
