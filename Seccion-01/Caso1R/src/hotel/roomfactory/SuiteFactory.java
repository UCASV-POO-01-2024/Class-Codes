package hotel.roomfactory;

import hotel.roomfactory.rooms.Room;
import hotel.roomfactory.rooms.Suite;

public class SuiteFactory implements RoomFactory {
    @Override
    public Room createRoom(int capacity, String ID) {
        return new Suite(capacity, ID);
    }
}
