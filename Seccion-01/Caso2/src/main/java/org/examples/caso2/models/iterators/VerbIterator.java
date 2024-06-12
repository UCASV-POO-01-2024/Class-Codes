package org.examples.caso2.models.iterators;

import java.util.HashMap;
import java.util.Map;

public class VerbIterator implements MyIterator {
    private HashMap<String, HashMap<String,String>> dictionary;
    private int indexState;

    public VerbIterator(HashMap<String, HashMap<String, String>> dictionary) {
        this.dictionary = dictionary;
        indexState = 0;
    }

    @Override
    public boolean hasNext() {
        return indexState < dictionary.get("V").size();
    }

    @Override
    public Map.Entry<String, String> next() {
        if(!hasNext()){
            return null;
        }

        Map.Entry<String,String> ans = (Map.Entry<String,String>) dictionary.get("V").entrySet().toArray()[indexState];
        indexState++;

        return ans;
    }
}
