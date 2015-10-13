package com.wc.WebCrawler.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility class for manipulating string objects
 * 
 * @author srikrishnan_suresh
 * @version 1.0
 */
public class StringUtils {

	/**
	 * Extracts a whole word from a string. Accepts a combination of numbers and
	 * alphabets and a single hyphen character. Does not pick digits-only string.
	 * 
	 * @param input
	 *            The input from which the string has to be extracted
	 * @return The whole world string extracted from the input string. If not
	 *         match is found, the method returns null.
	 */
	public static String getWholeWord(String input) {
		String output = null;
		Pattern p = Pattern.compile("((\\p{Alpha})+(\\-)*(\\p{Alnum})*)|(((\\p{Alnum})*(\\-)*(\\p{Alpha})+))");
		Matcher m = p.matcher(input);
		if (m.find())
			output = m.group();
		return output;
	}
}
