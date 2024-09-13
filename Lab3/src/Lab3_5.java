class des5{
	int b, h, ptotal, atotal;
	des5(){
		b=10;
		h=10;
			
		atotal = (b * h);
		ptotal = 2 * (b + h);
	}
	void desplegar() {
		System.out.println("Área y Perímetro del triángulo");
		System.out.println("Área: " + atotal);
		System.out.println("Perímetro: " + ptotal);
	}
}
public class Lab3_5 {

	public static void main(String[] args) {
		des5 op5 = new des5();
		op5.desplegar();
	}
}
