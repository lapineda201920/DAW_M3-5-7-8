package com.exercici06;

public class Revista extends Publicacion {

    /* ATRIBUTS */
    private int numero;


    /* CONSTRUCTOR */
    public Revista(String codigo, String titulo, int anio, int numero) {

        super(codigo, titulo, anio);
        this.numero = numero;
    }


    /* MÈTODES */
    @Override
    public String toString() {

        return super.toString() + "Numero: " + numero;
    }
}
