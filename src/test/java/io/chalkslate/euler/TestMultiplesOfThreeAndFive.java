package io.chalkslate.euler;

import org.junit.Test;

public class TestMultiplesOfThreeAndFive {

    private MultiplesOfThreeAndFive multiples = new MultiplesOfThreeAndFive();

    @Test
    public void testMultiplesSum() {
        System.out.println(multiples.findSumOfMultiples(1000));
    }
}
