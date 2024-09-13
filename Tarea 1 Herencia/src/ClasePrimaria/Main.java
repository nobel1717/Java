package ClasePrimaria;

import Entity.Caballo;
import Entity.Perro;

public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("Thor","Croquetas",3,"Chihuahua",3);
        Caballo caballo = new Caballo("Zeus","Monte",10,"Mustang",450);

        //-->Nos muestra los detalles del objeto
        perro.mostrar();
        perro.comer();
        perro.comer("Ascan");
        System.out.println("--------------------------------------------------");
        caballo.mostrar();
        caballo.comer("Grama fina");
        System.out.println("--------------------------------------------------");


    }
}