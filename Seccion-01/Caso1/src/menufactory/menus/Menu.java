package menufactory.menus;

import wrappers.Component;

public abstract class Menu implements Component {
    public abstract void display();

    @Override
    public void execute() {
        display();
    }
}
