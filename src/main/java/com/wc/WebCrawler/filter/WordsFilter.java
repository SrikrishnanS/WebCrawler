package com.wc.WebCrawler.filter;

import java.util.Collection;

/**
 * The user of this interface can implement the filter.
 * 
 * @author srikrishnan_suresh
 * @version 1.0
 */
public interface WordsFilter {

	/**
	 * @param wordList A collection of words to be filtered
	 * @return A collection of filtered words
	 */
	public Collection<String> filterWordList(Collection<String> wordList);
}
