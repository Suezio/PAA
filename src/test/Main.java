package test;

import SeletionSort.SeletionSort;
import insertionsort.InsertionSort;

import java.nio.channels.SelectableChannel;

public class Main {

    public static int ArraySize = 10;
    public static int[] array = new int[ArraySize];


    public static void GenrateRandomArray() {
        System.out.println("ARRAY DESORDENADO\n");
        System.out.print("| ");
        for (int i = 0; i < ArraySize; i++) {

            array[i] = (int) (Math.random() * 1000);
            System.out.print(array[i] + "  | ");

        }
        System.out.println();

    }

    public static void DispalyHArray(int vet[]) {
        System.out.println("\n************************************************************************************");
        System.out.println("\nARRAY ORDENADO \n");
        System.out.print("| ");
        for (int i = 0; i < ArraySize; i++) System.out.print(vet[i] + "  | ");
        System.out.println();

    }

    public static void main(String[] args) {

        GenrateRandomArray();

        InsertionSort.InsertionSort(array);
        //SeletionSort.SeletionSort(array);

    }

}