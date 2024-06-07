package wrappers;

import hotel.Hotel;
import hotel.roomfactory.*;

import java.util.Scanner;

public class MenuRoomsWrapper extends BaseWrapper {

    public MenuRoomsWrapper(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void hacer() {
        boolean flag = true;
        Scanner input = new Scanner(System.in);

        RoomFactory rf;

        do {
            execute();

            System.out.println("¿Qué tipo de habitación?");
            int op = input.nextInt();

            int n = Hotel.getInstance().getTotalRooms();
            switch (op) {
                case 1: //Single Room
                    rf = new SingleRoomFactory();
                    Hotel.getInstance().addRoom( rf.createRoom("S"+ String.valueOf(n),n,3,50) );
                    break;
                case 2: //Double Room
                    rf = new DoubleRoomFactory();
                    Hotel.getInstance().addRoom( rf.createRoom("D"+ String.valueOf(n),n,6,100) );
                    break;
                case 3: //Suite
                    rf = new SuiteFactory();
                    Hotel.getInstance().addRoom( rf.createRoom("U"+ String.valueOf(n),n,10,150) );
                    break;
                case 4: //Presidential Suite
                    rf = new PresidentialSuiteFactory();
                    Hotel.getInstance().addRoom( rf.createRoom("P"+ String.valueOf(n),n,25,250) );
                    break;
                case 0: //Regresar
                    flag = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while(flag);
    }
}
