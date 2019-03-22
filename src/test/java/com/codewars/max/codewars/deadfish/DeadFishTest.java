package com.codewars.max.codewars.deadfish;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class DeadFishTest {
	@Test
	void exampleTests() {
        assertArrayEquals(new int[] {8, 64}, DeadFish.parse("iiisdoso"));
        assertArrayEquals(new int[] {8, 64, 3600}, DeadFish.parse("iiisdosodddddiso"));
    }
}
