package com.exercici04;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // 0 - RECOPIL·LEM UN NÚMERO PASSAT PER TECLAT
            System.out.println("Introdueix un número: ");
            int numero = sc.nextInt();


            // 1 - CREEM L'ARRAY DE NÚMEROS DOBLES
            double array_double[] = new double[numero];


            // 2 - RECOPIL·LEM ELS NÚMEROS PASSATS PER TECLAT
            for (int i = 0; i <= numero -1; i++){

                System.out.println("Introdueix un número: ");
                array_double[i] = sc.nextDouble();
            }


            // 3 - CREEM L'OBJECTE (sortida) I LI INDIQUEM A QUIN DOCUMENT L'HA D'ESCRIURE (dades.txt)
            ObjectOutputStream sortida = new ObjectOutputStream(new FileOutputStream("dades.dat"));


            // 4 -GUARDEM L'ARRAY EN EL DOCUMENT
            sortida.writeObject(array_double);


            // 5 - TANQUEM EL DOCUMENT
            sortida.flush();
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
