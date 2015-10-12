package com.wc.WebCrawler;

import java.io.IOException;

/**
 *  Starting point of the application
 *
 */
public class App {
	public static void main(String... args) {
		String URL = args[0];
		System.out.println(URL);
		AppClient client = new AppClient(URL);
		try {
			client.crawlWords();
			client.filterFrequentWords();
			client.findWordDensity();
			client.displayWordDensity();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
