package menufactory.menus;

public class MenuAdministrador extends Menu {
    @Override
    public void display() {
        System.out.println("Opciones de Administrador\n"
                          +"===========================\n"
                          +"1. Añadir Habitación\n"
                          +"2. Ver Habitaciones\n"
                          +"3. Mover Habitación\n"
                          +"4. Eliminar Habitación\n"
                          +"0. Salir\n");
    }
}
