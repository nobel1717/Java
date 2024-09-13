import java.util.*;
class de1 {
	int [] num = {10,54,6,15,2,1,68,5,9};
	int i;

	void ordenar(){
		Arrays.sort(num);
	}
	void imprimir() {
		//for (int n : num) {
		//     System.out.println(n);                                                                                       
		//}
		for(i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}
}
public class Lab6_1 {
	public static void main(String[] args) {
		de1 op = new de1();
		op.ordenar();
		op.imprimir();
	}

}
