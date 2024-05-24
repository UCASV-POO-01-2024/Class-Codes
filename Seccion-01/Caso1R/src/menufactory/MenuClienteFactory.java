package menufactory;

import menufactory.menu.Menu;
import menufactory.menu.MenuCliente;

public class MenuClienteFactory implements MenuFactory {
    @Override
    public Menu createMenu() {
        return new MenuCliente();
    }
}
