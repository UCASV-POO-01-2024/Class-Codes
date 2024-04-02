package locations;

public class Storm {
    private int ID;
    private String characteristics;
    private int damage;

    public Storm(int ID, String characteristics, int damage) {
        this.ID = ID;
        this.characteristics = characteristics;
        this.damage = damage;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void advance(){
        //advance the storm
    }

    public void dealDamage(){
        System.out.println("I, the mighty storm, deal you "+damage+" points of damage!");
    }
}
