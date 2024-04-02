package logistics;

import items.Healing;
import items.Item;
import items.Material;
import items.Weapon;

import java.util.ArrayList;

public class Lobby {
    private int ID;
    private ArrayList<Player> players;
    private ArrayList<Option> options;

    public Lobby(int ID, ArrayList<Option> options) {
        this.ID = ID;
        this.options = options;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void addPlayer(Player p){
            players.add(p);
    }

    public Player getPlayer(int pos){
        return players.get(pos);
    }

    public void menu(){
        //show options
    }

    public Option getOption(int pos){
        return options.get(pos);
    }
}
