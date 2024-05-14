public interface Handler {
    public void setNext(Handler next);
    public boolean handle(Persona p);
}
