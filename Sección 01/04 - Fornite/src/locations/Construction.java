package locations;

public class Construction {
    private int ID;
    private String characteristics;
    private int durability;
    private String condition;

    public Construction(){

    }

    public Construction(int ID, String characteristics, int durability) {
        this.ID = ID;
        this.characteristics = characteristics;
        this.durability = durability;
        condition = "perfect";
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

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void receiveDamage(int dmg){
        durability -= dmg;
        if(durability <= 0){
            condition = "broken";
        }
    }
}
