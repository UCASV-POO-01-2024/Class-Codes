package org.examples.caso2.models.iterators;

import java.util.HashMap;
import java.util.Map;

public class NounIterator implements MyIterator {
    private HashMap<String, HashMap<String,String>> dictionary;
    private int indexState;

    public NounIterator(HashMap<String, HashMap<String, String>> dictionary) {
        this.dictionary = dictionary;
        indexState = 0;
    }

    @Override
    public boolean hasNext() {
        return indexState < dictionary.get("N").size();
    }

    @Override
    public Map.Entry<String, String> next() {
        if(!hasNext()){
            return null;
        }

        Map.Entry<String,String> ans = (Map.Entry<String,String>) dictionary.get("N").entrySet().toArray()[indexState];
        indexState++;

        return ans;
    }
}
