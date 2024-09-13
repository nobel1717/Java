import java.util.*;

class de3 {
	int matriz[][] = new int[10][10],num2,suma;
	Random num;
	void ingresar(){
		for (int x=0; x < matriz.length; x++) {
			  for (int y=0; y < matriz[x].length; y++) {
				num = new Random();
				num2 = num.nextInt();
			    matriz[x][y] = num2;
			  }
			}
	}
	
	void diag() {
		int[] diagoPrincipal = new int[matriz.length];
		for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(i==j){
                    diagoPrincipal[i] = matriz[i][j];
                }
            }
        }
		for(int i=0;i<diagoPrincipal.length;i++){
            System.out.print("\t" + diagoPrincipal[i]);
        }
	}
	
	void sumdiagonal() {
		suma = 0;
		int x = 0, y = 0;
	    while (x < matriz.length && y < matriz[0].length) {
		    suma += matriz[y][x];
		    x++;
		    y++;
		}
		    
	}
	void sumaesqui() {
		int suma;
		suma = 0;
		  for (int x = 0; x < matriz.length; x++) {
		        System.out.print("|");
		        for (int y = 0; y < matriz[x].length; y++) {
		            System.out.print(matriz[x][y]);
		            suma = suma + matriz[x][y];
		            if (y != matriz[x].length - 1) {
		                System.out.print("\t");
		            }
		        }
		        System.out.println("|");
		    }
		  System.out.println(suma);
	}
	void sumacru() {
        int mitadFilas = matriz.length / 2;
        int mitadColumnas = matriz[0].length / 2;
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i == mitadFilas || j == mitadColumnas) {
                    matriz [i][j] = '*';
                }else {
                    matriz [i][j] = ' ';
                }
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
	}
	void buscar() {
		 
	}
}
public class Lab6_3 {
	public static void main(String[] args) {
		de3 op = new de3();
		op.ingresar();
		op.diag();
		op.sumdiagonal();
		op.sumaesqui();
		op.sumacru();
		op.buscar();
	}
}
