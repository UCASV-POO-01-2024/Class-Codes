package personas;

public class Administrador extends Persona {
    private String username;
    private String password;
    private String IDEmpleado;
    private String cargo;
    private String direccion;
    private String telefono;

    public Administrador(String nombre, String apellido, int edad, String username, String password, String IDEmpleado, String cargo, String direccion, String telefono) {
        super(nombre, apellido, edad);
        this.username = username;
        this.password = password;
        this.IDEmpleado = IDEmpleado;
        this.cargo = cargo;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public String getIDEmpleado() {
        return IDEmpleado;
    }

    public void setIDEmpleado(String IDEmpleado) {
        this.IDEmpleado = IDEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
