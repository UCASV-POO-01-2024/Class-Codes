package Habitaciones;

public class FactoryPremium implements FactoryHabitaciones{

    public Habitacion crearHabitacion(int numeroHabitacion, double precio) {
        return new HabitacionPremium(numeroHabitacion, precio);
    }
}
