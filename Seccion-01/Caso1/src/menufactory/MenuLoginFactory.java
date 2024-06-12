package menufactory;

import menufactory.menus.Menu;
import menufactory.menus.MenuLogin;

public class MenuLoginFactory implements MenuFactory {
    @Override
    public Menu createMenu() {
        return new MenuLogin();
    }
}
