package io.github.srinaths.algo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SelectionSort {

    private static final Logger log = LoggerFactory.getLogger(SelectionSort.class);

    public void sort(int[] unsorted) {
        long start = System.nanoTime();
        for (int i = 0; i < unsorted.length - 1; i++) {
            for (int j = i + 1; j < unsorted.length; j++) {
                if (unsorted[j] < unsorted[i]) {
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
        long elapsed = System.nanoTime() - start;
        String arrayString = IntStream.of(unsorted).mapToObj(Integer::toString).collect(Collectors.joining(","));
        log.info("Sorted array: {}", arrayString);
        log.debug("Process took " + elapsed + "ns.");
    }

}