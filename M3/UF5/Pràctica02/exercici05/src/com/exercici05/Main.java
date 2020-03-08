package com.exercici05;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        HashSet<Integer> setA = new HashSet<Integer>(1_000_000);
        HashSet<Integer> setB = new HashSet<Integer>(1_000_000);


        setA.add(0);
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(8);
        setA.add(9);


        setB.add(0);
        setB.add(1);
        setB.add(3);
        setB.add(4);
        setB.add(5);


        Set<Integer> union = Sets.union(setA, setB);
        System.out.println("Union of the two Set"+union);

        Set<Integer> intersection = Sets.intersection(setA, setB);
        System.out.println("Intersection of the two Set"+intersection);

        Set<Integer> difference = Sets.difference(setA, setB);
        System.out.println("Difference of the two Set"+difference);
    }
}
