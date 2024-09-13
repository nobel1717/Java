package ClaseMain;

import Entity.Estudiantes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Estudiantes> Listaestudiante = new ArrayList<>();

        Listaestudiante.add(new Estudiantes("Karol G", "8-865-1792", 25, 155));
        Listaestudiante.add(new Estudiantes("Raul Vasquez", "8-1006-1162", 20, 184));
        Listaestudiante.add(new Estudiantes("Ana Delgado", "8-654-489", 19, 195));
        Listaestudiante.add(new Estudiantes ("Sofia Batista","13-954-1001",24,164));
        Listaestudiante.add(new Estudiantes("David Gonzales", "5-564-2012", 23, 158));
        Listaestudiante.add(new Estudiantes("Michelle De Leon", "4-1002-325", 18, 175));
        Listaestudiante.add(new Estudiantes("Madrid Vargas", "8-584-1304", 22, 179));

        System.out.println("===> Información del estudiante utilizando Iterator <===");
        Iterator<Estudiantes> estuIterator2 = Listaestudiante.iterator();
        int j = 1;
        while (estuIterator2.hasNext()) {
            System.out.println("Estudiante número " + j + ": \n" + estuIterator2.next().infoEstudiante() + "\n");
            j++;
        }

        Listaestudiante.sort((e1, e2) -> e1.getNombre().compareTo(e2.getNombre()));
        System.out.println("===> Información del estudiante utilizando Lambda <===");
        System.out.println("Nombre de los Estudiantes Ordenado Alfabéticamente:");
        Listaestudiante.forEach(nombreEstudiantesOrdenado -> System.out.println(nombreEstudiantesOrdenado.getNombre()));

        Listaestudiante.sort((e1, e2) -> e1.getEdad() - e2.getEdad());
        System.out.println("\n===> Información del estudiante utilizando foreach <===");
        System.out.println("Edad de los estudiantes de manera ordenada:");
        for (Estudiantes estudiantesEdad : Listaestudiante) {
            System.out.println(estudiantesEdad.getEdad());
        }

    }
}