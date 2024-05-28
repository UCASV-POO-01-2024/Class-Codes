package menufactory.menu;

import wrappers.Component;

public class MenuLogin implements Menu, Component {
    @Override
    public void show() {
        System.out.println("Bienvenido al Hotel Skyloft\n"
                          +"=============================\n"
                          +"1. Login\n"
                          +"0. Salir\n");
    }

    @Override
    public void execute() {
        show();
    }
}
