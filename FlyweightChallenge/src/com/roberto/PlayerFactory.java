package com.roberto;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

    Map<String, Player> players = new HashMap<>();

    public Player getPlayer(String player) throws Exception {
        Player newPlayer;
        if(this.players.containsKey(player)){
            return this.players.get(player);
        } else {
            newPlayer = createNewPlayer(player);
            this.players.put(player, newPlayer);
        }
        return newPlayer;
    }

    private Player createNewPlayer(String player) throws Exception {
        switch (player){
            case "Counter Terrorist":
                System.out.println("Counter Terrorist Created");
                Player ct = new CounterTerrorist();
                return ct;
            case "Terrorist":
                System.out.println("Terrorist Created");
                Player t = new Terrorist();
                return t;
            default:
                throw new Exception("Player not found, it must be a Terrorist or Counter Terrorist.");
        }
    }

    public static PlayerFactory getInstance(){
        return PlayerFactoryHelper.instance;
    }

    private static final class PlayerFactoryHelper {
        private static final PlayerFactory instance = new PlayerFactory();
    }
}
