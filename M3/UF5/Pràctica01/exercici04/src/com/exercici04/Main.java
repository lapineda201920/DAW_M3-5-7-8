package com.exercici04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // 1 - DEMANEM PER TECLAT LES PARAULES
        String frase;

        System.out.println("\nIntrodueix una frase: ");
        frase = sc.nextLine();


        char caracter;
        int numeroEspais = 0;

        for (int i = 0; i < frase.length(); i++){

            caracter = frase.charAt(i);

            if (Character.isSpaceChar(caracter)){

                numeroEspais++;
            }
        }

        System.out.println("\nLa frase conté "+numeroEspais+" espais en blanc!");

    }
}