class de3 {
	double c,f;
	void imprimir() {
		c = 0;
		for (f=1;f<=200;f++) {
			c = (f-32)* 5/9;
			System.out.println("La temperatura de " + f + "° Fahrenheit es de " + c +"°C.");
		}
	}
}

public class Lab5b_3 {
	public static void main(String[] args) {
		de3 p3 = new de3();
		p3.imprimir();
	}

}
