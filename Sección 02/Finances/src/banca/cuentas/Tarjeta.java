package banca.cuentas;

import personas.Persona;

public class Tarjeta {
    private String numero;
    private String fechaVencimiento;
    private String CVV;
    private Persona propietario;
    private String tipo;
    private String fechaExpedicion;

    public Tarjeta(String numero, String fechaVencimiento, String CVV, Persona propietario, String tipo, String fechaExpedicion) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.CVV = CVV;
        this.propietario = propietario;
        this.tipo = tipo;
        this.fechaExpedicion = fechaExpedicion;
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
}
