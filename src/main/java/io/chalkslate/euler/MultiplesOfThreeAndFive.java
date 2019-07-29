package io.chalkslate.euler;

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
}
