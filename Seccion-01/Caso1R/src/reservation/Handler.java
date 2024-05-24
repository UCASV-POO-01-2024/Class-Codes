package reservation;

import personas.Cliente;

public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next){
        this.next = next;
    }
    public abstract boolean handle(Cliente c);
}
