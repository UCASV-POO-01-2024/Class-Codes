package menufactory;

import menufactory.menu.Menu;
import menufactory.menu.MenuAdministrador;

public class MenuAdministradorFactory implements MenuFactory {
    @Override
    public Menu createMenu() {
        return new MenuAdministrador();
    }
}
