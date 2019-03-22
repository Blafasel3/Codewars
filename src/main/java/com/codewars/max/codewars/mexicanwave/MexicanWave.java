package com.codewars.max.codewars.mexicanwave;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;


public class MexicanWave {

	public static String[] wave(String str) {
		if (StringUtils.isEmpty(str)) {
			return new String[] {};
		}

		List<String> result = new ArrayList<>();
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isWhitespace(str.charAt(i))) {
				continue; // skip
			}
			StringBuilder newSb = new StringBuilder(str);
			char uC = Character.toUpperCase(str.charAt(i));
			newSb.setCharAt(i, uC);
			result.add(newSb.toString());
		}

		return result.toArray(new String[] {});
	}
}
