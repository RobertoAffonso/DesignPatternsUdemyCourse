package com.roberto;

public class CounterStrike {

    public static void main(String[] args) throws Exception{
	    PlayerFactory playerFactory = PlayerFactory.getInstance();
	    Player player;
	    String[] playerType = {"Terrorist", "Counter Terrorist", "Counter Terrorist", "Terrorist", "Counter Terrorist", "Terrorist"};
	    String[] weapon = {"AK-47", "M4A4", "Desert Eagle", "AWP", "Karambit", "FAMAS", "GALIL"};

	    for (int i = 0; i <= 5; i++){
	        player = playerFactory.getPlayer(playerType[i]);
	        player.assignWeapon(weapon[i]);
			System.out.println(player.toString());
        }
    }
}
