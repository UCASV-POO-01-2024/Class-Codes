package wrappers;

import hotel.Hotel;
import personas.Client;
import util.InteractionUtilities;

import java.util.Scanner;

public class MenuClientWrapper extends BaseWrapper {

    public MenuClientWrapper(Component wrappee) {
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

            switch(op){
                case 1: //Ver habitaciones
                    Hotel.getInstance().showRooms();
                    break;
                case 2: //Reservar habitación
                    InteractionUtilities.reserveQuery(input);
                    break;
                case 3: //Susbribirse a una habitación
                    break;
                case 4: //Desuscribirse de una habitación
                    break;
                case 5: //Hacer check-in
                    break;
                case 6: //Hacer check-out
                    break;
                case 7: //Ver reservas
                    break;
                case 8: //Eliminar reserva
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }


            switch (op) {
                case 1:
                    Hotel.getInstance().showRooms();
                    break;
                case 2:
                    InteractionUtilities.reserveQuery(input);
                    break;
                case 3:
                    InteractionUtilities.subscribeQuery(input);
                    break;
                case 4:
                    InteractionUtilities.unsubscribeQuery(input);
                    break;
                case 5:
                    Hotel.getInstance().checkRooms("O");
                    break;
                case 6:
                    Hotel.getInstance().checkRooms("F");
                    break;
                case 7:
                    Hotel h = Hotel.getInstance();
                    ((Client) h.getPersona(h.getActiveUser())).mostrarReservas();
                    break;
                case 8:
                    InteractionUtilities.removeReservaQuery(input);
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
