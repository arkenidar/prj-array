package org.example;

import java.util.Arrays;

public class ArrayOperazioni {
    private int[] array;

    public ArrayOperazioni(int[] arrayIniziale) {
        array = arrayIniziale;
    }

    public void aggiungiFine(int x) {
        // accresci
        int[] array2 = new int[array.length + 1];
        // conserva
        int[] iniziale = array;
        // ricopia
        array = array2; // accresciuto
        ricopia(iniziale);
        // aggiungi
        int indiceFine = array.length - 1;
        array[indiceFine] = x;
    }

    public void ricopia(int[] array) {
        ricopia(array, 0);
    }

    public void ricopia(int[] array2, int indiceInizio) {
        for (int i = 0; i < array2.length; i++) {
            int elemento = array2[i];
            array[i + indiceInizio] = elemento; // copia elemento
        }
    }

    public void aggiungiInizio(int x) {
        // accresci
        int[] array2 = new int[array.length + 1];
        // conserva
        int[] iniziale = array;
        // ricopia
        array = array2; // accresciuto
        // inizia da dopo, dopo l'inizio
        ricopia(iniziale, 1);
        // aggiungi
        int indiceInizio = 0;
        array[indiceInizio] = x;
    }

    @Override
    public String toString() {
        return "ArrayOperazioni{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public void aggiungiFine(int[] arrayArg) {
        int lunghezzaIniz = array.length;
        // accresci
        int[] array2 = new int[array.length + arrayArg.length];
        // conserva
        int[] iniziale = array;
        // ricopia
        array = array2; // accresciuto
        ricopia(iniziale);
        // aggiungi
        ricopia(arrayArg, lunghezzaIniz);
    }

    public void aggiungiInizio(int[] arrayArg) {
        // accresci
        int[] arrayN = new int[array.length + arrayArg.length];

        int[] iniziale = array; // conserva

        // ricopia
        array = arrayN;
        ricopia(iniziale, arrayArg.length);

        // aggiungi
        ricopia(arrayArg, 0);
    }
}
