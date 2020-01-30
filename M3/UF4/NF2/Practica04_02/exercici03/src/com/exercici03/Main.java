package com.exercici03;

import java.util.Scanner;

public class Main {

    public static String numero01 = "";
    public static String numero02 = "";

    public static void main(String[] args) {
        float float_divisio = 0;
        System.out.println("DEMANAR INFORMACIÓ\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("\nNúmero 1: ");
        numero01 = sc.next();
        System.out.println("\nNúmero 2: ");
        numero02 = sc.next();

        try {

            float num01 = Float.parseFloat(numero01);
            float num02 = Float.parseFloat(numero02);
            float_divisio = num01 / num02;
        }
        catch (NumberFormatException ex){

            System.out.println("Error: "+ex.getMessage());
            System.out.println("\n\nS'han introduït caràcters no numèrics!");
        }
        catch (ArithmeticException ex){

            System.out.println("Error: "+ex.getMessage());
            System.out.println("\n\nS'ha dividit entre zero!");
        }
        finally {

            System.out.println("\n\nDivisió: "+float_divisio);
        }
    }
}
