package hotel.roomfactory.rooms;

public class PresidentialSuite extends Room {
    private final int numJacuzzi = 2;
    private final int numBaths = 3;
    private final int numSauna = 1;

    public PresidentialSuite(int capacidad, String roomID, String status) {
        super(capacidad, roomID, status);
    }

    public int getNumJacuzzi() {
        return numJacuzzi;
    }

    public int getNumBaths() {
        return numBaths;
    }

    public int getNumSauna() {
        return numSauna;
    }

    @Override
    public void descripcion() {
        System.out.println("Cuarto enorme con 5 camas, 3 baños, 2 jacuzzi y 1 sauna.");
    }

    @Override
    public void funcionalidad() {
        System.out.println("Hace lo que querrás.");
    }
}
