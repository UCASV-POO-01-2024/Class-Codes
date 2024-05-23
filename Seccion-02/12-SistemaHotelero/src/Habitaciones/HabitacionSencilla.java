package Habitaciones;

public class HabitacionSencilla extends Habitacion{
    public HabitacionSencilla(int numeroHabitacion, double precio) {
        super(numeroHabitacion, precio);
    }

    public String obtenerTipoHabitacion() {
        return "sencilla";
    }
}
