package menufactory.menu;

public class MenuAdministrador implements Menu {
    @Override
    public void show() {
        System.out.println("Opciones de Administrador\n"
                          +"===========================\n"
                          +"1. Añadir Habitación\n"
                          +"2. Ver Habitaciones\n"
                          +"3. Mover Habitación\n"
                          +"4. Eliminar Habitación\n"
                          +"0. Salir\n");
    }
}
