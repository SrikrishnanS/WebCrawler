package com.wc.WebCrawler.parse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.StringTokenizer;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.wc.WebCrawler.util.StringUtils;
import com.wc.WebCrawler.util.WebCrawlerConstants;

public class JSoupParseEngineImpl implements ParseEngine {

	public Collection<String> getWords(String URL) throws IOException {
		Document document = null;

		Connection connection = Jsoup.connect(URL)
				.userAgent(WebCrawlerConstants.USER_AGENT).timeout(WebCrawlerConstants.TIMEOUT_INTERVAL);
		Response response = connection.execute();
		if (response.statusCode() == WebCrawlerConstants.HTTP_OK_STATUS) {
			document = connection.get();
		} else {
			System.out.println("Problem with the jsoup connection...");
		}

		Elements elementList = document.select("body");
		Collection<String> contentList = new ArrayList<String>();
		StringTokenizer tokenizer = null;
		String token = null;
		for (Element element : elementList) {
			String content = element.text();
			tokenizer = new StringTokenizer(content, " ");
			while (tokenizer.hasMoreTokens()) {
				token = StringUtils.getWholeWord(tokenizer.nextToken());
				if (token != null)
					contentList.add(token.toLowerCase());
			}
		}
		return contentList;
	}

}
