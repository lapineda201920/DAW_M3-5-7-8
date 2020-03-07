package com.exercici02;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // 0 - CREEM L'OBJECTE (sortida) I LI INDIQUEM A QUIN DOCUMENT L'HA D'ESCRIURE (dades.txt)
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("dades.txt"));

            // 1 - LLEGIM EL NÚMERO
            double numero = entrada.readDouble();

            // 2 - IMPRIMIM EL NÚMERO
            System.out.println("El número és: "+numero);

            // 3 - TANQUEM EL DOCUMENT PERQUÈ ES GUARDI LO ANTERIORMENT ESCRIT
            entrada.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}