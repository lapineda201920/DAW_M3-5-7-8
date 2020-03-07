package com.exercici02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n----------\nSolució A\n----------\n");

        // 1 - DEMANEM PER TECLAT LES PARAULES
        System.out.println("\nIntrodueix la contrasenya: ");
        String contrasenya = sc.nextLine();


        char primerCaracter = contrasenya.charAt(0);
        char ultimCaracter = contrasenya.charAt(contrasenya.length() - 1);


        System.out.println("\nPISTES:\n-La contrsenya comença per "+primerCaracter+" i acaba per "+ultimCaracter);


        String possibleContrasenya = "";

        while (!contrasenya.equals(possibleContrasenya)){

            System.out.println("\nIntrodueix la possible contrasenya: ");
            possibleContrasenya = sc.nextLine();
        }


        System.out.println("\nL'has adivinat!");




        System.out.println("\n----------\nSolució B\n----------\n");

        // 1 - DEMANEM PER TECLAT LES PARAULES
        System.out.println("\nIntrodueix la contrasenya: ");
        String contrasenyaB = sc.nextLine();


        String possibleContrasenyaB = "";

        while (!contrasenyaB.equals(possibleContrasenya)){

            System.out.println("\nIntrodueix la possible contrasenya: ");
            possibleContrasenya = sc.nextLine();

            int comparacio = contrasenyaB.compareTo(possibleContrasenyaB);

            if (comparacio < 0){

                System.out.println("\nLa contrasenya és menor");
            }
            if (comparacio > 0){

                System.out.println("\nLa contrasenya és major");
            }
        }


        System.out.println("\nL'has adivinat!");

    }
}