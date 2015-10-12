package com.wc.WebCrawler.analyzer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.wc.WebCrawler.model.Topic;

public class WordDensityAnalyzerImpl implements WordDensityAnalyzer {

	public List<Topic> getWordDensity(Collection<String> words) {
		List<Topic> topicsList = new ArrayList<Topic>();
		Iterator<String> iterator = words.iterator();
		String word = null;
		Topic topic = null;
		while (iterator.hasNext()) {
			word = iterator.next();
			topic = new Topic(word);
			if (topicsList.contains(new Topic(word))) {
				int index = topicsList.indexOf(topic);
				topic = topicsList.get(index);
				topic.setFrequency(topic.getFrequency()+1);
				topicsList.set(index, topic);
			}
			else
				topicsList.add(new Topic(word,1));
		}
		Collections.sort(topicsList,Collections.reverseOrder());
		return topicsList;
	}
}