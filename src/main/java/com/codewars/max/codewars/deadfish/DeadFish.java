package com.codewars.max.codewars.deadfish;

import org.apache.commons.lang3.StringUtils;

/**
 * <pre>
 * i increments the value (initially 0) 
 * d decrements the value 
 * s squares the value 
 * o outputs the value into the return array
 * </pre>
 *
 */
public class DeadFish {
	public static int[] parse(String data) {
		if (StringUtils.isEmpty(data)) {
			return new int[0];
		}

		String[] splitData = data.split("o", -1);
		int nOutputs = splitData.length - 1;
		int value = 0;
		int[] result = new int[nOutputs];
		for (int i = 0; i < nOutputs; i++) {
			for (char c : splitData[i].toCharArray()) {
				switch (c) {
				case 'i':
					value += 1;
					break;
				case 's':
					value *= value;
					break;
				case 'd':
					value -= 1;
					break;
				default:
					throw new IllegalArgumentException("Char " + c + "not allowed!");
				}

			}
			result[i] = value;
		}

		return result;
	}
}
