package com.giobertox.pattern.creational;

import org.apache.commons.lang3.StringUtils;

public class ClassWithBuilder {
	private final String bread;
	private final String meat;
	private final String sauce;

	public ClassWithBuilder(Builder builder) {
		bread = builder.getBread();
		meat = builder.getMeat();
		sauce = builder.getSauce();
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

	public static class Builder {
		private final String bread; // mandatory
		private String meat; // optional
		private String sauce; // optional

		public ClassWithBuilder build() {
			ClassWithBuilder classWithBuilder = new ClassWithBuilder(this);
			if (classWithBuilder.getMeat().equals("horse")) {
				throw new IllegalStateException("Not allowed in here"); // thread-safe
			}
			assert classWithBuilder.isConsistent();
			return classWithBuilder;
		}

		public Builder(String bread) {
			this.bread = bread;
		}

		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}

		public Builder sauce(String sauce) {
			this.sauce = sauce;
			return this;
		}

		public String getMeat() {
			return meat;
		}

		public String getBread() {
			return bread;
		}

		public String getSauce() {
			return sauce;
		}
	}

	public boolean isConsistent() {
		return StringUtils.isNotEmpty(this.getBread());
	}
}
