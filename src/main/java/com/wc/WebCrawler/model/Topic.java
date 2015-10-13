package com.wc.WebCrawler.model;

/**
 * A topic that occurs in a web page. From a topic, you can extract the text
 * associated with that topic and the frequency of occurrence.
 * 
 * @author srikrishnan_suresh
 * @version 1.0
 * @since 1.0
 */
public class Topic implements Comparable<Topic> {
	private String text;
	private Integer frequency;

	/**
	 * Create a new topic with the given text and frequency.
	 * 
	 * @param text
	 *            The text
	 * @param frequency
	 *            Frequence of the text in the web page
	 */
	public Topic(String text, Integer frequency) {
		this.text = text;
		this.frequency = frequency;
	}

	/**
	 * Create a new topic with the given text. Frequency is assigned as 0.
	 * 
	 * @param text
	 *            The text
	 */
	public Topic(String text) {
		this(text, 0);
	}

	/**
	 * Get the text associated with the topic
	 * 
	 * @return The text of the topic
	 */
	public String getText() {
		return text;
	}

	/**
	 * Set the text associated with the topic
	 * 
	 * @param text
	 *            The text of the topic
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Get the frequency associated with the topic
	 * 
	 * @return The frequency of the topic
	 */
	public Integer getFrequency() {
		return frequency;
	}

	/**
	 * Set the frequency associated with the topic
	 * 
	 * @param frequency
	 *            The frequency of the topic
	 */
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	/**
	 * Two topics are equal if the text is equal irrespective of the frequency.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Topic other = (Topic) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[text=" + text + ", frequency=" + frequency + "]";
	}

	public int compareTo(Topic that) {
		return this.frequency.compareTo(that.frequency);
	}

}
