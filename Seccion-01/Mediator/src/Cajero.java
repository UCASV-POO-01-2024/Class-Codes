public class Cajero extends Empleado {
    public Cajero(Mediator med, int ID, String nombre, String cargo) {
        super(med, ID, nombre, cargo);
    }

    @Override
    public void sendMessage(String msg, String to) {
        getMediator().notify(msg, to, "cajero");
    }

    @Override
    public void receiveMessage(String msg, String from) {
        switch(from){
            case "ceo":
                System.out.println("De inmediato, señor.");
                break;
            case "gerente":
                System.out.println("Está bien.");
                break;
        }
    }
}
