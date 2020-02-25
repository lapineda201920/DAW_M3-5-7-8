package com.exercici01;

import java.io.BufferedReader;
import java.io.FileReader;

public class LlegirNumerosMostrarho {

    public static void main(String[] args) {

        try {
            // 1 - OBRIM EL DOCUMENT
            FileReader fr = new FileReader("numeros.txt");

            // 2 - LLEGIM LES DADES DEL DOCUMENT
            BufferedReader br = new BufferedReader(fr);

            // 3 - CREEM UN STRING ON COPIAREM A CONTINUACIÓ TOT LO OBTINGUT
            String linea;

            // 4 - OBTENIM LES LÍNIES UNA PER UNA, FINS QUE NO EN QUEDI NI UNA (NULL)
            while((linea = br.readLine()) != null){

                System.out.println(linea);
            }

            // 5 - TANQUEM EL DOCUMENT
            fr.close();
        }
        catch(Exception e) {
            System.out.println("Error al llegir el document: " + e);
        }
    }
}
