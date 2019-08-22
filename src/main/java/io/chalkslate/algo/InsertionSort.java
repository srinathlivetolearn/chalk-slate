package io.chalkslate.algo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsertionSort {
    private static final Logger log = LoggerFactory.getLogger(InsertionSort.class);

    public void sort(int[] unsorted) {
        log.info("Starting process");
        for (int i = 1; i < unsorted.length; i++) {
            int key = unsorted[i];
            int j = i - 1;
            while (j > 0 && unsorted[j] > key) {
                unsorted[j + 1] = unsorted[j];
                --j;
            }
            unsorted[j + 1] = key;
        }
    }

}
