package com.exercici03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // 1 - DEMANEM PER TECLAT LES PARAULES
        String paraula;

        System.out.println("\nIntrodueix una paraula: ");
        paraula = sc.nextLine();


        String frase = "";

        while (!paraula.toLowerCase().equals("fin")){

            frase = frase + " " + paraula;

            System.out.println("\nIntrodueix una paraula: ");
            paraula = sc.nextLine();
        }


        System.out.println("\n"+frase);

    }
}