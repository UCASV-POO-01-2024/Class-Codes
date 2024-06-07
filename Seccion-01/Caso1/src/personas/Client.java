package personas;

import hotel.Reserva;
import observer.Subscriber;

import java.util.Iterator;
import java.util.Vector;

public class Client extends Persona implements Subscriber {
    private String username;
    private String password;
    private double income;
    private String creditStatus;
    private int companions;
    private String specialNeeds;
    private String specialRequirements;
    private Vector<Reserva> reservas;

    public Client(String nombre, String apellido, int edad, String username, String password, double income, String creditStatus, int companions, String specialNeeds, String specialRequirements) {
        super(nombre, apellido, edad);
        this.username = username;
        this.password = password;
        this.income = income;
        this.creditStatus = creditStatus;
        this.companions = companions;
        this.specialNeeds = specialNeeds;
        this.specialRequirements = specialRequirements;
        this.reservas = new Vector<Reserva>();
    }

    @Override
    public void update(String msg) {
        //Enviar correo con el mensaje al cliente
        System.out.println("Cliente "+getUsername()+": Mensaje recibido y correo enviado.");
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

    public void addReserva(Reserva r){
        reservas.add(r);
    }

    public Reserva getReserva(String id){
        return reservas.get(findIndex(id));
    }

    public void mostrarReservas(){
        for(Reserva r : reservas){
            System.out.println(r.toString());
        }
    }

    private int findIndex(String id){
        Iterator<Reserva> iter = reservas.iterator();

        int cont = 0;
        while(iter.hasNext()){
            if(iter.next().getRoomID().equals(id)){
                return cont;
            }
            ++cont;
        }

        return -1;
    }

    public void eliminarReserva(String id){
        reservas.remove(findIndex(id));
    }
}
