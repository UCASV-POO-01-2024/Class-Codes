package reservacion;

import personas.Client;

public abstract class Handler {
    protected Handler next;
    public void setNext(Handler next){
        this.next = next;
    }

    public abstract boolean handle(Client c);
}
