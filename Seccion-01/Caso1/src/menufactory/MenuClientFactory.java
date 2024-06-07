package menufactory;

import menufactory.menus.Menu;
import menufactory.menus.MenuClient;

public class MenuClientFactory implements MenuFactory {
    @Override
    public Menu createMenu() {
        return new MenuClient();
    }
}
