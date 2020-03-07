package com.exercici06;

import java.util.Scanner;

public class Main {

    public static String alReves(String frase) {

        String resultat = "";

        for (int i = frase.length()-1; i >= 0; i--){

            resultat = resultat + frase.charAt(i);
        }


        return resultat;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // 1 - DEMANEM PER TECLAT LES PARAULES
        System.out.println("\nIntrodueix una frase: ");
        String frase = sc.nextLine();


        String fraseSotmesa = alReves(frase);


        System.out.println("\nLa frase al revés és: "+fraseSotmesa);
    }
}