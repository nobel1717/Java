import java.io.*;
class des{
	public int aa, an, edad;
	String nom;
	des(int xaa, int xan, String xnom){
		aa = xaa;
		an = xan;
		nom = xnom;
		
		edad = aa - an;
	}
	void desplegar() {
		System.out.println("Su nombre: " + nom);
		System.out.println("Año de nacimiento: " + an);
		System.out.println("Año actual: " + aa);
		System.out.println("Edad: " + edad);
		
		if(edad >= 18) {
			System.out.println("Es mayor de edad.");
		}else if(edad >= 0 && edad < 18){
			System.out.println("Es menor de edad.");
		}else {
			System.out.println("No existe esta edad.");
		}
	}
}
public class Lab5_1 {
	public static void main (String []arg) throws IOException {
		int aa,an;
		String nom;
		InputStreamReader lea = new InputStreamReader(System.in);
		BufferedReader lee = new BufferedReader(lea);
		System.out.println("Ingrese su nombre: ");
		nom = lee.readLine();
		System.out.println("Ingrese el año de nacimiento: ");
		an = Integer.parseInt(lee.readLine());
		System.out.println("Ingrese el año actual: ");
		aa = Integer.parseInt(lee.readLine());
		
		des p1 = new des(aa,an,nom);
		p1.desplegar();
	}
}
