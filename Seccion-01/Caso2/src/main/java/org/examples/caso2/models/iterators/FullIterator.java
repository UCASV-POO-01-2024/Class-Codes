package org.examples.caso2.models.iterators;

import java.util.HashMap;
import java.util.Map;

public class FullIterator implements MyIterator {
    private HashMap<String,HashMap<String,String>> dictionary;
    private String categoryState;
    private int indexState;

    public FullIterator(HashMap<String, HashMap<String, String>> dictionary) {
        this.dictionary = dictionary;
        categoryState = "A";
        indexState = 0;
    }

    @Override
    public boolean hasNext() {
        boolean ans;
        switch (categoryState) {
            case "A":
                ans = indexState < dictionary.get("A").size() || dictionary.get("V").size() != 0 || dictionary.get("N").size() != 0;
                break;
            case "V":
                ans = indexState < dictionary.get("V").size() || dictionary.get("N").size() != 0;
                break;
            case "N":
                ans = indexState < dictionary.get("N").size();
                break;
            default:
                ans = false;
        }

        return ans;
    }

    private String updateCategoryState(){
        if(categoryState.equals("A")){
            return "V";
        }
        if(categoryState.equals("V")){
            return "N";
        }
        return null;
    }

    @Override
    public Map.Entry<String,String> next() {
        if(!hasNext()){
           return null;
        }

        Map.Entry<String,String> ans = null;
        while(categoryState != null){
            if(indexState >= dictionary.get(categoryState).size()){
                indexState = 0;
                categoryState = updateCategoryState();
                continue;
            }
            ans = (Map.Entry<String,String>) dictionary.get(categoryState).entrySet().toArray()[indexState];
            indexState++;
            break;
        }

        return ans;
    }
}
