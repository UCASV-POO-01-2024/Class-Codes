package hotel.roomfactory;

import hotel.roomfactory.rooms.Room;

public interface RoomFactory {
    public Room createRoom(String id, int n, int cap, double area);
}
