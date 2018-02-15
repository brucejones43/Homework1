import java.util.Random;

public class Encounters {
    public void encounters(Player name) {

        Loot gold = new Loot();
        Combat battle = new Combat();
        Elixir potion = new Elixir();

        Random newEncounter = new Random();
        int random = newEncounter.nextInt(2);
        if (random == 0) {
            gold.run(name);
        }
        if (random == 1) {
            battle.run(name);
        }
        if (random == 2) {
            potion.run(name);

        }
    }
}
