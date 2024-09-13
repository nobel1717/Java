import java.util.*;
class de9{
	String or;
	int vo,cont;
	de9(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la oración");
		or = entrada.nextLine();
		vo = 0;
		cont = 0;
	}
	void desplegar() {
		while(vo < or.length()) {
			if ((or.charAt(vo)=='a') || (or.charAt(vo)=='e') || (or.charAt(vo)=='i') || (or.charAt(vo)=='o') || (or.charAt(vo)=='u')){
				cont++;
				vo++;
			}else {
				vo++;
			}
		}
		System.out.println("La oración tiene: " + cont + " vocales.");
	}
}
public class Lab5b_9 {
	public static void main(String[] args){
		de9 p9 = new de9();
		p9.desplegar();
	}
}

/* import java.util.*;
class de9{
	String or;
	int cont;
	de9(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la oración");
		or = entrada.nextLine();
		cont = 0;
	}
	void desplegar() {
		for(int vo=0;vo<or.length();vo++) {
			if ((or.charAt(vo)=='a') || (or.charAt(vo)=='e') || (or.charAt(vo)=='i') || (or.charAt(vo)=='o') || (or.charAt(vo)=='u')){
				cont++;
			}
		}
		System.out.println("La oración tiene: " + cont + " vocales.");
	}
}
public class Lab5b_9 {
	public static void main(String[] args){
		de9 p9 = new de9();
		p9.desplegar();
	}
} */
