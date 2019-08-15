package io.chalkslate.algo;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestQuickSort {
    private final QuickSort sorter = new QuickSort();

    @Test
    public void testQuickSort() {
        int[] input = {3, 67, 45, 21, 82, 19};
        int[] sorted = {3, 19, 21, 45, 67, 82};
        sorter.sort(input);
        assertArrayEquals(sorted, input);
    }
}