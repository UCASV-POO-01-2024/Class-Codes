package logistics;
import items.*;
import locations.Construction;

import java.util.*;

public class Player {
    private int ID;
    private String nickname;
    private String country;
    private String status;
    private int HP;
    private ArrayList<Weapon> weapons;
    private ArrayList<Healing> healingItems;
    private ArrayList<Material> materials;

    public Player(int ID, String nickname, String country) {
        this.ID = ID;
        this.nickname = nickname;
        this.country = country;
        status = "alive";
        HP = 100; //100%
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addItem(Item i){
        if(i instanceof Weapon){
            weapons.add((Weapon) i);
        }
        if(i instanceof Healing){
            healingItems.add((Healing) i);
        }
        if(i instanceof Material){
            materials.add((Material) i);
        }
    }

    public Item getItem(String type, int pos){
        switch(type){
            case "W": return weapons.get(pos);
            case "H": return healingItems.get(pos);
            case "M": return materials.get(pos);
            default: return null;
        }
    }

    public void attack(int pos){
        //Use this
        weapons.get(pos);
    }

    public void heal(int pos){
        //Use this
        healingItems.get(pos);
    }

    public Construction build(int pos){
        //Use this
        materials.get(pos);

        Construction c = new Construction();
        return c;
    }

    public void receiveDamage(int dmg){
        HP -= dmg;
        if(HP <= 0){
            status = "dead";
        }
    }
}
