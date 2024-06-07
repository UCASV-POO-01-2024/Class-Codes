package Reservaciones;

import Habitaciones.Habitacion;

import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class HandlerCrearReserva extends Handler{

    public void ejecutar(Reserva reserva) {
        Scanner sn = new Scanner(System.in);

        String fechaReserva[];
        int diasDeReserva;

        System.out.println("Ingrese la fecha de entrada (dd-mm-aaaa):");
        fechaReserva = sn.nextLine().split("-");
        System.out.println("Ingrese la cantidad de dias que se hospedara:");
        diasDeReserva = sn.nextInt();

        Calendar miCalendario = new Calendar.Builder()
                .setDate(Integer.parseInt(fechaReserva[2]),
                        Integer.parseInt(fechaReserva[1])-1,
                        Integer.parseInt(fechaReserva[0])
                ).build();

        Calendar fechaSalida = (Calendar) miCalendario.clone();
        fechaSalida.add(Calendar.DAY_OF_MONTH, diasDeReserva);

        System.out.println(
                fechaSalida.get(Calendar.DAY_OF_MONTH)
                        +"-"+(fechaSalida.get(Calendar.MONTH)+1)
                        +"-"+fechaSalida.get(Calendar.YEAR)
        );

        if(siguiente != null) siguiente.ejecutar(reserva);
    }
}
