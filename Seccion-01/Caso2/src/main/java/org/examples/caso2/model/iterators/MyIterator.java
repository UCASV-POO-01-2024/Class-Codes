package org.examples.caso2.model.iterators;

import java.util.Map;

public interface MyIterator {
    public boolean hasNext();
    public Map.Entry<String,String> next();
}
