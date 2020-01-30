package com.exercici04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // ATRIBUTS
        int numeroAdivinar = (int) (Math.random() * 500);
        int numero = 0;
        int intentos = 0;


        // MÈTODES
        do {
            boolean leido;
            do {
                System.out.println("Introduzca un numero (1-500)");
                try {
                    intentos++;
                    numero = teclado.nextInt();
                    System.out.println("El numero introducido es: " + numero);
                    leido = true;
                } catch (InputMismatchException ex) {
                    System.out.println("No ha introducido un numero entero");
                    teclado.next(); // se lee el elemento no reconocido para
                    // eliminarlo
                    leido = false;
                }
            } while (leido == false);

            if (numero > numeroAdivinar) {
                System.out.println("El numero es menor. Sigue intentando");

            }
            if (numero < numeroAdivinar) {
                System.out.println("El numero es mayor. Sigue intentandolo");
            }

        } while (numero != numeroAdivinar);

        System.out.println("Enhorabuena. Has acertado, ya que el numero es: " + numeroAdivinar);
        System.out.println("Lo has conseguido tras todos estos intentos: " + intentos);

    }

}