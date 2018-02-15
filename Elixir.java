import java.util.Random;

public class Elixir{
    public void run(Player name) {
        Random heal = new Random();
        int health = heal.nextInt(12);
        name.onHeal(health);
        System.out.println("You gained " + health + " health");
        }
    }
