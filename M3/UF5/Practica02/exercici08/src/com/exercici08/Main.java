package com.exercici08;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador = 0;

        try {

            // 0 - CREEM L'OBJECTE (sortida) I LI INDIQUEM A QUIN DOCUMENT L'HA D'ESCRIURE (dades.txt)
            ObjectOutputStream sortida = new ObjectOutputStream(new FileOutputStream("dades.txt"));


            // 1 - RECOPIL·LEM EL NÚMERO PASSAT PER TECLAT
            System.out.println("Introdueix un número: ");
            int numero = sc.nextInt();

            // 2 - MENTRE EL NÚMERO SIGUI INFERIOR O IGUAL A 0, PREGUNTA I INTRODUEIX NÚMEROS
            while (numero >= 0){

                contador++;
                sortida.writeInt(numero);
                System.out.println("Introdueix un número: ");
                numero = sc.nextInt();
            }

            // 3 - TANQUEM EL DOCUMENT
            sortida.close();

            /*---------------------------------------------------------------------------------------*/

            System.out.println("\n-------------------------------------------------------------\n");

            /*---------------------------------------------------------------------------------------*/

            // 0 - CREEM L'OBJECTE (sortida), I LI INDIQUEM EL DOCUMENT A LLEGIR (dades.txt)
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("dades.txt"));

            for (int i = 0; i < contador; i++){

                // 1 - LLEGIM UN NÚMERO
                int numeroLlegit = entrada.readInt();

                // 2 - L'IMPRIMIM
                System.out.println(numeroLlegit);
            }

            // 3 - TANQUEM EL DOCUMENT
            entrada.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
