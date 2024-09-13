import java.io.*;
class de5{
	double apr, cont,des,etno,not,prom,promapr,promdes;
	
	void asignar(){
		cont = 1;
		apr = 0;
		cont = 0;
		des = 0;
		prom = 0;
		promapr = 0;
		promdes = 0;
		
	}
	void calcular() throws IOException{
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("¿Cuántas notas va a ingresar?"); 
		
		not = Double.parseDouble(bufEntrada.readLine());

		while (cont<not) {
			System.out.println("Ingrese la nota "+" de la escala del 1 al 100");
			etno = Double.parseDouble(bufEntrada.readLine());
			if (etno>=60 && etno<=100) {
				apr = apr+1;
				prom = prom+etno;
				promapr = promapr+1;
				cont = cont+1;
			} else {
				if (etno<=60 && etno>=0) {
					des = des+1;
					prom = prom+etno;
					promdes = promdes+1;
					cont = cont+1;
				} else {
					System.out.println("Esa nota no es válida");
				}
			}
		}
		prom = prom/not;
		promapr = (promapr/not)*100;
		promdes = (promdes/not)*100;
	}
	void desplegar() {
		System.out.println(" ");
		System.out.println("Tiene: "+apr+" notas aprobadas.");
		System.out.println("Tiene: "+des+" notas desaprobadas.");
		System.out.println("El promedio de notas es de: "+prom);
		System.out.println("El promedio de notas aprobadas es de: "+promapr+" %");
		System.out.println("El promedio de notas desaprobadas es de: "+promdes+" %");
	}	
}
public class Lab5b_5 {
	public static void main(String[]arg) throws IOException {
		de5 p5 = new de5();
		p5.asignar();
		p5.calcular();
		p5.desplegar();
		
	}
}
