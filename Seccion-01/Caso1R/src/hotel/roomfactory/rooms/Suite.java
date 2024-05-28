package hotel.roomfactory.rooms;

public class Suite extends Room {
    private final int numJacuzzi = 1;

    public Suite(int capacidad, String roomID, String status) {
        super(capacidad, roomID, status);
    }

    public int getNumJacuzzi() {
        return numJacuzzi;
    }

    @Override
    public void descripcion() {
        System.out.println("Cuarto grande con una cama matrimonial, dos camas pequeñas, y un jacuzzi.");
    }

    @Override
    public void funcionalidad() {
        System.out.println("Acá ya se pueden hacer fiestas.");
    }
}
