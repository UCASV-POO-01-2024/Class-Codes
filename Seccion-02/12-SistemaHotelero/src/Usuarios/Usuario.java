package Usuarios;

public abstract class Usuario {
    private String nombreCompleto;
    private String usuario;
    private String pwd;

    public Usuario(String nombreCompleto, String usuario, String pwd) {
        this.nombreCompleto = nombreCompleto;
        this.usuario = usuario;
        this.pwd = pwd;
    }

    public abstract String obtenerRol();

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
