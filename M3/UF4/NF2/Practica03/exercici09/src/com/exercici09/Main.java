package com.exercici09;

public class Main {

    public static void main(String[] args) {

        HoraExacta a = new HoraExacta(25,60,31);
        HoraExacta b = new HoraExacta(25,60,31);
        HoraExacta c = new HoraExacta(1,2,3);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
