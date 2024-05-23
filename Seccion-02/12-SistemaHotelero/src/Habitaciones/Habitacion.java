package Habitaciones;

public abstract class Habitacion {
    private int numeroHabitacion;
    private double precio;

    public abstract String obtenerTipoHabitacion();

    public Habitacion(int numeroHabitacion, double precio) {
        this.numeroHabitacion = numeroHabitacion;
        this.precio = precio;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
