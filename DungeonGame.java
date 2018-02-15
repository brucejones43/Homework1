import java.util.Scanner;

public class DungeonGame {
	DungeonMap gameMap = new DungeonMap();
	Player player = new Player();
	private int gameMapXY = 1;
	public void play() {
		String repeat = null;
		do {
		mapSize();
		intro();
		
		gameMap.GameMap(gameMapXY, gameMapXY);
		gameMap.print();
		System.out.println(player.getPlayerClass());
		System.out.println(player.getHealth());
		System.out.println(player.getGold());

		while ((player.getHealth() > 0) && (player.getGold() < 100)/* && (gameMap.mapFull(true) == false)*/) {

			gameMessage();
			gameMap.print();
		}
		if(player.getHealth() <= 0) {
			System.out.println("YOU LOSE.");
		}
		if(player.getGold() >= 100) {
			System.out.println("Congrats, you have made enough money to pay off the evil professor!");
		}
/*		if(gameMap.mapFull(true) == false) {
			System.out.println("Ran out of open rooms and monsters to battle. you are now stuck forever.");
		}*/
		System.out.println("Play again? (y/n)");
		Scanner loop = new Scanner(System.in);
		repeat = loop.nextLine();
		}while(repeat.equalsIgnoreCase("y"));
		
		
	}
	private void gameMessage() {
		System.out.println("GP = " + player.getGold());
		System.out.println("HP = " + player.getHealth());
		System.out.println("Select a door: [W] up, [S] down, [A] left, [D] right");	
		Scanner keyInput = new Scanner(System.in);
		String key = keyInput.next();
		switch (key.toUpperCase()) {
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
		System.out.println("  Choose your class:\n 1. Warrior\n 2. Thief");
			int characterChoice = 0;
		do {
			characterChoice = scanner.nextInt();	
			if(characterChoice == 1) {
				player.Player("Warrior");
				System.out.println("Your health is " + player.getHealth());			
				gameMap.setPLAYER_MAP_POSITION("W");
			}
			if(characterChoice == 2) {
				player.Player("Thief");
				System.out.println("Your health is " + player.getHealth());
				gameMap.setPLAYER_MAP_POSITION("T");
			} 
			else{
				System.out.println("Please pick option 1 or 2");
			}
		}while(characterChoice!=1 && characterChoice != 2);
		System.out.printf("====================================================================\n");
	}
		private void mapSize() {
			System.out.println("Would you like to pick your map size? \n 1.Pick size of square \n"
					+ " 2. Default size");
			Scanner input = new Scanner(System.in);
			int choice = 0;
			do {
				choice = input.nextInt();
				switch (choice) {
				case 1:
					do {
					System.out.println("Please enter desired size.");
					Scanner size = new Scanner(System.in);
					gameMapXY = size.nextInt();

					if(gameMapXY>2) {
						System.out.printf("okay the game map will be %d x %d\n" , gameMapXY, gameMapXY);
					}
					else {
						System.out.println("Please select a size of at least 3.");
					}
				}while(gameMapXY<3);
				break;
				case 2:
					System.out.println("Okay, the default is a 10x10 board");
					gameMapXY = 10;
					break;
				default:
					System.out.println("Please pick a valid input.");
					break;
				}
			}while(choice != 1 && choice != 2);
			

		}

	public static void main(String[] args) {
		DungeonGame play = new DungeonGame();
		play.play();
	}
	
}
