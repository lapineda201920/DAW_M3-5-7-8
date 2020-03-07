package com.exercici01;

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
            DataOutputStream sortida = new DataOutputStream(new FileOutputStream("dades.dat", true));


            // 1 - MOSTRA EL CONTINGUT DEL FITXER
            System.out.println("\nImprimim el fitxer:\n");
            mostrarFichero();


            // 2 - RECOPIL·LEM EL NÚMERO PASSAT PER TECLAT
            System.out.println("Introdueix un número: ");
            int numero = sc.nextInt();


            // 3 - MENTRE EL NÚMERO SIGUI INFERIOR O IGUAL A 0, PREGUNTA I INTRODUEIX NÚMEROS
            while (numero >= 0){

                contador++;
                sortida.writeInt(numero);
                System.out.println("Introdueix un número: ");
                numero = sc.nextInt();
            }

            // 4 - TANQUEM EL DOCUMENT
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