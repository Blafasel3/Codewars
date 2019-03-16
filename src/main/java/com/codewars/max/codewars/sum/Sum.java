package com.codewars.max.codewars.sum;

import java.util.stream.*;

public class Sum {

	public int getSum(int a, int b) {
		if (a == b) {
			return a;
		}

		if (a < b) {
			return IntStream.rangeClosed(a, b).sum();
		}
		return IntStream.rangeClosed(b, a).sum();
	}
}
