package insertionsort;

import test.Main;

public class InsertionSort {
    public static void InsertionSort(int[] vetor) {
        int key;
        int i;

        for (int j = 1; j < vetor.length; j++) {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
        Main.DispalyHArray(vetor);
    }

}

