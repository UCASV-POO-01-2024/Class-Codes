package org.examples.caso2.model.iterators;

public interface Iterable {
    public MyIterator createIterator(String category, String... rest);
}
