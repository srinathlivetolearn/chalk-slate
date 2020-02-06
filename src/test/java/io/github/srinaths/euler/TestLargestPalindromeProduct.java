package io.github.srinaths.euler;

import org.junit.Assert;
import org.junit.Test;

public class TestLargestPalindromeProduct {

    @Test
    public void testComputeLargestPalindrome() {
        long palindrome = new LargestPalindromeProduct().computeLargestPalindrome(3);
        Assert.assertEquals(906609L,palindrome);
    }
}
