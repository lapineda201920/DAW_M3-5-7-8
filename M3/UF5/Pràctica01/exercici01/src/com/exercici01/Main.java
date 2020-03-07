package com.exercici01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // 1 - DEMANEM PER TECLAT LES PARAULES
        System.out.println("\nIntrodueix la paraula nº1: ");
        String paraula1 = sc.nextLine();

        System.out.println("\nIntrodueix la paraula nº2: ");
        String paraula2 = sc.nextLine();


        // 2 - CALCULEM LA SEVA LONGITUT
        int longitutParaula1 = paraula1.length();
        int longitutParaula2 = paraula2.length();

        if (longitutParaula1 == longitutParaula2){

            System.out.println("\nSón idèntiques de longitut!");
        }
        else if (longitutParaula1 < longitutParaula2){

            System.out.println("\nLa paraula '"+paraula1+"' és més curta que la paraula '"+paraula2+"'!");
        }
        else {

            System.out.println("\nLa paraula '"+paraula2+"' és més curta que la paraula '"+paraula1+"'!");
        }
    }
}