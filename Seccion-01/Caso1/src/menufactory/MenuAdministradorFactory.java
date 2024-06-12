package menufactory;

import menufactory.menus.Menu;
import menufactory.menus.MenuAdministrador;

public class MenuAdministradorFactory implements MenuFactory {
    @Override
    public Menu createMenu() {
        return new MenuAdministrador();
    }
}
