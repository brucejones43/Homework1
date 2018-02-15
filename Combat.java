import java.util.Scanner;
import java.util.Random;

public class Combat{

    public void run(Player name) {
        Random random = new Random();
        int mobType = random.nextInt(3);

        String theMonster = null;

        switch (mobType + 1) {
            case 1:
                theMonster = "Goblin";
                break;
            case 2:
                theMonster = "Zombie";
                break;
            case 3:
                theMonster = "Orc";
                break;
            case 4:
                theMonster = "Deneke";
                break;
        }

        Monster mob = new Monster(theMonster);

        System.out.println("You are fighting a " + mob.getMonsterType());
        Scanner fightCommands = new Scanner(System.in);
        String fight;
        fight = theCombat(name);

        while (fight.equals("fight") && name.getHealth() > 0) {
            mob.onHit(name.getDamage());
            name.onHit(mob.getDamage());
            fight = theCombat(name);
        }

        if (fightCommands.equals("flee")) {
            name.onHit(mob.getDamage());
            System.out.println("The monster hit you during your escape. You have " + name.getHealth() + " health left.");
        }
        else {
            System.out.println("That is not an appropriate command");
            theCombat(name);
        }
    }

    public String theCombat(Player name) {
        Scanner fightCommands = new Scanner(System.in);
        System.out.println ("Your health is " + name.getHealth());
        System.out.println ("fight or flee?");
        String s = fightCommands.nextLine();

        return s;
    }
}
