package com.wc.WebCrawler.analyzer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordDensityAnalyzerImpl implements WordDensityAnalyzer {

	public Map<String, Integer> getWordDensity(Collection<String> words) {
		Map<String,Integer> wordMap = new HashMap<String,Integer>();
		Iterator<String> iterator = words.iterator();
		String word = null;
		while(iterator.hasNext()) {
			word = iterator.next();
		}
		return null;
	}

}
