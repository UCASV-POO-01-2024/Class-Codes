package hotel.roomfactory.rooms;

public class DoubleRoom extends Room {
    private final int numBeds = 2;

    public DoubleRoom(String ID, int number, int capacity, double area) {
        super(ID, number, capacity, area);
    }

    public int getNumBeds() {
        return numBeds;
    }

    @Override
    public String description() {
        return "Cuarto mediano con dos camas.";
    }

    @Override
    public String functionality() {
        return "Hay más espacio, pueden estar 1 cada cama, o 2 y 1, o 2 y 2.";
    }
}
