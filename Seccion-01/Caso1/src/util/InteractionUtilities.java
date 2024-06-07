package util;

import hotel.Hotel;
import hotel.Reserva;
import personas.Client;
import personas.Persona;
import reservacion.*;

import java.time.LocalDate;
import java.util.Scanner;

public class InteractionUtilities {
    public static Persona authenticate(Scanner sc) {
        System.out.println("Ingrese su usuario: ");
        String usuario = sc.next();
        System.out.println("Ingrese su contraseña: ");
        String contrasena = sc.next();

        return Hotel.getInstance().getPersona(usuario,contrasena);
    }

    public static void moveRoomQuery(Scanner sc) {
        System.out.println("¿Qué habitación desea mover?");
        String ID = sc.next();
        System.out.println("¿En qué fila?");
        int row = sc.nextInt();
        System.out.println("¿En qué columna?");
        int col = sc.nextInt();
        Hotel.getInstance().moveRoom(ID,row-1,col-1);
    }

    public static void removeRoomQuery(Scanner sc) {
        System.out.println("¿Qué habitación desea eliminar?");
        String ID = sc.next();
        Hotel.getInstance().removeRoom(ID);
    }

    public static void reserveQuery(Scanner sc) {
        System.out.println("¿Qué habitación desea reservar?");
        String ID = sc.next();
        if(Hotel.getInstance().getRoomByID(ID).getStatus().equals("F")){
            Client c = (Client) Hotel.getInstance().getPersona( Hotel.getInstance().getActiveUser() );
            Handler chain = makeChain(new IncomeHandler(), new StatusHandler(), new TimeHandler(), new GuestsHandler(), new SpecialNeedsHandler(), new SpecialRequirementsHandler());
            if(chain.handle(c)){
                
            }else{
                System.out.println("La habitación no está libre.");
            }
        }else{
            System.out.println("La habitación no está libre.");
        }





        if(Hotel.getInstance().getRoomByID(ID).getStatus().equals("F")) {
            Client c = (Client) Hotel.getInstance().getPersona(Hotel.getInstance().getActiveUser());
            Handler chain = makeChain(new IncomeHandler(), new StatusHandler(), new TimeHandler(), new GuestsHandler(), new SpecialNeedsHandler(), new SpecialRequirementsHandler());
            if(chain.handle(c)){
                c.addReserva(new Reserva(2500, LocalDate.now(),10,ID));
                Hotel.getInstance().getRoomByID(ID).setStatus("R");
            }else{
                System.out.println("No fue posible realizar la reserva.");
            }
        }
    }

    private static Handler makeChain(Handler first, Handler... rest){
        Handler aux = first;
        for(Handler next: rest){
            aux.setNext(next);
            aux = next;
        }

        return first;
    }

    public static void subscribeQuery(Scanner sc) {
        System.out.println("¿A qué habitación se desea suscribir?");
        String ID = sc.next();
        Hotel h = Hotel.getInstance();
        h.getRoomByID(ID).subscribe((Client) h.getPersona(h.getActiveUser()));
    }

    public static void unsubscribeQuery(Scanner sc) {
        System.out.println("¿De qué habitación se desea desuscribir?");
        String ID = sc.next();
        Hotel h = Hotel.getInstance();
        h.getRoomByID(ID).unsubscribe((Client) h.getPersona(h.getActiveUser()));
    }

    public static void removeReservaQuery(Scanner sc) {
        System.out.println("¿De qué habitación desea eliminar su reserva?");
        String ID = sc.next();
        Hotel.getInstance().getRoomByID(ID).setStatus("F");
        Hotel h = Hotel.getInstance();
        ((Client) h.getPersona(h.getActiveUser())).eliminarReserva(ID);
    }
}
