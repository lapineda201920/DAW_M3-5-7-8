package com.exercici05;

public class Main {

    public static void main(String[] args) {

        PilaTabla pilaTabla = new PilaTabla();
        apilar(pilaTabla);

        PilaLista pilaLista = new PilaLista();
        apilar(pilaLista);

        System.out.println ("EXEMPLE PILA\n");
        System.out.println ("---------------\n\n");
    }

    static void apilar(Pila sujeto){

        sujeto.apilar(5);
        sujeto.apilar(2);
        sujeto.apilar(7);
        sujeto.apilar(11);

        sujeto.mostrar();

        sujeto.desapilar();

        sujeto.mostrar();
    }
}
