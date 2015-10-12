package com.wc.WebCrawler.model;

public class Topic implements Comparable<Topic> {
	private String text;
	private Integer frequency;

	public Topic(String text, Integer frequency) {
		this.text = text;
		this.frequency = frequency;
	}

	public Topic(String text) {
		this(text, 0);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getFrequency() {
		return frequency;
	}

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
