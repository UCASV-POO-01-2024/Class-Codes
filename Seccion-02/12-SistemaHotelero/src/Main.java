import Habitaciones.Hotel;
import Reservaciones.*;
import Usuarios.*;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public static void main(String[] args) {
        usuarios.add(new Admin("Mario Lopez", "mlopez", "1234"));
        usuarios.add(new Cliente("Juan Perez", "jperez", "9876"));

        //Hotel ucaInn = new Hotel(4, 3);
        Hotel.getInstance().setHotelLayout(4,3);

        int[] coordenadas = new int[2];
        coordenadas[0] = 5;
        coordenadas[1] = 5;
        Hotel.getInstance().agregarHabitacion("sencilla", 1, 20.00, coordenadas);
        //ucaInn.mostrarHabitaciones();
        //System.out.println("\n-------------------\n");
        coordenadas[0] = 4;
        coordenadas[1] = 0;
        Hotel.getInstance().agregarHabitacion("presidencial", 2, 2000.00, coordenadas);
        //ucaInn.mostrarHabitaciones();
        //System.out.println("\n-------------------\n");
        //ucaInn.eliminarHabitacion(4,0, false);
        //Hotel.getInstance().mostrarHabitaciones();

        Handler crearReserva = new HandlerCrearReserva();
        Handler seleccionarHabitacion = new HandlerAsignarHabitacion();
        /*crearReserva.asignarSiguientePaso(seleccionarHabitacion);

        Reserva reserva = new Reserva();
        crearReserva.ejecutar(reserva);*/
        seleccionarHabitacion.asignarSiguientePaso(crearReserva);

        Reserva reserva = new Reserva();
        seleccionarHabitacion.ejecutar(reserva);
    }
}