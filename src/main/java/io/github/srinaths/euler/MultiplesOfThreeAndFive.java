package io.github.srinaths.euler;

/**
 * Problem:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * <p>
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * href: https://projecteuler.net/problem=1
 */

public class MultiplesOfThreeAndFive {

    public long findSumOfMultiples(int range) {
        long sum = 0L;
        for(int i=3; i<range; i++) {
            if(i%3 == 0 || i%5==0)
                sum += i;
        }
        return sum;
    }
    
    /**
     * Using sum of nth term in A.P
     *  Sn = n/2 * [ 2a + (n-1)d].
     * @param range
     * @return
     */
    public long findSumOfMultiplesUsingAP(int range) {
    	long rangeOfThree = (range-1) / 3;
    	long rangeOfFive = (range-1) /5;
    	long rangeOfFifteen = (range-1) / (3*5);
    	
    	long sumOfThrees = (rangeOfThree * (6 + (rangeOfThree - 1) * 3))/2;
    	long sumOfFives = (rangeOfFive * (10 + (rangeOfFive - 1) * 5))/2;
    	long sumOfFifteens = (rangeOfFifteen * (30 + (rangeOfFifteen-1) * 15))/2;
    	
    	return (sumOfThrees + sumOfFives) - sumOfFifteens;
    }
}
