import java.util.*;
class de2 {
	int i,n;
	String pa;
	StringBuilder nt = new StringBuilder();
	void leer(){
		Scanner le = new Scanner(System.in);
		System.out.println("Ingrese una palabra");
		pa = le.nextLine();
		System.out.println("Cuántas letras desea desplazar la palabra (entr el 1 y 5)");
		n = le.nextInt();
		
	}
	void codificar() {
		
		if(n > 0 && n < 6 ) {
			for(i=0;i<pa.length();i++) {
				if (pa.charAt(i) >= 'a' && pa.charAt(i) <= 'z') {
	                if ((pa.charAt(i) + n) > 'z') {
	                    nt.append((char) (pa.charAt(i) + n - 26));
	                } else {
	                    nt.append((char) (pa.charAt(i) + n));
	                }
	            } else if (pa.charAt(i) >= 'A' && pa.charAt(i) <= 'Z') {
	                if ((pa.charAt(i) + n) > 'Z') {
	                    nt.append((char) (pa.charAt(i) + n - 26));
	                } else {
	                    nt.append((char) (pa.charAt(i) + n));
	                }
	            }
			}
;		}else {
			System.out.println("Este número no esta dentro del rango 1 y 5");
		}
		
	}
	void imprimir() {
		 System.out.println("Texto codificado: " + nt);
	}
}
public class Lab6_2 {
	public static void main(String[] args) {
		de2 op = new de2();
		op.leer();
		op.codificar();
		op.imprimir();
	}
}
