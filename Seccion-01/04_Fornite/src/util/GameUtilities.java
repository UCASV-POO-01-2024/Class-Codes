package util;

import items.Healing;
import items.Item;
import items.Material;
import items.Weapon;

import java.util.ArrayList;

public class GameUtilities {
    public static ArrayList<Item> generateItems(){
        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Weapon(1,"Shotgun",5,20.5,150));
        items.add(new Weapon(2,"Handgun",20,10.3,100));
        items.add(new Healing(1,"potion",3,20));
        items.add(new Healing(2,"hamburger",2,15));
        items.add(new Material(1,"cement","stone","resistant","inflexible"));
        items.add(new Material(2,"iron sheet","metal","resistant","melt-able"));

        return items;
    }
}
