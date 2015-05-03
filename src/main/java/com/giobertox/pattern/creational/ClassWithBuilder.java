package com.giobertox.pattern.creational;

public class ClassWithBuilder {
	private String bread;
	private String meat;
	private String sauce;

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
		private String bread;
		private String meat;
		private String sauce;

		public ClassWithBuilder build() {
			return new ClassWithBuilder(this);
		}

		public Builder(String bread) {
			this.bread = bread;
		}

		public String getBread() {
			return bread;
		}

		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public String getMeat() {
			return meat;
		}

		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}

		public String getSauce() {
			return sauce;
		}

		public Builder sauce(String sauce) {
			this.sauce = sauce;
			return this;
		}
	}

}
