import java.util.*;
class des4{
	Double monto,des;
	
	des4(){
		Scanner ea = new Scanner(System.in);
		System.out.println("Ingrese el monto : ");
		monto = ea.nextDouble();
	}
	void calculo() {
		if (monto >= 100) {
			des = monto - (monto * 0.10);
		}else if( monto >= 0 && monto < 100){
			des = monto - (monto * 0.02);
		}else {
			System.out.println(monto + "- ERROR. ingrese bien");
		}
	}
	void desplegar() {
		System.out.println("El monto a pagar con el descuento es de: " + des);
	}
}
public class Lab5_4 {
	public static void main(String[] args) {
		des4 p4 = new des4();
		p4.calculo();
		p4.desplegar();
	}

}
