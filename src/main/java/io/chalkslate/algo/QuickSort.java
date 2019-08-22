package io.chalkslate.algo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QuickSort {

    private static final Logger log = LoggerFactory.getLogger(QuickSort.class);

    public void sort(int[] unsorted) {
        long start = System.nanoTime();
        quickSort(unsorted, 0, unsorted.length - 1);
        long elapsed = System.nanoTime() - start;
        String arrayString = IntStream.of(unsorted).mapToObj(Integer::toString).collect(Collectors.joining(","));
        log.info("Sorted array: {}", arrayString);
        log.debug("Process took " + elapsed + "ns.");
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