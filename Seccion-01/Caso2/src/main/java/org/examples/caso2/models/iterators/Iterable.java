package org.examples.caso2.models.iterators;

public interface Iterable {
    public MyIterator createIterator(String... type);
}
