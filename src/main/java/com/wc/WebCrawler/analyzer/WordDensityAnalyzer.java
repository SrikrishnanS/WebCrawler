package com.wc.WebCrawler.analyzer;

import java.util.Collection;
import java.util.List;

import com.wc.WebCrawler.model.Topic;

/**
 * The user of this interface can transform a collection of words to topics with
 * their analyzed frequency.
 * 
 * @author srikrishnan_suresh
 * @version 1.0
 */
public interface WordDensityAnalyzer {
	public List<Topic> getWordDensity(Collection<String> words);
}
