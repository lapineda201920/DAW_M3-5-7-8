package com.exercici05;

public class ExcepcionIntervalo extends Exception {

    public ExcepcionIntervalo(String msg) {

        super(msg);
    }
}

public class Main {
    public static void main(String[] args) {

        // ATRIBUTS
        String str1="120";
        String str2="3";
        String respuesta;
        int numerador, denominador, cociente;


        // MÈTODES
        try{

            numerador=Integer.parseInt(str1);
            denominador=Integer.parseInt(str2);
            rango(numerador, denominador);
            cociente=numerador/denominador;
            respuesta=String.valueOf(cociente);
        }
        catch(NumberFormatException ex){

            respuesta="Se han introducido caracteres no numéricos";
        }
        catch(ArithmeticException ex){

            respuesta="División entre cero";
        }
        catch(ExcepcionIntervalo ex){

            respuesta=ex.getMessage();
        }
        System.out.println(respuesta);
    }

    static void rango(int num, int den)throws ExcepcionIntervalo{

        if((num>100)||(den<-5)){

            throw new ExcepcionIntervalo("Números fuera de rango");
        }
    }
}
