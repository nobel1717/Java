package Listas;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public Mapa() {
    }

    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap();
        mapa.put(7, "Cereal");
        mapa.put(1, "Verdura");
        mapa.put(11, "Chicha");
        mapa.put(11, "Soda");
        mapa.put(11, "Agua");
        mapa.forEach((llave, variable) -> {
            System.out.print(variable);
        });
    }
}
