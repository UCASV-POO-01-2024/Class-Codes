package hotel.roomfactory;

import hotel.roomfactory.rooms.DoubleRoom;
import hotel.roomfactory.rooms.Room;

public class DoubleRoomFactory implements RoomFactory {
    @Override
    public Room createRoom(String id, int n, int cap, double area) {
        return new DoubleRoom(id, n, cap, area);
    }
}
