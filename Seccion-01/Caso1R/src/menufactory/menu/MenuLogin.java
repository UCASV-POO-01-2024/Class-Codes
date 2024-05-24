package menufactory.menu;

public class MenuLogin implements Menu {
    @Override
    public void show() {
        System.out.println("Bienvenido al Hotel Skyloft\n"
                          +"=============================\n"
                          +"1. Login\n"
                          +"0. Salir\n");
    }
}
