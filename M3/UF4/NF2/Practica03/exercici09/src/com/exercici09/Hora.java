package com.exercici09;

import java.util.Scanner;
import java.util.Arrays;


abstract class Hora{

    /* ATRIBUTS */
    protected int hora = 0;
    protected int minutos = 0;


    /* CONSTRUCTOR */
    Hora (int hora, int minutos){
        this.hora = hora;
        this.minutos = minutos;
    }


    /* MÈTODES */

    abstract void inc();

    abstract void setSegundos(int segundos);

    public abstract void setHora(int i);
}