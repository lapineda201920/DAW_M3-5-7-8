package com.exercici02;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void mostrarFichero(){
        try {

            DataInputStream entrada=new DataInputStream(new FileInputStream("dades.dat"));

            while(entrada.available()>0){
                System.out.println(entrada.readInt());
            }
            entrada.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador = 0;

        try {

            // 0 - CREEM L'OBJECTE (sortida) I LI INDIQUEM A QUIN DOCUMENT L'HA D'ESCRIURE (dades.txt)
            RandomAccessFile sortida = new RandomAccessFile("dades.dat", "rw");


            // 1 - CALCULEM ELS ENTERS QUE TÉ EL FITXER
            long mida = sortida.length();
            mida = mida / 4;
            System.out.println("\nEl fitxer té " + mida + " enters.\n");


            // 2 - AGAFEM LA POSICIÓ
            int posicio = 0;
            while (posicio < 1 || posicio > mida) {
                System.out.println("Introdueix una posició (>=1 i <= " + mida + "): ");
                posicio = sc.nextInt();
            }
            posicio--;


            // 3 - ENS SITUEM EN LA POSICIO A MODIFICAR
            sortida.seek(posicio*4);


            // 4 - DEMANEM UN NÚMERO
            int numero = 0;
            System.out.println("Introdueix un numero: ");
            numero = sc.nextInt();


            // 5 - ESCRIBIM EN EL DOCUMENT
            sortida.seek(posicio*4);
            sortida.writeInt(numero);


            // 6 - TANQUEM EL DOCUMENT
            sortida.close();


            // 5 - TORNEM A MOSTRAR EL CONTINGUT DEL FITXER
            System.out.println("\nImprimim el fitxer:\n");
            mostrarFichero();

        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
