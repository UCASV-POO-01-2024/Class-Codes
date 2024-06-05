package Reservaciones;

public abstract class Handler {
    protected Handler siguiente;

    public abstract void ejecutar(Reserva reserva);

    public void asignarSiguientePaso(Handler siguiente){
        this.siguiente = siguiente;
    }
}
