package com.exercici04;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        //la clase Persona implementa el método compareTo() basado en el DNI.
        TreeSet<Persona> c1 = new TreeSet<>();

        c1.add(new Cliente("111", "Marta");
        c1.add(new Cliente("115", "Sara");
        c1.add(new Cliente("112", "Isabel");

        System.out.println(c1);


        Boolean insertado = c1.add(new Cliente("115","Sara"));

        System.out.println(insertado);
        System.out.println(c1);


        //la clase Persona implementa el método compare() basado en el nombre.
        TreeSet<Persona> c2=new TreeSet<>(new ComparaNombres);

        c2.add(new Cliente("111", "Marta");
        c2.add(new Cliente("115", "Sara");
        c2.add(new Cliente("112", "Isabel");

        System.out.println(c2);
    }
}
