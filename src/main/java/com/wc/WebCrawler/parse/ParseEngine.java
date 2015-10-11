package com.wc.WebCrawler.parse;

import java.io.IOException;
import java.util.Collection;

public interface ParseEngine {
	public Collection<String> getWords(String URL) throws IOException;
}
