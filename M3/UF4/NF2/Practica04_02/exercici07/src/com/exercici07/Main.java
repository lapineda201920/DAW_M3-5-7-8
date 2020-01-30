package com.exercici07;

public class Main  {

   public static void main(String[] args){

        try {

            throw new Exception("Esto es una Excepción");

        }
        catch(Exception e) {

            System.out.println("Se produjo un excepciÃ³n: " + e.getMessage());

        }
        finally {

            System.out.println("Esto se ejecuta sin importar si se presentan errores");

        }
   }
}
