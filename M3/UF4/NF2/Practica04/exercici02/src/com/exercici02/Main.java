package com.exercici02;

public class Main {

    public static void main(String[] args) {

        Gato gato=new Gato();
        hazleHablar(gato);

        Pajaro pajaro=new Pajaro();
        hazleHablar(pajaro);
    }

    static void hazleHablar(Animal sujeto){

        sujeto.habla();
    }
}
