package io.chalkslate.euler;

import org.junit.Assert;
import org.junit.Test;

public class TestLargestPrimeFactor {

    @Test
    public void testComputeLargestPrimeFactor() {
        long largestPrimeFactor = new LargestPrimeFactor().computeLargestPrimeFactor(600851475143L);
        Assert.assertEquals(6857L, largestPrimeFactor);
    }

    @Test
    public void testComputeWithEvenInput() {
		long primeFactor = new LargestPrimeFactor().computeLargestPrimeFactor(108L);
		Assert.assertEquals(3L,primeFactor);
    }
}