package hotel.roomfactory;

import hotel.roomfactory.rooms.PresidentialSuite;
import hotel.roomfactory.rooms.Room;

public class PresidentialSuiteFactory implements RoomFactory {
    @Override
    public Room createRoom(int capacity, String ID) {
        return new PresidentialSuite(capacity, ID);
    }
}
