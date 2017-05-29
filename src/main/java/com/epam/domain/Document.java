package com.epam.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Document implements Printable {

	private final List<Paragraph> paragraphs;

	public Document(final List<Paragraph> paragraphs) {
		List<Paragraph> copyList = new ArrayList<>();
		copyList.addAll(paragraphs);
		this.paragraphs = copyList;
	}

	public Iterable<Paragraph> getParagraphs() {
		return Collections.unmodifiableCollection(paragraphs);
	}

	public void print() {
		for (Paragraph paragraph : getParagraphs()) {
			paragraph.print();
			System.out.println();
		}
	}
}
