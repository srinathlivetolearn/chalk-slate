package io.github.srinaths.euler;

import java.time.Instant;
import java.util.LinkedList;
import java.util.List;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 *
 */

public class LargestPrimeFactor {

	public long computeLargestPrimeFactor(long number) {
		long start = Instant.now().toEpochMilli();
		long maxPrimeFactor = 0;
		long n = number;
		List<Long> factors = new LinkedList<>();
		while (n%2 == 0) {
			maxPrimeFactor = 2;
			factors.add(2L);
			n = n/2;
		}
		for(int i=3; i<Math.sqrt(n) ; i+=2) {
			while (n%i == 0) {
				factors.add(Long.valueOf(i));
				n = n/i;
				maxPrimeFactor = Math.max(maxPrimeFactor,i);
			}
		}
		if(n > 2) {
			factors.add(Long.valueOf(n));
			maxPrimeFactor = Math.max(maxPrimeFactor,n);
		}
		long end = Instant.now().toEpochMilli();
		System.out.println("Prime factors are: ");
		factors.forEach(System.out::println);
		System.err.println("Max prime factor: "+maxPrimeFactor);
		System.out.println("Time taken in millis: "+ (end-start));
		return maxPrimeFactor;
	}
}
