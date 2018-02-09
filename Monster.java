public class Monster {
    private int health;
    private int damage;
    private String monsterType;

    // Set Monster characteristics based on
    // the receiving player class.
    public Monster (String monsterType) {
        switch (monsterType) {
            case "Goblin":
                this.monsterType = monsterType;
                this.health = 6;
                this.damage = 10;
                break;
            case "Zombie":
                this.monsterType = monsterType;
                this.health = 12;
                this.damage = 15;
                break;
            case "Orc":
                this.monsterType = monsterType;
                this.health = 18;
                this.damage = 20;
                break;
            case "Deneke":
                this.monsterType = monsterType;
                this.health = 55;
                this.damage = 5;
                break;
        }
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack (Player target) {
        target.onHit(damage);
    }

    public void onHit(int damage) {
        this.health -= health;
    }
}
