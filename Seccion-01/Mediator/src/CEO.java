public class CEO extends Empleado {
    public CEO(Mediator med, String ID, String nombre, String cargo) {
        super(med, ID, nombre, cargo);
    }

    @Override
    public void sendMessage(String msg, String to) {
        getMediator().notify(msg, to, getID());
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println("CEO: Message received ["+msg+" ]");
    }
}
