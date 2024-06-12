package hotel;

import java.time.LocalDate;

public class Reserva {
    private double precio;
    private LocalDate fecha;
    private int dias;
    private String roomID;

    public Reserva(double precio, LocalDate fecha, int dias, String roomID) {
        this.precio = precio;
        this.fecha = fecha;
        this.dias = dias;
        this.roomID = roomID;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    @Override
    public String toString() {
        return "Room: "+roomID+" Fecha: "+fecha+" Dias: "+dias;
    }
}
