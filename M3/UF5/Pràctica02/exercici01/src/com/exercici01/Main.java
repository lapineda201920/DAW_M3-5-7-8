package com.exercici01;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        // 1 - CREEM UN ARRAYLIST DE LA CLASE PARTIDOFUTBOL
        ArrayList<PartidoFutbol> partits = new ArrayList<PartidoFutbol>();


        // 2 - INDIQUEM ON ESTAN LES DADES
        File fitxer = new File("ficheros/partidos.txt");
        Scanner contingut = null;

        try {

            // 3 - LLEGIM EL CONTINGUT DEL FITXER
            System.out.println("\n1 - Llegim el contingut del fitxer!");
            contingut = new Scanner(fitxer);


            // 4 - MENTRE QUE 'contingut' TINGUI DADES (PARTITS DE FUTBOL)
            while (contingut.hasNextLine()){

                // 5 - OBTENIM UNA LÍNIA
                String linia = contingut.nextLine();

                // 6 - SEPARO LA LINIA PELS ::
                String [] separarLinia = linia.split("::");

                // 7 - CREEM UN OBJECTE DE PARTIDOFUTBOL
                PartidoFutbol partit = new PartidoFutbol();

                // 8 - POSSSEM ELS ATRIBUTS OBTINGUTS AL OBJECTE
                partit.setEquipoLocal(separarLinia[0]);
                partit.setEquipoVisitante(separarLinia[1]);
                partit.setGolesLocal(Integer.parseInt(separarLinia[2]));
                partit.setGolesVisitante(Integer.parseInt(separarLinia[3]));

                // 9 - AFEGIM AL ARRAYLIST L'OBJECTE
                partits.add(partit);
            }

        }
        catch (Exception e) {

            e.printStackTrace();
        }
        finally{

            try {

                if (contingut != null){

                    contingut.close();
                }

            }
            catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        System.out.println("\n2 - Guardem "+partits.size()+" partits de futbol!");
        System.out.println("\n3 - Resultats dels partits de futbol!");

        // 10 - AMB 'ITERATOR' RECORRIREM L'ARRAYLIST
        Iterator<PartidoFutbol> itrPartidos = partits.iterator();

        // 11 - MENTRE 'ITERATOR' TROBI CONTINGUT
        while(itrPartidos.hasNext()){

            // 12 - LLEGIM UNA LÍNIA
            PartidoFutbol partido = itrPartidos.next();

            // 13 - IMPRIMIM AQUELLA LÍNIA
            System.out.println(partido.getEquipoLocal() + " "
                    + partido.getGolesLocal() + "-"
                    + partido.getGolesVisitante() + " "
                    + partido.getEquipoVisitante());
        }
    }
}
