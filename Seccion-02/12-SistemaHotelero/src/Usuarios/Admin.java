package Usuarios;

public class Admin extends Usuario{

    public Admin(String nombreCompleto, String usuario, String pwd) {
        super(nombreCompleto, usuario, pwd);
    }

    public String obtenerRol() {
        return "admin";
    }
}
