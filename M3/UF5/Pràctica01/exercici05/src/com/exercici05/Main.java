package com.exercici05;

import java.util.Scanner;

public class Main {

    public static boolean esVocal(char caracter) {

        String vocals = "àáèéìíòóùú";


        caracter = Character.toLowerCase(caracter);


        boolean resultat = false;

        if (vocals.indexOf(caracter) != -1){

            resultat = true;
        }


        return resultat;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // 1 - DEMANEM PER TECLAT LES PARAULES
        System.out.println("\nIntrodueix el teu nom complet: ");
        String nomComplet = sc.nextLine();


        char caracter;
        String senseVocals = "";

        for (int i = 0; i < nomComplet.length(); i++){

            caracter = nomComplet.charAt(i);

            if (!esVocal(caracter)){

                senseVocals = senseVocals + caracter;
            }
        }


        System.out.println("\nEl teu nom sense voals és: "+senseVocals);
    }
}