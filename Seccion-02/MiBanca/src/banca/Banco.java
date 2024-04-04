package banca;

import banca.cuentas.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Banco {
    private int ID;
    private String nombre;
    private ArrayList<Sucursal> sucursales;
    private ArrayList<Cuenta> cuentas;
    private ArrayList<Tarjeta> tarjetas;

    public Banco(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
        sucursales = new ArrayList<Sucursal>();
        cuentas = new ArrayList<Cuenta>();
        tarjetas = new ArrayList<Tarjeta>();
    }

    public Banco(int ID, String nombre, ArrayList<Sucursal> sucursales, ArrayList<Cuenta> cuentas, ArrayList<Tarjeta> tarjetas) {
        this.ID = ID;
        this.nombre = nombre;
        this.sucursales = sucursales;
        this.cuentas = cuentas;
        this.tarjetas = tarjetas;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public ArrayList<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public void addSucursal(Sucursal s) {
        sucursales.add(s);
    }

    public Sucursal getSucursal(int pos) {
        return sucursales.get(pos);
    }

    public void addCuenta(Cuenta c) {
        cuentas.add(c);
    }

    public Cuenta getCuenta(int pos) {
        return cuentas.get(pos);
    }

    public void addTarjeta(Tarjeta t) {
        tarjetas.add(t);
    }

    public Tarjeta getTarjeta(int pos) {
        return tarjetas.get(pos);
    }

    public Tarjeta getTarjeta(String number){
        Iterator<Tarjeta> iter = tarjetas.iterator();
        Tarjeta t = null;
        while(iter.hasNext()){
            t = iter.next();
            if(t.getNumero().equals(number)){
                break;
            }
        }
        return t;
    }
}
