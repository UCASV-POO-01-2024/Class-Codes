package logistics;

import java.util.ArrayList;
import locations.Map;

public class Match {
    private int ID;
    private Mode mode;
    private ArrayList<Player> players;
    private Map map;
    private String status;

    public Match(int ID, Mode mode, ArrayList<Player> players, Map map) {
        this.ID = ID;
        this.mode = mode;
        this.players = players;
        this.map = map;
        status = "standby";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void start(){
        status = "online";
    }

    public void finish(){
        status = "finished";
    }
}
