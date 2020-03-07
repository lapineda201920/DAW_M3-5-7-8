package com.exercici01;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // 0 - CREEM L'OBJECTE (sortida) I LI INDIQUEM A QUIN DOCUMENT L'HA D'ESCRIURE (dades.txt)
            ObjectOutputStream sortida = new ObjectOutputStream(new FileOutputStream("dades.txt"));

            // 1 - RECOPIL·LEM EL NÚMERO PASSAT PER TECLAT
            System.out.println("Introdueix un número: ");
            double numero = sc.nextDouble();

            // 2 - ESCRIBIM EL NÚMERO AL DOCUMENT
            sortida.writeDouble(numero);

            // 3 - TANQUEM EL DOCUMENT PERQUÈ ES GUARDI LO ANTERIORMENT ESCRIT
            sortida.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
