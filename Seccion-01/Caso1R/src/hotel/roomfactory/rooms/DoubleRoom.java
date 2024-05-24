package hotel.roomfactory.rooms;

public class DoubleRoom extends Room{
    public DoubleRoom(int capacidad, String roomID) {
        super(capacidad, roomID);
    }

    @Override
    public void descripcion() {
        System.out.println("Cuarto mediano con dos camas.");
    }

    @Override
    public void funcionalidad() {
        System.out.println("Cabe más gente, puede ser una familia.");
    }
}
