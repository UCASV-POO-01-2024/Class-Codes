package Usuarios;

public class Cliente extends Usuario{

    public Cliente(String nombreCompleto, String usuario, String pwd) {
        super(nombreCompleto, usuario, pwd);
    }

    public String obtenerRol() {
        return "cliente";
    }
}
