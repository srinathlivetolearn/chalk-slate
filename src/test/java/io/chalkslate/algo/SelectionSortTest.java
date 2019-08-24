package io.chalkslate.algo;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    private final SelectionSort sorter = new SelectionSort();

    @Test
    void sort() {
        int[] input = {67, 3, 45, 21, 82, 19};
        int[] sorted = {3, 19, 21, 45, 67, 82};
        sorter.sort(input);
        assertArrayEquals(sorted, input);
    }
}