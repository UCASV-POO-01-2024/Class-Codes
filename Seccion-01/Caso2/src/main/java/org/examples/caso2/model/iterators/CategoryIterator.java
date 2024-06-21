package org.examples.caso2.model.iterators;

import java.util.HashMap;
import java.util.Map;

public class CategoryIterator implements MyIterator {
    private HashMap<String, HashMap<String, String>> dictionary;
    private int indexState;
    private String categoryState;

    public CategoryIterator(HashMap<String, HashMap<String, String>> dictionary, String categoryState) {
        this.dictionary = dictionary;
        this.categoryState = categoryState;
        indexState = 0;
    }

    @Override
    public boolean hasNext() {
        return indexState < dictionary.get(categoryState).size();
    }

    @Override
    public Map.Entry<String, String> next() {
        Map.Entry<String, String> ans = (Map.Entry<String, String>) dictionary.get(categoryState).entrySet().toArray()[indexState];
        indexState++;
        return ans;
    }
}
