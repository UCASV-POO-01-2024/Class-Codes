package Reservaciones;

import Habitaciones.Habitacion;
import Usuarios.Cliente;

import java.util.Date;

public class Reserva {
    private Cliente cliente;
    private Habitacion habitacionReservada;
    private Date fechaReserva;
    private Date fechaSalida;

    public Reserva() {
    }

    public Reserva(Cliente cliente, Habitacion habitacionReservada, Date fechaReserva, Date fechaSalida) {
        this.cliente = cliente;
        this.habitacionReservada = habitacionReservada;
        this.fechaReserva = fechaReserva;
        this.fechaSalida = fechaSalida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) throws Exception{

        if(cliente == null) throw new NullPointerException();
        if(cliente.getNombreCompleto().length() > 50) throw new IndexOutOfBoundsException();

        this.cliente = cliente;
    }

    public Habitacion getHabitacionReservada() {
        return habitacionReservada;
    }

    public void setHabitacionReservada(Habitacion habitacionReservada) {
        this.habitacionReservada = habitacionReservada;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
