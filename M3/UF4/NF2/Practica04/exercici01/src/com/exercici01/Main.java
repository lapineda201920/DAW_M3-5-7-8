package com.exercici01;

public class Main {

    public static void main(String[] args) {

        Gato gato=new Gato();
        hazleHablar(gato);
    }

    static void hazleHablar(Animal sujeto){

        sujeto.habla();
    }
}
