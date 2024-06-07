package hotel.roomfactory;

import hotel.roomfactory.rooms.Room;
import hotel.roomfactory.rooms.SingleRoom;

public class SingleRoomFactory implements RoomFactory {
    @Override
    public Room createRoom(String id, int n, int cap, double area) {
        return new SingleRoom(id,n,cap,area);
    }
}
