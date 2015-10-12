package com.wc.WebCrawler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.wc.WebCrawler.analyzer.WordDensityAnalyzerImpl;
import com.wc.WebCrawler.filter.FrequentWordsFilterImpl;
import com.wc.WebCrawler.model.Topic;
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
		expected = "Test123";
		actual = StringUtils.getWholeWord(input);
		assertEquals(expected, actual);
		
		input = "123-Pass";
		expected = "123-Pass";
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
	
	public void testStringRemovalFromFrequentWords() {
		Collection<String> inputList = new ArrayList<String>(Arrays.asList(new String[]{"this","Stripe","also","well","Light"}));
		Collection<String> expected = new ArrayList<String>(Arrays.asList(new String[]{"Stripe","Light"}));
		Collection<String> actual = new FrequentWordsFilterImpl().filterWordList(inputList);
		assertEquals(expected, actual);
	}
	
	public void testWordsDensity() {
		List<String> input = new ArrayList<String>();
		input.add("Test1");input.add("Test1");input.add("Test1");input.add("Test1");
		input.add("Test2");input.add("Test2");input.add("Test2");
		input.add("Test3");input.add("Test3");
		List<Topic> topicList = new WordDensityAnalyzerImpl().getWordDensity(input);
		Integer expected,actual;
		
		actual = topicList.get(0).getFrequency();
		expected = 4;
		assertEquals(expected,actual);
		
		actual = topicList.get(1).getFrequency();
		expected = 3;
		assertEquals(expected,actual);
		
		actual = topicList.get(2).getFrequency();
		expected = 2;
		assertEquals(expected,actual);
	}
}
