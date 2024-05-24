package menufactory;

import menufactory.menu.Menu;
import menufactory.menu.MenuLogin;

public class MenuLoginFactory implements MenuFactory {
    @Override
    public Menu createMenu() {
        return new MenuLogin();
    }
}
