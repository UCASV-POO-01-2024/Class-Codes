package banca.cuentas;

public class Transaccion {
    private int ID;
    private String tipo;
    private double monto;
    private String fecha;
    private Cuenta destino;
    private Cuenta fuente;
    private String detalle;

    public Transaccion(int ID, String tipo, double monto, String fecha, Cuenta destino, Cuenta fuente, String detalle) {
        this.ID = ID;
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.destino = destino;
        this.fuente = fuente;
        this.detalle = detalle;
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cuenta getDestino() {
        return destino;
    }

    public void setDestino(Cuenta destino) {
        this.destino = destino;
    }

    public Cuenta getFuente() {
        return fuente;
    }

    public void setFuente(Cuenta fuente) {
        this.fuente = fuente;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
