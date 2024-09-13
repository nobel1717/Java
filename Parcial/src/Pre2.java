class Segundo{
	private String nom;
	private double sh, ht, ded,sn,au,sf;
	void asignar () {
		nom = "Juan";
		sh = 14.00;
		ht = 40;
		ded = 100;
	}
	void calcular() {
		sn = (sh*ht)- ded;
		au = (sh*0.05);
		sf = sn + au;
		System.out.println("Nombre: "+ nom + " ,Sueldo neto: " + sn);
		System.out.println("Aumento: "+ au + " ,Sueldo final: " + sf);
	}
}

public class Pre2 {
	public static void main(String[]arg) {
		Segundo p2 = new Segundo();
		p2.asignar();
		p2.calcular();
	}
}
