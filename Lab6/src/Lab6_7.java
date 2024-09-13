import java.util.Scanner;
class de7{
	de7(){
		Scanner dat = new Scanner (System.in);
		System.out.print("Introduce una cadena de texto: ");
		String cadena = dat.nextLine();
		System.out.println("\n La cadena tiene " + cuentaPalabras(cadena) + " palabras.");
		}
		public static int cuentaPalabras(String cade){
		String[] palabras = cade.trim(). split(" +");
		return palabras.length;
	}
}
public class Lab6_7 {
	public static void main (String[] args) {
		de7 op = new de7();
		}
}
