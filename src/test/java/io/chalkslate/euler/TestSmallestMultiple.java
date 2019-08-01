package io.chalkslate.euler;

import org.junit.Test;

public class TestSmallestMultiple {

    @Test
    public void testComputeSmallestMultiple() {
        int multiple = new SmallestMultiple().computeSmallestMultiple(20);
        System.err.println(multiple);
    }
}
