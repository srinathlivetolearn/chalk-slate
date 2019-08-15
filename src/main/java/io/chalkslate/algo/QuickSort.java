package io.chalkslate.algo;

import java.util.stream.IntStream;

public class QuickSort {

    public void sort(int[] unsorted) {
        long start = System.nanoTime();
        quickSort(unsorted, 0, unsorted.length - 1);
        long elapsed = System.nanoTime() - start;
        System.out.println("Sorted array:");
        IntStream.of(unsorted).forEach(System.out::println);
        System.err.println("Process took " + elapsed + "ns.");
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                ++i;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = pivot;
        arr[high] = temp;
        return i + 1;
    }
}