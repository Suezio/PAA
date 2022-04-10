package SeletionSort;


import test.Main;

public class SeletionSort {
    public static void SeletionSort(int[] array) {

            for (int i = 0; i < array.length - 1; i++) {
                int menor = i;

                for (int j = menor + 1; j < array.length; j++) {
                    if (array[j] < array[menor]) {
                        menor = j;
                    }
                }
                if (menor != i) {
                    int t = array[i];
                    array[i] = array[menor];
                    array[menor] = t;
                }


        }Main.DispalyHArray(array);
    }
}