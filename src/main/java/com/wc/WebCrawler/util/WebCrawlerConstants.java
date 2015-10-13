package com.wc.WebCrawler.util;

/**
 * A collection of constants that can be used by the client to send web crawling
 * requests.
 * 
 * @author srikrishnan_suresh
 * @version 1.0
 */
public interface WebCrawlerConstants {
	/**
	 * User agent request that will be sent as part of the header in the
	 * request.
	 */
	public static final String USER_AGENT = "Mozilla";
	/**
	 * Request timeout interval.
	 */
	public static final Integer TIMEOUT_INTERVAL = 10000;
	
	/**
	 * HTTP code for OK status. Value is 200.
	 */
	public static final Integer HTTP_OK_STATUS = 200;
}
