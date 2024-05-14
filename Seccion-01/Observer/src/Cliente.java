public class Cliente implements Subscriber{
    private String ID;
    private String nombre;
    private String genero;
    private String cuentaBancaria;
    private String direccion;

    public Cliente(String ID, String nombre, String genero, String cuentaBancaria, String direccion) {
        this.ID = ID;
        this.nombre = nombre;
        this.genero = genero;
        this.cuentaBancaria = cuentaBancaria;
        this.direccion = direccion;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void update(String msg) {
        System.out.println("He recibido: "+msg);
        System.out.println("Mañana llego a comprar.");
    }
}
