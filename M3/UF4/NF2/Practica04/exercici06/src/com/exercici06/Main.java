package com.exercici06;

public class Main {

    public static int cuentaPrestados(Object[] lista) {

        int contador = 0;
        for (Object obj : lista) {

            if (obj instanceof Prestable && ((Prestable) obj).prestado()) {

                contador++;
            }
        }
        return contador;
    }

    public static int publicacionesAnterioresA(Publicacion[] lista, int anio) {

        int contador = 0;
        for (Publicacion p : lista) {

            if (p.getAnio() < anio) {

                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {

        Publicacion[] biblioteca = {

                new Libro("CCCC5", "La fundación", 1956),
                new Revista("CC1", "El jueves", 2009, 1582),
                new Libro("CC3", "El neuromante", 1978),
                new Revista("DR1", "Quo", 2007, 85)
        };

        Libro l = (Libro) biblioteca[0];
        l.prestar();

        for (Publicacion p : biblioteca) {

            System.out.println(p);
        }

        System.out.println(publicacionesAnterioresA(biblioteca, 1990));
        System.out.println(cuentaPrestados(biblioteca));
    }
}
