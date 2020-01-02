package com.exercici05;

public class PilaTabla implements Pila {

    /* ATRIBUTS */
    private int indiceCima = 0;
    private Integer[] tabla = new Integer[10];


    /* CONSTRUCTOR */
    public PilaTabla() {

    }


    /* MÈTODES */
    public void apilar(int numero){

        tabla[indiceCima] = numero;
        indiceCima++;
    }

    public void desapilar(){

        Integer numero = null;
        numero = tabla[indiceCima];
        indiceCima--;
    }

    public String mostrar(){

        String resultat = " ";
        for (int i = 0; i <= indiceCima; i++){

            resultat += tabla[i] + " ";
        }

        return  resultat;
    }
}
