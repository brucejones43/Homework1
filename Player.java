public class Player {

    private int health;
    private double gold = 0;
    private int damage;
    private String playerClass;
    private double lootModifier;


    // Set Player characteristics based on
    // the receiving player class.
    public void Player(String playerClass) {
        switch (playerClass) {
            case "Warrior":
                this.playerClass = playerClass;
                this.health = 100;
                this.damage = 15;
                break;
            case "Thief":
                this.playerClass = playerClass;
                this.health = 75;
                this.damage = 10;
                break;
        }
    }

    public String getPlayerClass() {return playerClass;}

    public int getHealth() {
        return health;
    }

    public double getGold() {
        return gold;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setGold(double gold){
        this.gold = gold;
    }

    public void attack(Monster target) {
        target.onHit(damage);
    }

    public void onHit(int damage) {
        this.health -= damage;
    }

    public void onHeal(int health) {
        this.health += health;
    }

    public void onLoot(double gold) {
        this.gold += gold;
    }
}

