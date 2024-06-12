package menufactory.menus;

public class MenuRooms extends Menu {
    @Override
    public void display() {
        System.out.println("¿Qué tipo de Habitación?\n"
                          +"===========================\n"
                          +"1. Single Room\n"
                          +"2. Double Room\n"
                          +"3. Suite\n"
                          +"4. Presidential Suite\n"
                          +"0. Cancelar\n");
    }
}
