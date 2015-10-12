package com.wc.WebCrawler.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class FrequentWordsFilterImpl implements WordsFilter {

	private static final List<String> COMMON_WORDS = new ArrayList<String>(Arrays.asList(new String[] { "the", "be",
			"to", "of", "and", "a", "in", "that", "have", "i", "it", "for", "not", "on", "with", "he", "as", "you",
			"do", "at", "this", "but", "his", "by", "from", "they", "we", "say", "her", "she", "or", "an", "will", "my",
			"one", "all", "would", "there", "their", "what", "so", "up", "out", "if", "about", "who", "get", "which",
			"go", "me", "when", "make", "can", "like", "time", "no", "just", "him", "know", "take", "people", "into",
			"year", "your", "good", "some", "could", "them", "see", "other", "than", "then", "now", "look", "only",
			"come", "its", "over", "think", "also", "back", "after", "use", "two", "how", "our", "work", "first",
			"well", "way", "even", "new", "want", "because", "is", "x", "any", "these", "give", "day", "most", "us" }));

	public Collection<String> filterWordList(Collection<String> wordList) {
		wordList.removeAll(COMMON_WORDS);
		return wordList;
	}

}
