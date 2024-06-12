package menufactory;

import menufactory.menus.Menu;
import menufactory.menus.MenuRooms;

public class MenuRoomsFactory implements MenuFactory {
    @Override
    public Menu createMenu() {
        return new MenuRooms();
    }
}
