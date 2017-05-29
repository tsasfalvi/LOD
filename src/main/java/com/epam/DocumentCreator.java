package com.epam;

import com.epam.domain.Document;
import com.epam.domain.Line;
import com.epam.domain.Paragraph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DocumentCreator {

	public Document createDocument() {
		List<Paragraph> paragraphs = new ArrayList<Paragraph>();
		paragraphs.add(new Paragraph(Arrays.asList(new Line("A line."), new Line("Another line."))));
		paragraphs.add(new Paragraph(Arrays.asList(new Line("Second paragraph"))));
		paragraphs.add(new Paragraph(Arrays.asList(new Line("This is the end :("))));

		return new Document(paragraphs);
	}

}
