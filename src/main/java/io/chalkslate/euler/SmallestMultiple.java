package io.chalkslate.euler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * <p>
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * <p>
 * https://projecteuler.net/problem=5
 */
public class SmallestMultiple {

    public int computeSmallestMultiple(int n) {
        int smallestMultiple = -1;
        for (int i = n; i < Integer.MAX_VALUE; i++) {
            int dividesByAll = 1;
            for (int j = 2; j <= n; j++) {
                if (i % j != 0) {
                    dividesByAll = 0;
                    break;
                }
            }
            if (dividesByAll == 1) {
                smallestMultiple = i;
                break;
            }
        }
        return smallestMultiple;
    }

}
