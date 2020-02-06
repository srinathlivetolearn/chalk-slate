package io.github.srinaths.algo;

import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestInsertionSort {
    private final InsertionSort sorter = new InsertionSort();

    @Test
    public void testSort() {
        int[] input = {67, 3, 45, 21, 82, 19};
        int[] sorted = {3, 19, 21, 45, 67, 82};
        sorter.sort(input);
        assertArrayEquals(sorted, input);
    }

    void sortRandomArray() {
        sorter.sort(generateRandomArrayInput(2_000_000));
    }

    private int[] generateRandomArrayInput(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++)
            arr[i] = RandomUtils.nextInt(0, Integer.MAX_VALUE);
        return arr;
    }

}
