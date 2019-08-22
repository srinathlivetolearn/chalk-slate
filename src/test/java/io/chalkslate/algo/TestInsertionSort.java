package io.chalkslate.algo;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestInsertionSort {
    private final InsertionSort sorter = new InsertionSort();

    @Test
    public void testSort() {
        int[] input = {3, 67, 45, 21, 82, 19};
        int[] sorted = {3, 19, 21, 45, 67, 82};
        sorter.sort(input);
        assertArrayEquals(sorted, input);
    }

}
