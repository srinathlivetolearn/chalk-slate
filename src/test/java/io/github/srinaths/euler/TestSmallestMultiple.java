package io.github.srinaths.euler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSmallestMultiple {

    @Test
    public void testComputeSmallestMultiple() {
        int multiple = new SmallestMultiple().computeSmallestMultiple(20);
        assertEquals(232792560, multiple);
    }

}
