public class EmpleadoUCA {
    private String nombres;
    private String apellidos;
    private String fechaNacimiento; //la fecha esta en el formato: DD-MM-AAAA
    private double alturaMs;
    private double pesoLbs;

    public EmpleadoUCA(String nombres, String apellidos, String fechaNacimiento, double alturaMs, double pesoLbs) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.alturaMs = alturaMs;
        this.pesoLbs = pesoLbs;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getAlturaMs() {
        return alturaMs;
    }

    public void setAlturaMs(double alturaMs) {
        this.alturaMs = alturaMs;
    }

    public double getPesoLbs() {
        return pesoLbs;
    }

    public void setPesoLbs(double pesoLbs) {
        this.pesoLbs = pesoLbs;
    }
}
