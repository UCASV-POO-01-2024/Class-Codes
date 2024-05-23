package Habitaciones;

public class HabitacionPresidencial extends Habitacion{
    public HabitacionPresidencial(int numeroHabitacion, double precio) {
        super(numeroHabitacion, precio);
    }

    public String obtenerTipoHabitacion() {
        return "presidencial";
    }
}
