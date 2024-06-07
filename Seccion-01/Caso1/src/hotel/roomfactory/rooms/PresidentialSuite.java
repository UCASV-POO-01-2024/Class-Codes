package hotel.roomfactory.rooms;

public class PresidentialSuite extends Room {
    private final int numBeds = 5;
    private final int numBaths = 3;
    private final int numJacuzzi = 2;
    private final int numSaunas = 1;

    public PresidentialSuite(String ID, int number, int capacity, double area) {
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

    public int getNumSaunas() {
        return numSaunas;
    }

    @Override
    public String description() {
        return "Cuarto enorme con dos camas matrimoniales, tres camas pequeñas, dos jacuzzi, 3 baños y un salón de sauna.";
    }

    @Override
    public String functionality() {
        return "A este punto, hagan lo que quieran!";
    }
}
