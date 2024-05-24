public class Gerente extends Empleado{
    public Gerente(Mediator med, String ID, String nombre, String cargo) {
        super(med, ID, nombre, cargo);
    }

    @Override
    public void sendMessage(String msg, String to) {
        getMediator().notify(msg, to, getID());
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println("Gerente "+getID()+": Message received ["+msg+" ]");
    }
}
