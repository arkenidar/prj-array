package org.example;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PrintStream out = System.out;

        out.println("Array!");

        int[] serie1 = {1, 2, 3, 4};

        ArrayOperazioni array = new ArrayOperazioni(serie1);

        int[] serie2 = {5, 6, 7, 8};
        array.aggiungiFine(10);
        array.aggiungiInizio(-10);

        out.println(array);

        array.aggiungiInizio(serie2); out.println(array);
        array.aggiungiFine(new int[]{11,22,33}); out.println(array);
    }
}