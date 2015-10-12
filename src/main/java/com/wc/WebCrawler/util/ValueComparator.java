package com.wc.WebCrawler.util;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator<String> {
	 
	Map<String, Integer> map;
 
	public ValueComparator(Map<String,Integer> map) {
		this.map = map;
	}
 
	public int compare(String keyA, String keyB) {
		return map.get(keyB).compareTo(map.get(keyA));
	}
}