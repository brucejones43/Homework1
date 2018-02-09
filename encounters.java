import java.util.Random;
public class encounters {
	
	public String mapEncounters(String encounter) {
	  
		Random encounters = new Random();
		int random = encounters.nextInt(2);
		if (random == 0) {
			return "loot";
		}
		else if (random == 1) {
			return "mob";
		}
		else{
			return "elixir";
		}
	}
	public int loot() {
		Random loot = new Random();
		return loot.nextInt(15);	  
	}

	public int elixir() {
		Random elixir = new Random();
		return elixir.nextInt(5);
	}
}

	  
