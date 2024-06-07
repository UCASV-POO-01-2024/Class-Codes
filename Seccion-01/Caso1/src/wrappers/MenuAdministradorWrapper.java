package wrappers;

import hotel.Hotel;
import menufactory.MenuFactory;
import menufactory.MenuRoomsFactory;
import util.InteractionUtilities;

import java.util.Scanner;

public class MenuAdministradorWrapper extends BaseWrapper {

    public MenuAdministradorWrapper(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void hacer() {
        boolean flag = true;
        Scanner input = new Scanner(System.in);

        do {
            execute();

            System.out.print("Ingrese la opción deseada: ");
            int op = input.nextInt();

            switch (op) {
                case 1: //Añadir habitación
                    MenuFactory mf = new MenuRoomsFactory();
                    BaseWrapper bw = new MenuRoomsWrapper( mf.createMenu() );
                    bw.hacer();
                    break;
                case 2: //Ver habitaciones
                    Hotel.getInstance().showRooms();
                    break;
                case 3: //Mover habitación
                    InteractionUtilities.moveRoomQuery(input);
                    break;
                case 4: //Eliminar habitación
                    InteractionUtilities.removeRoomQuery(input);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (flag);
    }
}
