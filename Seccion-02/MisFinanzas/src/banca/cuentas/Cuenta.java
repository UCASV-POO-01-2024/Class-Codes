package banca.cuentas;

import personas.Cliente;

import java.util.ArrayList;

public class Cuenta {
    private int ID;
    private String tipo;
    private float saldo;
    private float saldoMinimo;
    private ArrayList<Cliente> clientes;
    private ArrayList<Transaccion> transacciones;

    public Cuenta(int ID, String tipo, float saldo, float saldoMinimo) {
        this.ID = ID;
        this.tipo = tipo;
        this.saldo = saldo;
        this.saldoMinimo = saldoMinimo;
    }

    public Cuenta(int ID, String tipo, float saldo, float saldoMinimo, ArrayList<Cliente> clientes) {
        this.ID = ID;
        this.tipo = tipo;
        this.saldo = saldo;
        this.saldoMinimo = saldoMinimo;
        this.clientes = clientes;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(float saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public void addCliente(Cliente c){
        clientes.add(c);
    }

    public Cliente getCliente(int pos){
        return clientes.get(pos);
    }

    public void addTransaccion(Transaccion t){
        transacciones.add(t);
    }

    public Transaccion getTransaccione(int pos){
        return transacciones.get(pos);
    }
}
