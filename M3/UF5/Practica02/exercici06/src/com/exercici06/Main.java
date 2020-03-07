package com.exercici06;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador = 0;

        try {

            // 0 - CREEM L'OBJECTE (sortida), I LI INDIQUEM EL DOCUMENT A LLEGIR (dades.txt)
            DataInputStream entrada = new DataInputStream(new FileInputStream("dades.dat"));


            // 1 - LLEGEIX EL DOCUMENT
            while (entrada.available() > 0){

                System.out.println(entrada.readInt());
            }


            // 2 - TANQUEM EL DOCUMENT
            entrada.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
