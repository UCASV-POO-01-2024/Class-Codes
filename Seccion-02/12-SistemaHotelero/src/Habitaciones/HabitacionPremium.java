package Habitaciones;

public class HabitacionPremium extends Habitacion{
    public HabitacionPremium(int numeroHabitacion, double precio) {
        super(numeroHabitacion, precio);
    }

    public String obtenerTipoHabitacion() {
        return "premium";
    }
}
