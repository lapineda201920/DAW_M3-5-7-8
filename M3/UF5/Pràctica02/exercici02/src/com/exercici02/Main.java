package com.exercici02;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1 - CREEM UN ARRALIST DE ARRAYLIST
        ArrayList<ArrayList<Integer>> arrayListNumeros = new ArrayList<ArrayList<Integer>>();

        // 2 - INDIQUEM ON ESTAN LES DADES
        File fichero = new File("ficheros/numeros.txt");
        Scanner contingut = null;

        try {

            // 3 - LLEGIM EL CONTINGUT DEL FITXER
            System.out.println("\n1 - Llegim el contingut del fitxer!");
            contingut = new Scanner(fichero);

            // 4 - MENTRE QUE 'contingut' TINGUI DADES
            while (contingut.hasNextLine()){

                // 5 - OBTENIM UNA LÍNIA
                String linia = contingut.nextLine();

                // 6 - SEPARO LA LINIA PELS ' '
                String [] separarLinia = linia.split(" ");

                // 7 - CREEM UN ARRAYLIST
                ArrayList<Integer> numeros = new ArrayList<Integer>();

                // 8 - INTRODUEIXO ELS NUMEROS AL ARRAYLIST
                for (int i = 0; i < separarLinia.length; i++){

                    numeros.add(Integer.parseInt(separarLinia[i]));
                }

                // 9 - AFEGIM AL ARRAYLIST DE ARRAYLIST EL ARRAYLIST
                arrayListNumeros.add(numeros);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                if (contingut != null)
                    contingut.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }



        System.out.println("\n2 -Imprimim el contingut del ArrayList de ArrayList!");

        // 10 - AMB 'ITERATOR' RECORRIREM L'ARRAYLIST
        Iterator<ArrayList<Integer>> itrArrayListNumeros = arrayListNumeros.iterator();

        // 11 - MENTRE 'ITERATOR' TROBI CONTINGUT
        while(itrArrayListNumeros.hasNext()){

            // 12 - LLEGIM UNA LÍNIA
            ArrayList<Integer> numeros = itrArrayListNumeros.next();

            // 13 - LLEGIM NÚMERO PER NÚMERO DE LA LÍNIA
            Iterator<Integer> itrNumeros = numeros.iterator();

            // 14 - MENTRE HI HAGI CONTINGUT (NUMEROS)
            while(itrNumeros.hasNext()){

                // 15 - IMPRIMIM UN NÚMERO
                int numero = itrNumeros.next();
                System.out.print(numero+" ");
            }

            System.out.println(); // FA UN SALT DE LÍNIA PER CADA LÍNIA DEL ARRAYLIST
        }



        System.out.println("\n3 -Eliminem els 0 del ArrayList de ArrayList!");

        // 16 - TORNEM A RECORRER L'ARRAYLIST
        itrArrayListNumeros = arrayListNumeros.iterator();

        // 17 - MENTRE 'ITERATOR' TROBI CONTINGUT
        while(itrArrayListNumeros.hasNext()){

            // 18 - LLEGIM UNA LÍNIA
            ArrayList<Integer> numeros = itrArrayListNumeros.next();

            // 19 - LLEGIM NÚMERO PER NÚMERO DE LA LÍNIA
            Iterator<Integer> itrNumeros = numeros.iterator();

            // 20 - MENTRE HI HAGI CONTINGUT (NUMEROS)
            while(itrNumeros.hasNext()){

                // 21 - SI EL NUMERO ÉS 0, ELIMINA'L DEL ARRAYLIST
                int numero = itrNumeros.next();
                if (numero == 0){

                    itrNumeros.remove();
                }
            }
        }



        System.out.println("\n4 -Eliminem les caselles buides del ArrayList de ArrayList!");

        // 22 - TORNEM A RECORRER L'ARRAYLIST
        itrArrayListNumeros = arrayListNumeros.iterator();

        // 23 -  MENTRE 'ITERATOR' TROBI CONTINGUT
        while(itrArrayListNumeros.hasNext()){

            // 24 - LLEGIM UNA LÍNIA
            ArrayList<Integer> numeros = itrArrayListNumeros.next();

            // 25 - SI L'ARRAYLIST ESTÀ BUIT, L'ELIMINEM DLE ARRAY
            if (numeros.isEmpty()){

                itrArrayListNumeros.remove();
            }
        }



        System.out.println("\n5 -Imprimim el ArrayList de ArrayList!");

        String salida = "";

        // 26 - TORNEM A RECORRER L'ARRAYLIST
        itrArrayListNumeros = arrayListNumeros.iterator();

        // 27 - MENTRE HI HAGI CONTINGUT (NUMEROS)
        while(itrArrayListNumeros.hasNext()){

            // 28 - LLEGIM UNA LÍNIA
            ArrayList<Integer> numeros = itrArrayListNumeros.next();

            // 29 - LLEGIM NÚMERO PER NÚMERO DE LA LÍNIA
            Iterator<Integer> itrNumeros = numeros.iterator();

            // 30 - MENTRE HI HAGI CONTINGUT (NUMEROS)
            while(itrNumeros.hasNext()){

                // 31 - IMPRIMIM UN NÚMERO
                int numero = itrNumeros.next();
                System.out.print(numero+" ");
            }

            System.out.println(); // FA UN SALT DE LÍNIA PER CADA LÍNIA DEL ARRAYLIST
        }


    }
}
