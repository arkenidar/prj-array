package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayOperazioni<T> {
    private T[] array;

    public ArrayOperazioni(T[] arrayIniziale) {
        array = arrayIniziale;
    }

    public void aggiungiFine(T x) {
        // accresci
        ///https://www.baeldung.com/java-generic-array
        T[] array2 = alloca(array.length + 1);
        //@SuppressWarnings("unchecked")
        //T[] array2 = (T[]) Array.newInstance(array[0].getClass(), array.length + 1);
        ////T[] array2 = new T[array.length + 1];
        // conserva
        T[] iniziale = array;
        // ricopia
        array = array2; // accresciuto
        ricopia(iniziale);
        // aggiungi
        int indiceFine = array.length - 1;
        array[indiceFine] = x;
    }

    public T[] alloca(int size) {
        T elem = array[0];
        @SuppressWarnings("unchecked")
        T[] array2 = (T[]) Array.newInstance(elem.getClass(), size);
        return array2;
    }

    public void ricopia(T[] array) {
        ricopia(array, 0);
    }

    public void ricopia(T[] array2, int indiceInizio) {
        for (int i = 0; i < array2.length; i++) {
            T elemento = array2[i];
            array[i + indiceInizio] = elemento; // copia elemento
        }
    }

    public void aggiungiInizio(T x) {
        // accresci
        @SuppressWarnings("unchecked")
        T[] array2 = alloca(array.length + 1);
        // conserva
        T[] iniziale = array;
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

    public void aggiungiFine(T[] arrayArg) {
        int lunghezzaIniziale = array.length;
        // accresci
        //T[] array2 = new T[array.length + arrayArg.length];
        @SuppressWarnings("unchecked")
        T[] array2 = alloca(array.length + arrayArg.length);

        // conserva
        T[] iniziale = array;
        // ricopia
        array = array2; // accresciuto
        ricopia(iniziale);
        // aggiungi
        ricopia(arrayArg, lunghezzaIniziale);
    }

    public void aggiungiInizio(T[] arrayArg) {
        // accresci
        ////T[] arrayN = new T[array.length + arrayArg.length];
        @SuppressWarnings("unchecked")
        T[] arrayN = alloca(array.length + arrayArg.length);

        T[] iniziale = array; // conserva

        // ricopia
        array = arrayN;
        ricopia(iniziale, arrayArg.length);

        // aggiungi
        ricopia(arrayArg, 0);
    }
}
