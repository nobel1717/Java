class des9{
	double peso,lon;
	String nombre;
	void asignar() {
		peso = 0.76;
		lon = 72.86;
		nombre = "Josh";
	}
	void transformar() {
		peso = peso * 1000;
		lon = lon * 0.3047;
		lon= Math.round(lon *100.0)/100.0;
			}
	void desplegar() {
		System.out.println("El dinosaurio: " + nombre);
		System.out.println("El peso en kg es de: " + peso);
		System.out.println("La longitud en mt es de: " + lon);
	}
}

public class Lab3_9 {
	public static void main(String[] args) {
		des9 op9 = new des9();
		op9.asignar();
		op9.transformar();
		op9.desplegar();
	}
}
