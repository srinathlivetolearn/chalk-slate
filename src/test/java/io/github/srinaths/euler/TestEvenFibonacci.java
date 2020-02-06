package io.github.srinaths.euler;

import org.junit.Assert;
import org.junit.Test;

public class TestEvenFibonacci {

	@Test
	public void testSumOfEvenValued() {
		long sum = new EvenFibonacci().sumOfEvenValued();
		Assert.assertEquals(4613732L,sum);
	}
}
