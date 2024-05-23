package Habitaciones;

public class FactorySencilla implements FactoryHabitaciones{

    public Habitacion crearHabitacion(int numeroHabitacion, double precio) {
        return new HabitacionSencilla(numeroHabitacion, precio);
    }
}
