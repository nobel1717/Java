class Tercero{
	private double n1,n2,n3;
	Tercero(double x1, double x2, double x3){
		n1 = x1;
		n2 = x2;
		n3 = x3;
	}
	void desplegar() {
		double prom = (n1+n2+n3)/3;
		System.out.println("Promedio: "+prom);
	}
}
public class Pre3 {
	public static void main(String[]arg) {
		Double a1 = 10.0;
		Double a2 = 15.0;
		Double a3 = 4.0;
		Tercero p3 = new Tercero(a1,a2,a3);		
		p3.desplegar();
	}
}
