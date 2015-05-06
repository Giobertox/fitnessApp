package com.giobertox.system;

public enum Color {

	RED("red"), GREEN("green"), BLUE("blue");

	private final String colorName;

	private Color(String colorName) {
		this.colorName = colorName;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public String printColor() {
		return colorName;
	}
}
