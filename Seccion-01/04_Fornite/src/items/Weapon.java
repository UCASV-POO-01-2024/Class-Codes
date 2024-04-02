package items;

public class Weapon extends Item {
    private int numberShots;
    private float damage;
    private int durability;
    private String condition;

    public Weapon(int ID, String name, int numberShots, float damage, int durability) {
        super(ID, name, durability);
        this.numberShots = numberShots;
        this.damage = damage;
        this.durability = durability;
        this.condition = "perfect";
    }

    public int getNumberShots() {
        return numberShots;
    }

    public void setNumberShots(int numberShots) {
        this.numberShots = numberShots;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public void shoot(){
        System.out.println("BANG!");
        receiveDamage(5);
    }

    private void receiveDamage(int dmg){
        durability -= dmg;
        if(durability <= 0){
            condition = "broken";
        }
    }
}
