package com.exercici03;


import java.io.*;
import java.util.Scanner;

public class Main {

    public static void mostrarFichero(){
        try {
            String cadena;

            BufferedReader entrada = new BufferedReader(new FileReader("dades.txt"));

            while((cadena = entrada.readLine())!=null) {
                System.out.println(cadena);
            }

            entrada.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long posicio = 0;

        try {
            System.out.println("\nImprimim el fitxer:\n");
            mostrarFichero();

            // 0 - CREEM L'OBJECTE (sortida) I LI INDIQUEM A QUIN DOCUMENT L'HA D'ESCRIURE (dades.txt)
            RandomAccessFile sortida = new RandomAccessFile("dades.txt", "rw");


            // 1 - DEMANEM UNA FRASE
            System.out.println("Introdueix una frase: ");
            String linia = sc.nextLine();


            // 1 - LLEGIM LA PRIMERA LÍNIA QUE TÉ EL FITXER
            String cadena = sortida.readLine();


            // 2 - MENTRE NO LLEGEIXI TOT EL FITXER, BUSQUEM LA PARAULA EN LA LÍNIA LLEGIDA
            while (cadena != null){

                int index = cadena.indexOf(linia);

                // 3 - MENTRE DINS LA LÍNIA CONTINGUI LA PARAULA
                while(index != -1){

                    // 4 - MODIFIQUEM LA PARAULA A MAJÚSCULA
                    StringBuilder auxBuilder = new StringBuilder(cadena);
                    auxBuilder.replace(index, index+linia.length(), linia.toUpperCase());
                    cadena = auxBuilder.toString();

                    // 5- SOBREEESCRIBIM I ANEM AL PRINCIPI DE LA FRASE
                    sortida.seek(posicio);
                    sortida.writeBytes(cadena);

                    // 6- COMPROBEM SI ES REPETEIX LA PARAULA
                    index = cadena.indexOf(linia);
                }
            }


            // 7 - TANQUEM EL DOCUMENT
            sortida.close();


            // 8 - TORNEM A MOSTRAR EL CONTINGUT DEL FITXER
            System.out.println("\nImprimim el fitxer:\n");
            mostrarFichero();

        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}