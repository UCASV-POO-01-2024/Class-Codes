package org.examples.caso2.models.iterators;

import java.util.HashMap;
import java.util.Map;

public class LetterIterator implements MyIterator {
    private HashMap<String,HashMap<String,String>> dictionary;
    private String letter;
    private String categoryState;
    private int indexState;
    private int total;

    public LetterIterator(HashMap<String, HashMap<String, String>> dictionary, String letter) {
        this.dictionary = dictionary;
        this.letter = letter;
        categoryState = "A";
        indexState = 0;
        total = countWords();
    }

    private int countWords() {
        int cont = 0;
        for(HashMap<String,String> category : dictionary.values()) {
            for(String word : category.keySet()) {
                if(String.valueOf(word.charAt(0)).equals(letter)) {
                    cont++;
                }
            }
        }

        return cont;
    }

    @Override
    public boolean hasNext() {
        return total > 0;
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

            if(!(String.valueOf(ans.getKey().charAt(0)).equals(letter))){
                ans = null;
                indexState++;
                continue;
            }

            total--;
            indexState++;
            break;
        }

        return ans;
    }
}
