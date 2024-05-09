public class CEO extends Empleado {
    public CEO(Mediator med, int ID, String nombre, String cargo) {
        super(med, ID, nombre, cargo);
    }

    @Override
    public void sendMessage(String msg, String to) {
        getMediator().notify(msg, to);
    }

    @Override
    public void receiveMessage(String msg, String from) {
        System.out.println("understood");
    }
}
