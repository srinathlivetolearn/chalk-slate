package io.github.srinaths.euler;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.LongStream;

/**
 * The sum of the squares of the first ten natural numbers is,
 * <p>
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * <p>
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * <p>
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * <p>
 * https://projecteuler.net/problem=6
 */
public class SumSquareDifference {

    private long sumOfSquare = 0L;

    private long squareOfSum = 0L;

    public long compute(int n) {
        Executor executor = Executors.newFixedThreadPool(2);
        CompletableFuture<Void> sumSquares = CompletableFuture.runAsync(() ->
                this.sumOfSquare = LongStream.range(1, n + 1).map(i -> i * i).sum(), executor);
        CompletableFuture<Void> squareSum = CompletableFuture.runAsync(() -> {
            long sum = LongStream.range(1, n + 1).sum();
            this.squareOfSum = sum * sum;
        }, executor);
        CompletableFuture.allOf(sumSquares, squareSum).join();
        return squareOfSum - sumOfSquare;
    }

}
