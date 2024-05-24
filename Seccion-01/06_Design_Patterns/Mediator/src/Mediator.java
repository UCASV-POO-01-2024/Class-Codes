public interface Mediator {
    public void add(Empleado e);

    public void notify(String msg, String to, String from);
}
