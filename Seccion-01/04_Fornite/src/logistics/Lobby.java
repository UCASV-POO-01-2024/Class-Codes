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
        players = new ArrayList<Player>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Option> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<Option> options) {
        this.options = options;
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
