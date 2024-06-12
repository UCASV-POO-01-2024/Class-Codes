package menufactory.menus;

public class MenuLogin extends Menu {
    @Override
    public void display() {
        System.out.println("Bienvenido al sistema de administración del Hotel Skyloft\n"
                          +"===========================================================\n"
                          +"1. Login\n"
                          +"0. Salir\n");
    }
}
