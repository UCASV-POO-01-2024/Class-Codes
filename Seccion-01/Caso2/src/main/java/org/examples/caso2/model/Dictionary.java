package org.examples.caso2.model;

import org.examples.caso2.model.iterators.*;
import org.examples.caso2.gui.viewers.LoginApplication;
import org.examples.caso2.model.iterators.Iterable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary implements Iterable {
    private static Dictionary instance;

    private HashMap<String, HashMap<String,String>> dictionary;

    private Dictionary() {
        dictionary = new HashMap<>();
        dictionary.put("A",new HashMap<>());
        dictionary.put("V",new HashMap<>());
        dictionary.put("N",new HashMap<>());
    }

    public static void initialize(){
        instance = new Dictionary();

        File accts = new File(LoginApplication.class.getResource("dicto.txt").getPath());
        try {
            Scanner sc = new Scanner(accts);
            while (sc.hasNextLine()) {
                String[] data = sc.nextLine().split("/");
                switch (data[2]){
                    case "A":
                        getInstance().getDictionary().get("A").put(data[0],data[1]);
                        break;
                    case "V":
                        getInstance().getDictionary().get("V").put(data[0],data[1]);
                        break;
                    case "N":
                        getInstance().getDictionary().get("N").put(data[0],data[1]);
                        break;
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred during the loading process.");
            e.printStackTrace();
        }
    }

    public static Dictionary getInstance() {
        return instance;
    }

    public HashMap<String, HashMap<String, String>> getDictionary() {
        return dictionary;
    }

    public String getInitials(){
        String acum = "";
        for( HashMap<String,String> category: dictionary.values()){
            for(String key: category.keySet()){
                if(!acum.contains( String.valueOf(key.charAt(0)) )){
                    acum += key.charAt(0);
                }
            }
        }

        return acum;
    }

    @Override
    public MyIterator createIterator(String category, String... rest) {
        MyIterator ans = null;

        switch (category){
            case "F":
                ans = new FullIterator(dictionary);
                break;
            case "L":
                ans = new LetterIterator(dictionary, rest[0]);
                break;
            default:
                ans = new CategoryIterator(dictionary, category);
        }

        return ans;
    }

    public void addWord(String word, String category, String meaning){
        switch (category){
            case "Adjetivo":
                dictionary.get("A").put(word, meaning);
                break;
            case "Verbo":
                dictionary.get("V").put(word, meaning);
                break;
            case "Sustantivo":
                dictionary.get("N").put(word, meaning);
                break;
        }
    }

    public String getMeaning(String word){
        if(dictionary.get("A").containsKey(word)){
            return dictionary.get("A").get(word);
        }
        if(dictionary.get("V").containsKey(word)){
            return dictionary.get("V").get(word);
        }
        if(dictionary.get("N").containsKey(word)){
            return dictionary.get("N").get(word);
        }

        return "";
    }

    public void saveDictionary(){
        try {
            FileWriter writer = new FileWriter(LoginApplication.class.getResource("dicto.txt").getPath(),false);

            for(Map.Entry<String,HashMap<String,String>> category : getDictionary().entrySet()){
                for(Map.Entry<String,String> entry : category.getValue().entrySet()){
                    writer.write(entry.getKey() + "/" + entry.getValue() + "/" + category.getKey()  + "\n");
                }
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Writing process failed");
        }
    }
}
