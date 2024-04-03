package personas;

import banca.cuentas.Cuenta;
import java.util.ArrayList;

public class Cliente extends Persona {
    private int ID;
    private String status;
    private String estado;
    private ArrayList<Cuenta> cuentas;

    public Cliente(String DUI, String nombre, String apellido, String fechaNacimiento, String correo, String telefono, String domicilio, int ID, String status, String estado) {
        super(DUI, nombre, apellido, fechaNacimiento, correo, telefono, domicilio);
        this.ID = ID;
        this.status = status;
        this.estado = estado;
        cuentas = new ArrayList<Cuenta>();
    }

    public Cliente(String DUI, String nombre, String apellido, String fechaNacimiento, String correo, String telefono, String domicilio, int ID, String status, String estado, ArrayList<Cuenta> cuentas) {
        super(DUI, nombre, apellido, fechaNacimiento, correo, telefono, domicilio);
        this.ID = ID;
        this.status = status;
        this.estado = estado;
        this.cuentas = cuentas;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public void addCuenta(Cuenta c) {
        cuentas.add(c);
    }

    public Cuenta getCuenta(int pos) {
        return cuentas.get(pos);
    }
}
