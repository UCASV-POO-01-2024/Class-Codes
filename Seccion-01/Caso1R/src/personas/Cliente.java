package personas;

import hotel.Reserva;
import observer.Subscriber;

import java.util.Vector;

public class Cliente extends Persona implements Subscriber {
    private String username;
    private String password;
    private double income;
    private String creditStatus;
    private int companions;
    private String specialNeeds;
    private String specialRequirements;
    private Vector<Reserva> reservas;

    public Cliente(String nombre, int edad, String direccion, String username, String password, double income, String creditStatus, int companions, String specialNeeds, String specialRequirements) {
        super(nombre, edad, direccion);
        this.username = username;
        this.password = password;
        this.income = income;
        this.creditStatus = creditStatus;
        this.companions = companions;
        this.specialNeeds = specialNeeds;
        this.specialRequirements = specialRequirements;
        reservas = new Vector<>();
    }

    @Override
    public void update(String msg) {
        //Acá se utiliza el mensaje para enviar un correo al cliente
        System.out.println("Cliente "+username+": He recibido el mensaje \""+msg+"\"");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    public int getCompanions() {
        return companions;
    }

    public void setCompanions(int companions) {
        this.companions = companions;
    }

    public String getSpecialNeeds() {
        return specialNeeds;
    }

    public void setSpecialNeeds(String specialNeeds) {
        this.specialNeeds = specialNeeds;
    }

    public String getSpecialRequirements() {
        return specialRequirements;
    }

    public void setSpecialRequirements(String specialRequirements) {
        this.specialRequirements = specialRequirements;
    }

    public Vector<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Vector<Reserva> reservas) {
        this.reservas = reservas;
    }
}
