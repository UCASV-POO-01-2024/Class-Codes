package hotel;

import java.time.LocalDate;

public class Reserva {
    private LocalDate fechaRegistro;
    private LocalDate fechaIngreso;
    private int estanciaDias;
    private String roomID;

    public Reserva(LocalDate fechaRegistro, LocalDate fechaIngreso, int estanciaDias, String roomID) {
        this.fechaRegistro = fechaRegistro;
        this.fechaIngreso = fechaIngreso;
        this.estanciaDias = estanciaDias;
        this.roomID = roomID;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getEstanciaDias() {
        return estanciaDias;
    }

    public void setEstanciaDias(int estanciaDias) {
        this.estanciaDias = estanciaDias;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }
}
