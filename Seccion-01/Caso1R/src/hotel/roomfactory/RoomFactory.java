package hotel.roomfactory;

import hotel.roomfactory.rooms.Room;

public interface RoomFactory {
    public Room createRoom(int capacity, String ID);
}
