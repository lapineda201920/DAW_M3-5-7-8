package com.exercici05;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // 0 - CREEM L'OBJECTE (entrada), I LI INDIQUEM EL DOCUMENT A LLEGIR (dades.txt)
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("dades.dat"));


            // 1 - LLEGIM UN NÚMERO
            double[] taula = new double[5];
            taula = (double[]) entrada.readObject();


            // 2 - L'IMPRIMIM
            for (int y = 0; y < taula.length; y++){

                System.out.println(taula[y]);
            }


            // 3 - TANQUEM EL DOCUMENT
            entrada.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}