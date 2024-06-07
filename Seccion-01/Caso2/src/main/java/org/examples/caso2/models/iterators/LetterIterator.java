package org.examples.caso2.models.iterators;

import java.util.HashMap;
import java.util.Map;

public class LetterIterator implements MyIterator {
    private HashMap<String, HashMap<String,String>> dictionary;
    private String letter;
    private int indexState;

    public LetterIterator(HashMap<String, HashMap<String, String>> dictionary, String letter) {
        this.dictionary = dictionary;
        this.letter = letter;
        this.indexState = 0;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Map.Entry<String, String> next() {
        return null;
    }
}
