package com.codewars.max.codewars.trailingzeroesfactorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.codewars.max.codewars.trailingzeroesfactorial.TrailingZeroesFactorial;

class TrailingZeroesFactorialTest {

	@Test
	void testZeros() throws Exception {
		assertEquals(0, TrailingZeroesFactorial.zeros(0));
		assertEquals(1, TrailingZeroesFactorial.zeros(6));
		assertEquals(2, TrailingZeroesFactorial.zeros(14));
		assertEquals(3, TrailingZeroesFactorial.zeros(15));
		assertEquals(4, TrailingZeroesFactorial.zeros(20));
		assertEquals(6, TrailingZeroesFactorial.zeros(25));
		assertEquals(7, TrailingZeroesFactorial.zeros(30));
		assertEquals(226763339, TrailingZeroesFactorial.zeros(907053375));
	}
	
	@Test
	void testGetMultiple5() {
		assertEquals(0, TrailingZeroesFactorial.getMultiple5(4));
		assertEquals(2, TrailingZeroesFactorial.getMultiple5(25));
		assertEquals(3, TrailingZeroesFactorial.getMultiple5(125));
		assertEquals(4, TrailingZeroesFactorial.getMultiple5(625));
	}
	
}
