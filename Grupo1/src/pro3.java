class de3{
	int a,b,c,i;
	
	void asignar() {
		a = 0;
		b = 1;
	}
	void desplegar() {
		for(i=1; i<= 10; i++){
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}
}
public class pro3 {

	public static void main(String[] args) {
		de3 p3 = new de3();
		p3.asignar();
		p3.desplegar();
	}

}
