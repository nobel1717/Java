
package Listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista {
    List<Object> listaNormal = new ArrayList();

    public Lista() {
    }

    public void llenarLista(String uno, String dos, String tres, String cuatro, String cinco, String seis, String siete, String ocho, String nueve, String diez) {
        this.listaNormal.add(uno);
        this.listaNormal.add(dos);
        this.listaNormal.add(tres);
        this.listaNormal.add(cuatro);
        this.listaNormal.add(cinco);
        this.listaNormal.add(seis);
        this.listaNormal.add(siete);
        this.listaNormal.add(ocho);
        this.listaNormal.add(nueve);
        this.listaNormal.add(diez);
    }

    public void imprimir() {
        System.out.println("RECORRER LISTA ON FOREACH");
        Iterator iterador = this.listaNormal.iterator();

        while(iterador.hasNext()) {
            Object e = iterador.next();
            System.out.println(e);
        }

        System.out.println("RECORRER LISTA ON FOREACH");
        iterador = this.listaNormal.iterator();

        while(iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        this.listaNormal.forEach((var) -> {
            System.out.println(var);
        });
    }
}