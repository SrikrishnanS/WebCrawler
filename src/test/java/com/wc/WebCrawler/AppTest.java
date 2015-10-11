package com.wc.WebCrawler;

import com.wc.WebCrawler.util.StringUtils;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}
	
	public void testStringWholeWordMatch() {
		String input,expected,actual;
		
		input = "String";
		expected = "String";
		actual = StringUtils.getWholeWord(input);
		assertEquals(expected, actual);
		
		input = "Test123";
		expected = "Test";
		actual = StringUtils.getWholeWord(input);
		assertEquals(expected, actual);
		
		input = "123-Fail";
		expected = "Fail";
		actual = StringUtils.getWholeWord(input);
		assertEquals(expected, actual);
		
		input = "123345";
		expected = null;
		actual = StringUtils.getWholeWord(input);
		assertEquals(expected, actual);
		
		input = "$10";
		expected = null;
		actual = StringUtils.getWholeWord(input);
		assertEquals(expected, actual);
		
		input = "\"Try\"";
		expected = "Try";
		actual = StringUtils.getWholeWord(input);
		assertEquals(expected, actual);
		
		input = "(This";
		expected = "This";
		actual = StringUtils.getWholeWord(input);
		assertEquals(expected, actual);
		
		input = "Pre-order";
		expected = "Pre-order";
		actual = StringUtils.getWholeWord(input);
		assertEquals(expected, actual);
		
		input = "Test's";
		expected = "Test";
		actual = StringUtils.getWholeWord(input);
		assertEquals(expected, actual);
	}	
}
