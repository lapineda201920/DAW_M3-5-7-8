package com.exercici07;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // 0 - CREEM L'OBJECTE (sortida) I LI INDIQUEM A QUIN DOCUMENT L'HA D'ESCRIURE (dades.txt)
            ObjectOutputStream sortida = new ObjectOutputStream(new FileOutputStream("dades.txt"));


            // 1 - RECOPIL·LEM EL SRING PASSAT PER TECLAT
            System.out.println("Introdueix una frase: ");
            String frase = sc.nextLine();


            // 2 - INTRODUEIX L'STRING
            sortida.writeChars(frase);

            // 3 - TANQUEM EL DOCUMENT
            sortida.close();

            /*---------------------------------------------------------------------------------------*/

            System.out.println("\n-------------------------------------------------------------\n");

            /*---------------------------------------------------------------------------------------*/

            // 0 - CREEM L'OBJECTE (entrada), I LI INDIQUEM EL DOCUMENT A LLEGIR (dades.txt)
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("dades.txt"));


            // 1 - LLEGEIX EL DOCUMENT
            while ((linia = entrada.readUTF()) != null){

                System.out.println(linia);
            }


            // 2 - TANQUEM EL DOCUMENT
            entrada.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
