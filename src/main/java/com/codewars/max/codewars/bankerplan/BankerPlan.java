package com.codewars.max.codewars.bankerplan;

public class BankerPlan {

	public static boolean fortune(int f0, double p, int c0, int n, double i) {
		double interestRate = (1 + 0.01 * p);
		double inflationRate = (1 + 0.01 * i);
		for (int k = 0; k < n-1; k++) { // to be fair, do not ask me about the n-1, i got it from the discussion.
			f0 = (int) Math.floor(f0 * interestRate) - c0;
			c0 = (int) Math.floor(c0 * inflationRate);
			if (f0 < 0 ) {
				return false;
			}
		}

		return f0 >= 0;
	}
}
