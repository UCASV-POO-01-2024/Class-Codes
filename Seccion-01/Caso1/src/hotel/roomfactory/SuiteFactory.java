package hotel.roomfactory;

import hotel.roomfactory.rooms.Room;
import hotel.roomfactory.rooms.Suite;

public class SuiteFactory implements RoomFactory{
    @Override
    public Room createRoom(String id, int n, int cap, double area) {
        return new Suite(id, n, cap, area);
    }
}
