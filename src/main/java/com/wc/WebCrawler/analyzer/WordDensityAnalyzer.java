package com.wc.WebCrawler.analyzer;

import java.util.Collection;
import java.util.List;

import com.wc.WebCrawler.model.Topic;

public interface WordDensityAnalyzer {
	public List<Topic> getWordDensity(Collection<String> words);
}
