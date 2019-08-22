package io.chalkslate.algo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InsertionSort {
    private static final Logger log = LoggerFactory.getLogger(InsertionSort.class);

    public void sort(int[] unsorted) {
        long start = System.nanoTime();
        for (int i = 1; i < unsorted.length; i++) {
            int key = unsorted[i];
            int j = i - 1;
            while (j >= 0 && unsorted[j] > key) {
                unsorted[j + 1] = unsorted[j];
                --j;
            }
            unsorted[j + 1] = key;
        }
        long elapsed = System.nanoTime() - start;
        String arrayString = IntStream.of(unsorted).mapToObj(Integer::toString).collect(Collectors.joining(","));
        log.info("Sorted array: {}", arrayString);
        log.debug("Process took " + elapsed + "ns.");
    }

}
