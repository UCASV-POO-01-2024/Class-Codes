package personas;

public class Administrador extends Persona{
    private String username;
    private String password;
    private int ID;
    private String cargo;

    public Administrador(String nombre, int edad, String direccion, String username, String password, int ID, String cargo) {
        super(nombre, edad, direccion);
        this.username = username;
        this.password = password;
        this.ID = ID;
        this.cargo = cargo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
