package hotel.roomfactory;

import hotel.roomfactory.rooms.DoubleRoom;
import hotel.roomfactory.rooms.Room;

public class DoubleRoomFactory implements RoomFactory {
    @Override
    public Room createRoom(int capacity, String ID) {
        return new DoubleRoom(capacity, ID);
    }
}
