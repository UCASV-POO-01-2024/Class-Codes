package hotel.roomfactory.rooms;

public class SingleRoom extends Room {
    private final int numBeds = 1;

    public SingleRoom(String ID, int number, int capacity, double area) {
        super(ID, number, capacity, area);
    }

    public int getNumBeds() {
        return numBeds;
    }

    @Override
    public String description() {
        return "Cuarto pequeño con una sola cama.";
    }

    @Override
    public String functionality() {
        return "No mucho, solo acuestate en la cama.";
    }
}
