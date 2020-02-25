package com.exercici01;

import java.io.PrintWriter;

public class CrearFitxerCaractersAleatoris {

    public static void main(String[] args) {

        try {

            // 1 - CREEM VARIABLES I CARÀCTERS ALEATORIS
            int num1 = 97;
            int num2 = 122;
            int cont = 0;
            String cadena = "Un exemple és:\n";

            while (cont < 10){

                int numAleatorio = (int)Math.floor(Math.random()*(num2 -num1)+num1);
                cadena += (char)numAleatorio;
                cont++;
            }


            // 2 - CREEM EL DOCUMENT, PASSEM CADENA I TANQUEM
            PrintWriter document = new PrintWriter("aleatori.txt");
            document.println(cadena);
            document.close();

        }
        catch(Exception e) {
            System.out.println("Error al llegir el document: " + e);
        }
    }
}
