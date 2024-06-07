package org.examples.caso2.models;

import org.examples.caso2.gui.viewers.LoginApplication;
import org.examples.caso2.models.iterators.*;
import org.examples.caso2.models.iterators.Iterable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Dictionary implements Iterable{

    private HashMap<String,HashMap<String,String>> dictionary;

    private static Dictionary instance;

    private Dictionary(){
        dictionary = new HashMap<>();
    }

    public static void init() {
        instance = new Dictionary();
        File dicto = new File(LoginApplication.class.getResource("dicto.txt").getPath());
        try {
            Scanner myReader = new Scanner(dicto);

            HashMap<String,String> adjectives = new HashMap<>();
            HashMap<String,String> verbs = new HashMap<>();
            HashMap<String,String> nouns = new HashMap<>();

            while (myReader.hasNextLine()) {
                String entry = myReader.nextLine();
                String[] parts = entry.split("/");

                switch (parts[2]){
                    case "A":
                        adjectives.put(parts[0], parts[1]);
                        break;
                    case "V":
                        verbs.put(parts[0], parts[1]);
                        break;
                    case "N":
                        nouns.put(parts[0], parts[1]);
                        break;
                }
            }
            getInstance().getDictionary().put("A", adjectives);
            getInstance().getDictionary().put("V", verbs);
            getInstance().getDictionary().put("N", nouns);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static Dictionary getInstance(){
        return instance;
    }

    public HashMap<String, HashMap<String, String>> getDictionary() {
        return dictionary;
    }

    public String getInitials(){
        MyIterator iter = createIterator("F");
        String acum = "";

        while(iter.hasNext()){
            Character first = iter.next().getKey().charAt(0);
            if(!acum.contains(first.toString())){
                acum += first.toString().toUpperCase();
            }
        }

        return acum;
    }

    @Override
    public MyIterator createIterator(String... type) {

        MyIterator iter;
        switch (type[0]){
            case "F":
                iter = new FullIterator(dictionary);
                break;
            case "A":
                iter = new AdjectiveIterator(dictionary);
                break;
            case "V":
                iter = new VerbIterator(dictionary);
                break;
            case "N":
                iter = new NounIterator(dictionary);
                break;
            case "L":
                iter = new LetterIterator(dictionary,type[1]);
                break;
            default:
                iter = null;
        }

        return iter;
    }
}
