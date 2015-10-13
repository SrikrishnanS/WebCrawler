package com.wc.WebCrawler.parse;

import java.io.IOException;
import java.util.Collection;

/**
 * The user of this interface can parse a URL and return a collection of strings
 * fetched from the page.
 * 
 * @author srikrishnan_suresh
 * @version 1.0
 */
public interface ParseEngine {
	public Collection<String> getWords(String URL) throws IOException;
}
