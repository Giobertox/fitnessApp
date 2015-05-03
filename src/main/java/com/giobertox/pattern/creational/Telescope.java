package com.giobertox.pattern.creational;

public class Telescope {

	private String bread;
	private String meat;
	private String sauce;

	public Telescope(String bread) {
		super();
		this.bread = bread;
	}

	public Telescope(String bread, String meat) {
		this(bread);
		this.meat = meat;
	}

	public Telescope(String bread, String meat, String sauce) {
		this(bread, meat);
		this.sauce = sauce;
	}

	public String getBread() {
		return bread;
	}

	public String getMeat() {
		return meat;
	}

	public String getSauce() {
		return sauce;
	}
}
