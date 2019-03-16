
package com.codewars.max.codewars.sum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumTest {
	Sum s = new Sum();

	@Test
	public void tests() {
		assertEquals(-1, s.getSum(0, -1));
		assertEquals(1, s.getSum(0, 1));
		assertEquals(3, s.getSum(0, 2));
		assertEquals(6, s.getSum(0, 3));
		assertEquals(1, s.getSum(1, 0));
		assertEquals(-1, s.getSum(-1, 0));
		assertEquals(-1, s.getSum(-1, 0));
		assertEquals(-15, s.getSum(-5, 0));
	}
}
