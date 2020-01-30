package com.exercici02;

public class Main {

    public static int numerador = 10;
    public static Integer denominador = null;
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
        catch (NullPointerException ex){

            division = 1;
            System.out.println("Error: "+ex.getMessage());
        }
        finally {
            System.out.println("Divisió: "+division);
            System.out.println("Després de fer la divisió");
        }
    }
}
