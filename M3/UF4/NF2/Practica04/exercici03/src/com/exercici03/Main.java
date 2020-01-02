package com.exercici03;

public class Main {

    public static void main(String[] args) {

        Gato gato=new Gato();
        hazleHablar(gato);

        Cucu cucu=new Cucu();
        hazleHablar(cucu);
    }

    static void hazleHablar(Parlanchin sujeto){

        sujeto.habla();
    }
}
