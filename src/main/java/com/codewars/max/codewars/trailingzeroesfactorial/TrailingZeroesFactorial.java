package com.codewars.max.codewars.trailingzeroesfactorial;

public class TrailingZeroesFactorial {
	public static int zeros(int n) {

		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += getMultiple5(i);
		}

		return result;
	}

	public static int getMultiple5(int n) {
		if (n % 5 != 0) {
			return 0;
		}

		return getMultiple5(n /= 5) + 1;
	}
}
