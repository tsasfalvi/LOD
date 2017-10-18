package com.domain;

public final class Line implements Printable {

	private final String content;

	public Line(final String content) {
		this.content = content;
	}

	private String getContent() {
		return content;
	}

	@Override
	public void print() {
		System.out.println(getContent());
	}
}
