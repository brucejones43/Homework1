import java.util.Random;

public class Loot {

        public void run(Player name) {
        Random loot = new Random();

        double gold = loot.nextInt(12);

        if (name.getPlayerClass().equals("Thief")) {
                 gold = gold * 1.2;
        }

        name.onLoot(gold);
        System.out.println("You found " + gold + " gold.");
        }
}

