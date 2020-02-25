package com.exercici02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/*
* 2.
* Realizar un programa que solicite al usuario el
* nombre de un fichero de texto y muestre su contenido
* en pantalla. Si no se proporciona ningún nombre de fichero,
* la aplicación utilizará por defecto prueba.txt
* */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // 1 - RECOPIL·LEM EL TEXT PASSAT PER TECLAT
            System.out.println("Introdueix el nom d'un fitxer: ");
            String cadena = sc.nextLine();

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
