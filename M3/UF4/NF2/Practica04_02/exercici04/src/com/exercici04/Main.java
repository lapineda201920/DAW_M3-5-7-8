package com.exercici04;

import java.util.Scanner;

public class Main {

    // ATRIBUTS
    public static String numero01 = "";
    public static String numero02 = "";


    // MÈTODES
    public static void divisio (float num01, float num02) throws NumberFormatException,ArithmeticException{

        // 3 - ENS DIU EL RESULTAT DE LA DIVISÓ I ENS LA IMPRIMEIX
        float resultat = 0;
        resultat = num01 / num02;
        System.out.println("Numero 1 / Numero 2 = "+resultat);
    }

    public static void main(String[] args) {

        // 1 - DEMANEM LA INFORMACIÓ
        System.out.println("DEMANAR INFORMACIÓ\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("\nNúmero 1: ");
        numero01 = sc.next();
        System.out.println("\nNúmero 2: ");
        numero02 = sc.next();

        try {

            // 2 - CONVERTIM ELS STRINGS A FLOATS I CRIDEM AL MÈTODE DIVISIÓ
            float num01 = Float.parseFloat(numero01);
            float num02 = Float.parseFloat(numero02);
            divisio(num01,num02);
        }
        catch (NumberFormatException ex){

            System.out.println("\n\nS'han introduït caràcters no numèrics!");
        }
        catch (ArithmeticException ex){

            System.out.println("\n\nS'ha dividit entre zero!");
        }
    }
}
