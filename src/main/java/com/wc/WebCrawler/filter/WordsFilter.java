package com.wc.WebCrawler.filter;

import java.util.Collection;

public interface WordsFilter {

	public Collection<String> filterWordList(Collection<String> wordList);
}
