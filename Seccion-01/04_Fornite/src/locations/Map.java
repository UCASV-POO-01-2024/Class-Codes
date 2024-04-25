package locations;

import items.Item;
import logistics.Player;

import java.util.ArrayList;

public class Map {
    private int ID;
    private String name;
    private float width;
    private float height;
    private String characteristics;
    private Storm storm;
    private ArrayList<Item> items;
    private ArrayList<Construction> constructions;

    public Map(int ID, String name, float width, float height, String characteristics, Storm storm, ArrayList<Item> items) {
        this.ID = ID;
        this.name = name;
        this.width = width;
        this.height = height;
        this.characteristics = characteristics;
        this.storm = storm;
        this.items = items;
        constructions = new ArrayList<Construction>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public Storm getStorm() {
        return storm;
    }

    public void setStorm(Storm storm) {
        this.storm = storm;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addConstruction(Construction c){
        constructions.add(c);
    }

    public Construction getConstruction(int pos){
        return constructions.get(pos);
    }

    public void advanceStorm(){
        storm.advance();
    }

    public void respawnPlayer(int pos){
        //reallocate a player
    }
    public void respawnItem(int pos){
        //reallocate an item
    }
}
