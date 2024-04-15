package banca;

import personas.Cliente;
import personas.Empleado;

import java.util.ArrayList;

public class Sucursal {
    private int ID;
    private String direccion;
    private String telefono;
    private Empleado gerente;
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;

    public Sucursal(int ID, String direccion, String telefono, Empleado gerente, ArrayList<Empleado> empleados) {
        this.ID = ID;
        this.direccion = direccion;
        this.telefono = telefono;
        this.gerente = gerente;
        this.empleados = empleados;
        clientes = new ArrayList<Cliente>();
    }

    public Sucursal(int ID, String direccion, String telefono, Empleado gerente, ArrayList<Empleado> empleados, ArrayList<Cliente> clientes) {
        this.ID = ID;
        this.direccion = direccion;
        this.telefono = telefono;
        this.gerente = gerente;
        this.empleados = empleados;
        this.clientes = clientes;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public Empleado getGerente() {
        return gerente;
    }

    public void setGerente(Empleado gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
