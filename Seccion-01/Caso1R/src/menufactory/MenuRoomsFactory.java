package menufactory;

import menufactory.menu.Menu;
import menufactory.menu.MenuRooms;

public class MenuRoomsFactory implements MenuFactory {
    @Override
    public Menu createMenu() {
        return new MenuRooms();
    }
}
