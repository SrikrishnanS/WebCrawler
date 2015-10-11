package com.wc.WebCrawler.analyzer;

import java.util.Collection;
import java.util.Map;

public interface WordDensityAnalyzer {
	public Map<String,Integer> getWordDensity(Collection<String> words);
}
