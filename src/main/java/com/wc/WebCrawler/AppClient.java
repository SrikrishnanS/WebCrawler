package com.wc.WebCrawler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.wc.WebCrawler.analyzer.WordDensityAnalyzer;
import com.wc.WebCrawler.analyzer.WordDensityAnalyzerImpl;
import com.wc.WebCrawler.filter.FrequentWordsFilterImpl;
import com.wc.WebCrawler.filter.WordsFilter;
import com.wc.WebCrawler.model.Topic;
import com.wc.WebCrawler.parse.JSoupParseEngineImpl;
import com.wc.WebCrawler.parse.ParseEngine;

public class AppClient {

	private String URL;
	private Collection<String> crawledWords;
	private WordsFilter filter = new FrequentWordsFilterImpl();
	private WordDensityAnalyzer analyzer = new WordDensityAnalyzerImpl();
	private List<Topic> wordDensity = new ArrayList<Topic>();
	public AppClient(String URL) {
		this.URL = URL;
	}

	public void crawlWords() throws IOException {
		ParseEngine parseEngine = new JSoupParseEngineImpl();
		crawledWords = parseEngine.getWords(URL);
	}

	public void displayWordsList() {
		System.out.println(crawledWords);
	}

	public void filterFrequentWords() {
		crawledWords = filter.filterWordList(crawledWords);
	}
	
	public void findWordDensity() {
		wordDensity = analyzer.getWordDensity(crawledWords);
	}

	public void displayWordDensity() {
		for(Topic topic : wordDensity)
			System.out.println(topic);
	}

	
}
