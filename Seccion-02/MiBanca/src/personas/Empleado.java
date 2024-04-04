package personas;

public class Empleado extends Persona {
    private int ID;
    private double salario;
    private String fechaPago;
    private String tipo;

    public Empleado(String DUI, String nombre, String apellido, String fechaNacimiento, String correo, String telefono, String domicilio, int ID, double salario, String fechaPago, String tipo) {
        super(DUI, nombre, apellido, fechaNacimiento, correo, telefono, domicilio);
        this.ID = ID;
        this.salario = salario;
        this.fechaPago = fechaPago;
        this.tipo = tipo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
