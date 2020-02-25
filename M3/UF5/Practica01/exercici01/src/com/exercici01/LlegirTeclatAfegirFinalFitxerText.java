package com.exercici01;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class LlegirTeclatAfegirFinalFitxerText {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (FileWriter fw = new FileWriter("dades.txt", true);
            PrintWriter salida = new PrintWriter(fw)) {

            // 1 - RECOPIL·LEM EL TEXT PASSAT PER TECLAT
            System.out.println("Introdueix text: ");
            String cadena = sc.nextLine();

            // 2 - OBRIM EL DOCUMENT
            FileWriter document = new FileWriter("dades.txt", true);

            // 3 - ESCRIBIM LA CADENA ANTERIORMENT OBTINGUDA AL FINAL DEL DOCUMENT
            document.write(cadena);

            // 4 - TANQUEM EL DOCUMENT
            document.close();
        }
        catch(Exception e) {
            System.out.println("Error al llegir el document: " + e);
        }

    }
}
