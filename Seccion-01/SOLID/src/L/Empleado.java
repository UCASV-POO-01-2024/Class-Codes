package L;

public class Empleado extends Persona{
    private String ID;
    private String cargo;
    private double salario;

    public Empleado(String nombre, String apellido, int edad, String direccion, String ID, String cargo, double salario) {
        super(nombre, apellido, edad, direccion);
        this.ID = ID;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void desplazamiento(){
        System.out.println("Para llegar al trabajo uso la 44.");
    }
}
