import java.util.Scanner; 

public class Combat(Player name){

  public void run() {
    Monster mob = new Monster;
    System.out.println("You are fighting a " + mob.getMonsterType());
    Scanner fightCommands = new Scanner(System.in);
    theCombat();

    while (fightCommands.equals("fight")) {
      mob.onHit(name.getDamage());
      name.onHit(mob.getDamage());
      theCombat();

    }
    if (fightCommands.equals("flee")) {
      name.onHit(mob.getDamage);
      System.out.println("The monster hit you during your escape. You have " + name.getHealth + " health left.");
    }
    else {
      System.out.println("That is not an appropriate command");
      theCombat();
    }
  }

  public static void theCombat() {
    System.out.println ("Your health is " + name.getHealth);
    System.out.println ("fight or flee?");
    String s = fightCommands.nextLine();
  }
}
