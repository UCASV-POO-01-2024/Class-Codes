public class Gerente extends Empleado{
    public Gerente(Mediator med, int ID, String nombre, String cargo) {
        super(med, ID, nombre, cargo);
    }

    @Override
    public void sendMessage(String msg, String to) {
        getMediator().notify(msg, to);
    }

    @Override
    public void receiveMessage(String msg, String from) {
        switch(from){
            case "ceo":
                System.out.println("Entendido, señor.");
                break;
            case "cajero":
                System.out.println("vaya");
                break;
        }
    }
}
