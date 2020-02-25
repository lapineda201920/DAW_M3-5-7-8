package com.exercici03;

import java.io.BufferedReader;
import java.io.FileReader;

/*
* 3.
* Rrealizar   un programa que solicite al usuario su nombre y edad.
* Estos datos debenguardarse en el fichero datos.txt. Si este fichero existe,
* debe borrarse su contenido, y en caso de noexistir, debe crearse.
* */

public class Main {

    public static void main(String[] args) {

        try {

            // 1 - RECOPIL·LEM EL TEXT PASSAT PER TECLAT
            System.out.println("Introdueix el teu nom: ");
            String nom = sc.nextLine();
            System.out.println("Introdueix la teva edat: ");
            String nom = sc.nextLine();

            // 2 - SI ESTÀ BUIT, PER DEFECTE POSSA 'PROVA'
            if (cadena.isEmpty()){

                cadena = "prova";
            }

            // 3 - OBRIM EL DOCUMENT I LLEGIM LES DADES DEL DOCUMENT
            FileReader fr = new FileReader(cadena+".txt");
            BufferedReader br = new BufferedReader(fr);

            // 4 - CREEM UN STRING ON COPIAREM A CONTINUACIÓ TOT LO OBTINGUT
            String linea;

            // 5 - OBTENIM LES LÍNIES UNA PER UNA, FINS QUE NO EN QUEDI NI UNA (NULL)
            while((linea = br.readLine()) != null){

                System.out.println(linea);
            }
            // 6 - TANQUEM EL DOCUMENT
            br.close();
            fr.close();
        }
        catch(Exception e) {
            System.out.println("Error al llegir el document: " + e);
        }
    }
}
