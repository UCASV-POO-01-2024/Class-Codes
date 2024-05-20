public abstract class Empleado {
    private Mediator med;
    private String ID;
    private String nombre;
    private String cargo;

    public Empleado(Mediator med, String ID, String nombre, String cargo) {
        this.med = med;
        this.ID = ID;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public Mediator getMediator() {
        return med;
    }

    public void setMediator(Mediator med) {
        this.med = med;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public abstract void sendMessage(String msg, String to);

    public abstract void receiveMessage(String msg);
}
