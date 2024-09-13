import java.util.*;

class arreglo{
    
    public int num,vcount,ccount;
    public char str;
    
    void ingresar(){
        char [] s = new char[10];
        Scanner to = new Scanner(System.in);
		System.out.println("Ingresa 10 caracteres");
		for(int i = 0; i < s.length; i++){ 
		    System.out.println("Digite el caracter "+(i+1));
		    s[i]= to.next().charAt(0);
		    
		}
		System.out.println("Los caracteres del arreglo son ");
		for(int i = 0; i < s.length; i++){
		   System.out.print(s[i]+" ");
		   
		} 
		System.out.println(" ");
		System.out.println("Arreglo de forma inversa: ");
		for(int i=s.length-1;i>=0;i--){
		   System.out.print(s[i]+" ");
		   
	    } 
		System.out.println(" ");
		System.out.println("los caracteres en mayuscula: ");
		for(int i = 0; i < s.length; i++){
		        char char1UpperCase = Character.toUpperCase(s[i]);
		        System.out.print(char1UpperCase+ " ");
		        
		}
	        System.out.println(" ");
		System.out.println("los caracteres en minuscula: ");
		for(int i = 0; i < s.length; i++){
		    char char2LowerCase = Character.toLowerCase(s[i]);
		     System.out.print(char2LowerCase+" ");
	    }
	  
	   for(int i = 0; i < s.length; i++) 
	   
	   if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
		   vcount++; } else if((s[i] >= 'a'&& s[i] <= 'z')){
	                ccount++;
	        }
	   System.out.println(" ");
	   System.out.println("El numero de vocales es : " + vcount);
	   System.out.println(" ");
	   System.out.println("El numero de consonante es : " + ccount);
    }
}

public class Lab6_6 {
	public static void main(String[] args) {
	       arreglo obj = new arreglo ();
	       obj.ingresar();
	}
}
    
