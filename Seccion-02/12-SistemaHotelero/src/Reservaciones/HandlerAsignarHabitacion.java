package Reservaciones;

import Habitaciones.Hotel;

import java.util.Scanner;

public class HandlerAsignarHabitacion extends Handler{
    public void ejecutar(Reserva reserva) {
        Scanner sn = new Scanner(System.in);
        String[] habitacion;
        int fila, columna;

        try {
            System.out.println("\nSeleccione una habitacion:");
            Hotel.getInstance().mostrarHabitaciones();
            System.out.print("Habitacion: ");
            habitacion = sn.nextLine().split("-");
            fila = Integer.parseInt(habitacion[0]);
            columna = Integer.parseInt(habitacion[1]);

            Hotel.getInstance().obtenerHabitacion(fila,columna);
        } catch (NumberFormatException e){
            System.out.println("Se ha ingresado un dato invalido");
            ejecutar(reserva);
        } catch (Exception e){
            System.out.println("No se ha especificado una habitacion valida");
            ejecutar(reserva);
        }

        //if(siguiente != null) siguiente.ejecutar(reserva);
    }
}
