import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;
public class DungeonGame {
	private DungeonMap map; 
	private Player player;
	DungeonMap gameMap = new DungeonMap();
	Player choice = new Player();
	public void play() {
		int gameMapXY = 1;

		intro();
		
		gameMap.GameMap(10, 10);
		gameMap.print();
		while ((choice.getHealth() != 0) || (choice.getGold() >= 100)) {
		gameMessage();
		gameMap.print();
		}
		
		
	}
	private void gameMessage() {
		System.out.println("GP = " + choice.getGold());
		System.out.println("HP = " + choice.getHealth());
		System.out.println("Select a door: [W] up, [S] down, [A] left, [D] right");	
		Scanner keyInput = new Scanner(System.in);
		String key = keyInput.next();
		switch (key) {
		case "W":
			gameMap.movePlayerUp();
			break;
		case "S":
			gameMap.movePlayerDown();
			break;
		case "A":
			gameMap.movePlayerLeft();
			break;
		case "D":
			gameMap.movePlayerRight();
			break;
		default:
			System.out.println("invalid move");
			break;
		}
	}
	private void intro() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("====================================================================\n"
				+ "You are in a dungeon!! \nThere are "
				+ "monsters, bags of gold, and healing elixirs "
				+ "in each room. \nCan you find 100 gold pieces "
				+ "and pay the evil professor to let you \nout before "
				+ "the monsters kill you?\n");
		System.out.println("  Choose your class:\n"
				+ "      1. Warrior\n      2. Thief");
		String playerClass = null;
		int characterChoice = scanner.nextInt();
		
		if(characterChoice == 1) {
			playerClass = "Warrior";
			Player warrior = new Player();
			choice.Player(playerClass);
			System.out.println("Your health is " + choice.getHealth());			
			gameMap.setPLAYER_MAP_POSITION("W");
		}
		if(characterChoice == 2) {
			playerClass = "Thief";
			Player Thief = new Player();
			choice.Player(playerClass);
			System.out.println("Your health is " + choice.getHealth());
			gameMap.setPLAYER_MAP_POSITION("T");
		}
		System.out.printf("====================================================================\n");
	}


	public static void main(String[] args) {
		DungeonGame play = new DungeonGame();
		play.play();
	}
	
}
