package com.exercici01;

public class Main {

    public static int numerador = 10;
    public static Integer denominador = 0;
    public static float division;

    public static void main(String[] args) {

        System.out.println("Abans de fer la divisió");
        try {

            division = numerador / denominador;
        }
        catch (ArithmeticException ex){

            division = 0;
            System.out.println("Error: "+ex.getMessage());
        }
        finally {
            System.out.println("Divisió: "+division);
            System.out.println("Després de fer la divisió");
        }
    }
}
