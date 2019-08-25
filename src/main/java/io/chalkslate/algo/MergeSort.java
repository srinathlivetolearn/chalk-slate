package io.chalkslate.algo;

import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MergeSort {

    private static final Logger log = LoggerFactory.getLogger(MergeSort.class);

    public void sort(int[] unsorted) {
        long start = System.nanoTime();
        mergeSort(unsorted, 0, unsorted.length - 1);
        long elapsed = System.nanoTime() - start;
        log.info("Sorted array: {}", ArrayUtils.toString(unsorted));
        log.debug("Process took " + elapsed + "ns.");
    }

    private void mergeSort(int[] arr, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(arr, p, q);
            mergeSort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    private void merge(int[] arr, int p, int q, int r) {
        //marker for last element in left and right sub arrays
        final int sentinel = Integer.MAX_VALUE;
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[p + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[q + j + 1];
        }
        left[n1] = sentinel;
        right[n2] = sentinel;

        int i = 0;
        int j = 0;
        for (int k = p; k <= r; k++) {
            if (left[i] <= right[j]) {
                arr[k] = left[i++];
            } else {
                arr[k] = right[j++];
            }
        }
    }
}