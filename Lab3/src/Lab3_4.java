class des4 {
	int num1, num2, num3, total;
	String nombre;
	des4(){
		nombre = "Juan Pérez";
		num1=100;
		num2=90;
		num3=95;
		total = (num1 + num2 + num3)/3;
	}
	void desplegar() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Promedio= " + total);
	}
}
public class Lab3_4 {
	public static void main(String[] args) {
		des4 op4 = new des4();
		op4.desplegar();	
	}

}
