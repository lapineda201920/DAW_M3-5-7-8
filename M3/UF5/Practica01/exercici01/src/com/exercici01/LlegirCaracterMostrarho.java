package com.exercici01;

import java.io.FileReader;

public class LlegirCaracterMostrarho {

    public static void main(String[] args) {

        try {
            // 1 - OBRIM EL DOCUMENT
            FileReader fr = new FileReader("dades.txt");
            // 2 - LLEGIM EL PRIMER CARÀCTER
            int caracter = fr.read();

            // 3 - FINS QUE NO LLEGEIXI TOTS ELS CARÀCTERS, VES IMPRIMINT UN PER UN
            while(caracter != -1){

                System.out.println((char)caracter);
                caracter = fr.read();
            }

            // 5 - TANQUEM EL DOCUMENT
            fr.close();
        }
        catch(Exception e) {
            System.out.println("Error al llegir el document: " + e);
        }
    }
}
