package com.wc.WebCrawler.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	public static String getWholeWord(String input) {
		String output = null;
		Pattern p = Pattern.compile("\\p{L}+(?:\\-\\p{L}+)*");
		Matcher m = p.matcher(input);
		if(m.find())
			output = m.group();
		return output;
	}
}
