package io.github.srinaths.euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFindNthPrimeNumber {
	
	@Test
	public void testFindPrime( ) {
		FindNthPrime primeFinder = new FindNthPrime();
		assertEquals(104743, primeFinder.findPrime(10_001));
	}

}
