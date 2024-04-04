import items.Item;
import locations.Storm;
import logistics.*;
import locations.Map;
import util.GameUtilities;
import util.GeneralUtilities;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Game {
    private static Lobby lobby;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("             FORTNITE               ");
        System.out.println("*************************************");
        System.out.println("How many players are playing?");
        int numPlayers = GeneralUtilities.readInteger();

        Option opt1 = new Option(1,"Select Character","Choose one of our awesome and cool characters.");
        Option opt2 = new Option(2,"Select Accessories","Customize and create your own personal style.");
        ArrayList<Option> options = new ArrayList<Option>();
        options.add(opt1);
        options.add(opt2);
        lobby = new Lobby(1,options);

        receivePlayers(numPlayers);
        Map map = mapSelection();
        Mode mode = modeSelection();

        Match match = new Match(1,mode,lobby.getPlayers(),map);
        System.out.println("Please wait while we prepare your match...");
        TimeUnit.SECONDS.sleep(10); //Aquí debería manejarse una Exception

        System.out.println("Let the match begin!!");
        run(match);
    }

    private static void receivePlayers(int n){
        for(int i = 0; i < n; ++i){
            lobby.addPlayer(Player.createPlayer());
        }
    }

    private static Map mapSelection(){
        System.out.println("Where do you want to play?");
        System.out.println("1. Ukraine");
        System.out.println("2. Gaza");
        int opt = GeneralUtilities.readInteger();

        Storm storm = new Storm(1,"dangerous",25);
        ArrayList<Item> items = GameUtilities.generateItems();

        Map m = null;
        switch (opt){
            case 1: m = new Map(1,"Ukraine",2000,1000,"Vodka",storm,items); break;
            case 2: m = new Map(1,"Gaza",1500,800,"Lisan al-Gaib",storm,items); break;
        }

        return m;
    }

    private static Mode modeSelection(){
        System.out.println("How do you want to play?");
        System.out.println("1. Free-for-all");
        System.out.println("2. Teams");
        int opt = GeneralUtilities.readInteger();

        Mode m = null;
        switch (opt){
            case 1: m = new Mode(1,"Free-for-all","Everybody can hit anybody."); break;
            case 2: m = new Mode(2,"Teams","Don't hit your teammates ;)."); break;
        }

        return m;
    }

    private static void run(Match match){
        //TODO
    }
}

