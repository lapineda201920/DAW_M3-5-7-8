package com.exercici13;

public class Campana extends Instrumento {

    /* ATRIBUTS */



    /* CONSTRUCTOR */
    public Campana(){

        super();
    }


    /* MÈTODES */
    @Override
    public void interpretar(){

        for (int i=0; i<numNotas; i++){

            switch (notas[i]){

                case DO:
                    System.out.println("Doloonn");
                break;

                case RE:
                    System.out.println("Reenn");
                break;

                case MI:
                    System.out.println("Miiiinn");
                break;

                case FA:
                    System.out.println("Faaann");
                break;

                case SOL:
                    System.out.println("Soolnn");
                break;

                case LA:
                    System.out.println("Laaann");
                break;

                case SI:
                    System.out.println("Siiinn");
                break;
            }
        }

        System.out.println(" ");
    }
}
