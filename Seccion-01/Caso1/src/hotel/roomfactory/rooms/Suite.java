package hotel.roomfactory.rooms;

public class Suite extends Room {
    private final int numBeds = 3;
    private final int numBaths = 1;
    private final int numJacuzzi = 1;

    public Suite(String ID, int number, int capacity, double area) {
        super(ID, number, capacity, area);
    }

    public int getNumBeds() {
        return numBeds;
    }

    public int getNumBaths() {
        return numBaths;
    }

    public int getNumJacuzzi() {
        return numJacuzzi;
    }

    @Override
    public String description() {
        return "Cuarto grande con una cama matrimonial y dos camas pequeñas. Cuenta con un baño y un jacuzzi.";
    }

    @Override
    public String functionality() {
        return "Además de dormir, se pueden hacer fiestas.";
    }
}
