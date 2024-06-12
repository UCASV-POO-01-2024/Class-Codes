package hotel.roomfactory;

import hotel.roomfactory.rooms.PresidentialSuite;
import hotel.roomfactory.rooms.Room;

public class PresidentialSuiteFactory implements RoomFactory {
    @Override
    public Room createRoom(String id, int n, int cap, double area) {
        return new PresidentialSuite(id, n, cap, area);
    }
}
