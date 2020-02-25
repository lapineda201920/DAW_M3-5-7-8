package com.exercici01;

import java.io.PrintWriter;
import java.util.Scanner;

public class LlegirTeclatEscriureAFitxerText {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            // 1 - RECOPIL·LEM EL TEXT PASSAT PER TECLAT
            System.out.println("Introdueix text: ");
            String cadena = sc.nextLine();

            // 2 - CREEM EL DOCUMENT
            PrintWriter document = new PrintWriter("dades.txt");

            // 3 - ESCRIBIM LA CADENA ANTERIORMENT OBTINGUDA AL DOCUMENT
            document.println(cadena);

            // 4 - TANQUEM EL DOCUMENT
            document.close();
        }
        catch(Exception e) {
            System.out.println("Error al llegir el document: " + e);
        }

    }
}
