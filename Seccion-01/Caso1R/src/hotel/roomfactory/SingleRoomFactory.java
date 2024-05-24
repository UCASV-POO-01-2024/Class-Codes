package hotel.roomfactory;

import hotel.roomfactory.rooms.Room;
import hotel.roomfactory.rooms.SingleRoom;

public class SingleRoomFactory implements RoomFactory {
    @Override
    public Room createRoom(int capacity, String ID) {
        return new SingleRoom(capacity,ID);
    }
}
