package com.exercici06;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Generando número aleatorio");
            int entero = (int) (Math.random() * 1000);
            if (entero % 2 == 0) {
                throw new Exception("Se genero un numero par");
            } else {
                throw new Exception("Es impar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
