package com.exercici05;

import java.util.ArrayList;
import java.util.List;

public class PilaLista implements Pila {

    /* ATRIBUTS */
    private int indiceCima;
    private List<Integer> lista = new ArrayList<Integer>();


    /* CONSTRUCTOR */
    public PilaLista() {

    }


    /* MÈTODES */
    public void apilar(int numero){

        lista.add(numero);
        indiceCima++;
    }

    public void desapilar(){

        lista.remove(indiceCima);
        indiceCima--;
    }

    public String mostrar(){

        return  "resultat";
    }
}
