package com.exercici07;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        String Persona[][] = {
            {"Mario","11111111F","187","22"},
            {"Pepe","11111111B","173","52"},
            {"Manuel","11111111C","158","27"},
            {"David","11111111D","164","25"},
            {"Alberto","11111111E","184","80"}
        };


        System.out.print("\nPersones ordenades per DNI");

        Arrays.sort(Persona);

        for (int i = 0; i < Persona.length; i++) {

            System.out.println("\n"+i);
            for (int j = 0; j < 4; j++){

                System.out.print(Persona[i][j]+" ");
            }
        }
        System.out.print("\n--------------------------------");


        System.out.print("\n\nPersones ordenades per altura"+"\n");

        System.out.print("\n--------------------------------");


        System.out.print("\n\nPersones ordenades per edat"+"\n");

        System.out.print("\n--------------------------------");

    }
}
