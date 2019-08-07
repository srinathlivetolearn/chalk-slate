package io.chalkslate.euler;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 * 
 * https://projecteuler.net/problem=7
 */
public class FindNthPrime {

	/*
	 *  Use sieve of eratosthenes to find nth prime.
	 *  
	 *  https://en.wikipedia.org/wiki/Generation_of_primes#Prime_sieves
	 */
	public int findPrime(int n) {
		int nthPrime  = 0;
		int count = 0;
		int number = 2;
		while(count < n) {
			if(isPrime(number)) {
				++count;
				nthPrime = number;
			}
			++number;
		}
		return nthPrime;
	}

	private boolean isPrime(int n) {
		if(n == 2) return true;
		if((n&1) == 0)
			return false;
		for(int i=3;i < n; i+=2) {
			if(n%i == 0)
				return false;
		}
		return true;
	}

}
