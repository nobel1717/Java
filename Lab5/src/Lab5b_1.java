class de1{
	int i, re;
	
	void calcular(){
		i = 1;
		while(i<=25) {
			re = (int) Math.pow(i,2);
			System.out.println(i + " elevado al cuadrado es = " + re);
			re = (int) Math.pow(i,3);
			System.out.println(i + " elevado al cubo es = " + re);
			System.out.println(" ");
			i++;
		}
	}
}
public class Lab5b_1 {
	public static void main(String[] args){
		de1 p1 = new de1();
		p1.calcular();
	}
}
