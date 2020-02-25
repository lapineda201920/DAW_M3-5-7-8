package com.exercici01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ObtenirMesLlargCurt {

    public static void main(String[] args) {

        try {
            // 1 - OBRIM EL DOCUMENT
            FileReader fr = new FileReader("dades02.txt");

            // 2 - LLEGIM LES DADES DEL DOCUMENT
            BufferedReader br = new BufferedReader(fr);

            // 3 - CREEM UN STRING ON COPIAREM A CONTINUACIÓ TOT LO OBTINGUT
            String linea = br.readLine();
            String max = linea;
            String min = linea;

            // 4 - OBTENIM LES LÍNIES UNA PER UNA, FINS QUE NO EN QUEDI NI UNA (NULL)
            while((linea = br.readLine()) != null){


                if ( linea.length() < min.length() ){

                    min = linea;
                }

                if ( linea.length() > max.length() ){

                    max = linea;
                }
            }

            // 5 - TANQUEM EL DOCUMENT
            br.close();
            fr.close();

            // 6 - IMPRIMIM ELS RESULTATS
            System.out.println("\nLa línia més llarga és: ");
            System.out.println("--> "+max);
            System.out.println("\nLa línia més curta és: ");
            System.out.println("--> "+min+"\n");
        }
        catch(Exception e) {
            System.out.println("Error al llegir el document: " + e);
        }
    }
}
