package com.codewars.max.codewars.bankerplan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankerPlanTest {
	private static void testing(boolean actual, boolean expected) {
		assertEquals(expected, actual);
	}

	@Test
	public void test1() {
//		testing(BankerPlan.fortune(100000, 1, 2000, 15, 1), true);
//		testing(BankerPlan.fortune(100000, 1, 9185, 12, 1), false);
//		testing(BankerPlan.fortune(100000000, 1, 100000, 50, 1), true);
//		testing(BankerPlan.fortune(100000000, 1.5, 10000000, 50, 1), false);
//		testing(BankerPlan.fortune(100000000, 5, 1000000, 50, 1), true);
//		testing(BankerPlan.fortune(100000, 1, 100001, 2, 1), false);
		testing(BankerPlan.fortune(384194, 3, 52292, 8, 4), false);
	}
}
