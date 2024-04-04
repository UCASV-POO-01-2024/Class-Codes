package items;

public class Weapon extends Item {
    private int numberShots;
    private double damage;
    private int durability;
    private String condition;

    public Weapon(int ID, String name, int numberShots, double damage, int durability) {
        super(ID, name);
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

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
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
