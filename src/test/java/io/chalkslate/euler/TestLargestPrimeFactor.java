package io.chalkslate.euler;

import org.junit.Assert;
import org.junit.Test;

public class TestLargestPrimeFactor {

	@Test
	public void testComputeLargestPrimeFactor() {
		long largestPrimeFactor = new LargestPrimeFactor().computeLargestPrimeFactor(600851475143L);
		Assert.assertEquals(6857L,largestPrimeFactor);
	}
}
