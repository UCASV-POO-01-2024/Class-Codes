package banca.cuentas;

import personas.Persona;

import java.util.Random;

public class Tarjeta {
    private String numero;
    private String fechaVencimiento;
    private String CVV;
    private Persona propietario;
    private String tipo;
    private String fechaExpedicion;
    private double monto;
    private double saldo;

    public Tarjeta(String numero, String fechaVencimiento, String CVV, Persona propietario, String tipo, String fechaExpedicion, double monto) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.CVV = CVV;
        this.propietario = propietario;
        this.tipo = tipo;
        this.fechaExpedicion = fechaExpedicion;
        this.monto = monto;
        saldo = 0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(String fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void pagar(double pago){
        saldo -= pago;
    }

    public static String createCardNumber(){
        Random rand = new Random();
        int part1 = rand.nextInt(8999)+1000;
        int part2 = rand.nextInt(8999)+1000;
        int part3 = rand.nextInt(8999)+1000;
        int part4 = rand.nextInt(8999)+1000;
        return part1+"-"+part2+"-"+part3+"-"+part4;
    }
}
