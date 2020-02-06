package io.github.srinaths.euler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSumSquareDifference {

    @Test
    public void testCompute() {
        long result = new SumSquareDifference().compute(100);
        assertEquals(25164150L, result);
    }
}
