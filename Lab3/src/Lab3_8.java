class des8 {
	int b, h, atotal;
	des8(){
		b=10;
		h=10;
			
		atotal = (b * h);
	}
	void desplegar() {
		System.out.println("Área del triángulo");
		System.out.println("= " + atotal);
	}
}
public class Lab3_8 {

	public static void main(String[] args) {
		des8 op8 = new des8();
		op8.desplegar();
	}

}
