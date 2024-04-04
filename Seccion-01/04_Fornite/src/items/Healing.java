package items;

public class Healing extends Item {
    private int numberUses;
    private int restoreAmount;

    public Healing(int ID, String name, int numberUses, int restoreAmount) {
        super(ID, name);
        this.numberUses = numberUses;
        this.restoreAmount = restoreAmount;
    }

    public int getNumberUses() {
        return numberUses;
    }

    public void setNumberUses(int numberUses) {
        this.numberUses = numberUses;
    }

    public int getRestoreAmount() {
        return restoreAmount;
    }

    public void setRestoreAmount(int restoreAmount) {
        this.restoreAmount = restoreAmount;
    }

    public void restoreHealth(){
        if(numberUses != 0) {
            System.out.println("*Pokemon Center Sounds*");
            numberUses--;
        }else{
            System.out.println("<No stock available>");
        }
    }


}
