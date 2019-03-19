package com.codewars.max.codewars.binaryarraytonumber;

import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class BinaryArrayToNumber {

	public static int ConvertBinaryArrayToInt(List<Integer> binary) {
		Collections.reverse(binary);
		OptionalInt optional = IntStream.range(0, binary.size())
				.reduce((a, b) -> a + (binary.get(b) * 2<<(b-1)));

		return optional.isPresent() ? binary.get(0) + optional.getAsInt() : 0;
	}
}
