package io.chalkslate.euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMultiplesOfThreeAndFive {

    private MultiplesOfThreeAndFive multiples = new MultiplesOfThreeAndFive();

    @Test
    public void testMultiplesSum() {
       assertEquals(233168L, multiples.findSumOfMultiples(1000));
    }
    
    @Test
    public void testOptimalSolution() {
    	long sum = multiples.findSumOfMultiplesUsingAP(1000);
		System.out.println(sum);
    	assertEquals(233168L, sum);
    }
}
