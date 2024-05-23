package Habitaciones;

public class FactoryPresidencial implements FactoryHabitaciones{

    public Habitacion crearHabitacion(int numeroHabitacion, double precio) {
        return new HabitacionPresidencial(numeroHabitacion, precio);
    }
}
