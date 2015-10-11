package com.wc.WebCrawler;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String URL = "http://www.amazon.com/Cuisinart-CPT-122-Compact-2-Slice-Toaster/dp/B009GQ034C/ref=sr_1_1?s=kitchen&ie=UTF8&qid=1431620315&sr=1-1&keywords=toaster";
		AppClient client = new AppClient(URL);
		try {
			client.crawlWords();
			client.displayWordsList();
			client.filterFrequentWords();
			client.displayWordsList();
			client.findWordDensity();
			client.displayWordDensity();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
