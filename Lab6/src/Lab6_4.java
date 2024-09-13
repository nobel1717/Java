import java.util.*;
class de4{
	String str;
    
	void leer() {
		Scanner le = new Scanner(System.in);
		System.out.println("Ingrese una palabra");
		str = le.nextLine();
	}
	void desplegar() throws Exception{
		char[] chars = str.toCharArray();
        Arrays.sort(chars);
        str = new String(chars);
 
        System.out.println(str);
	}
	
	
}
public class Lab6_4 {
	public static void main(String[] args) throws Exception {
		de4 op = new de4();
		op.leer();
		op.desplegar();
	}
}
