package io.github.srinaths.euler;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPalindromeProduct {

    public long computeLargestPalindrome(int n) {
        long tStart = System.nanoTime();
        long upper_limit = 0L;
        for (int i = 1; i <= n; i++) {
            upper_limit *= 10L;
            upper_limit += 9L;
        }
        long lower_limit = (upper_limit + 1) / 10;
        long max_product = 0L;

        for (long i = upper_limit; i >= lower_limit; i--) {
            for (long j = i; j >= lower_limit; j--) {
                long prod = i * j;
                if (prod < max_product)
                    break;
                long reverse = reverse(prod);
                if (prod == reverse && prod > max_product)
                    max_product = prod;
            }
        }
        System.out.println("Computation took "+(System.nanoTime()-tStart)+"ns");
        System.err.println("Maximum palindrome product: "+max_product);
        return max_product;
    }

    private long reverse(final long number) {
        long reverse = 0;
        long n = number;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        return reverse;
    }

}
