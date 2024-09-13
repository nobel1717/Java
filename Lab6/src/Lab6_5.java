import java.util.*;
class Operaciones{
 public int suma,prom,p,positivos,negativos,pares,impares,n,suma1,x,cont;
 public double prom1;
 int [] s = new int[10];
 
 void ingresar(){
 Scanner to = new Scanner(System.in);
System.out.println("Ingresa 10 numeros");
for(int i = 0; i < s.length; i++){ 
 System.out.println("Digite el numero "+(i+1));
 s[i]= to.nextInt();
 suma = suma +s[i];
 prom = suma/10;
 }
System.out.println("Los Numeros del arreglo son: ");
for(int i = 0; i < s.length; i++){ 
System.out.println(s[i]); 
}
 } 
 
void Opp(){
System.out.println("la suma es "+suma);
System.out.println("");
System.out.println("El promedio es "+prom);
 } 
void rop(){
 
for(int i = 0; i < s.length; i++){ 
if(s[i]>0){
positivos = positivos+1;
}else{
negativos = negativos+1;
}
if(s[i]%2==0){
pares = pares+1;
}else{
impares= impares+1;
}
}
}
void sumar(){
 for(int i = 0; i < s.length; i++){ 
if(s[i]>=50 & s[i]<=100){
 suma1 += s[i];
}
if(s[i]>=100 & s[i]<=200){
 cont = cont +1;
 x +=s[i];
 
}}
prom1= (x/cont);
}
void desplegar(){
System.out.println("Numeros positivos: " + positivos);
System.out.println("Numeros negativos: " + negativos);
System.out.println("Numeros Pares : " + pares);
System.out.println("Numero Impares: " +impares);
 System.out.println(" La suma de los numeros entre 50 y 100 son: " +suma1);
 System.out.println("El promedio de los numeros entre 100 y 200 es : " 
+prom1);
}}
class pract {
 public static void main(String[] args) {
 Operaciones obj = new Operaciones();
obj.ingresar(); 
obj.Opp();
obj.rop();
obj.desplegar();
}}
