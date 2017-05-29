package com.epam.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class Paragraph implements Printable {

    private final List<Line> lines;

    public Paragraph(final Collection<Line> lines) {
        List<Line> copyList = new ArrayList<Line>();
        copyList.addAll(lines);
        this.lines = copyList;
    }

    private Iterable<Line> getLines() {
        return Collections.unmodifiableCollection(lines);
    }

    @Override
    public void print() {
        for (Line line : getLines()) {
            line.print();
        }
    }
}
