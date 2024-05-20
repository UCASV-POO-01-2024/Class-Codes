package L;

public class Gerente extends Empleado{
    private String departamento;
    private int empleadosACargo;
    private int rank;

    public Gerente(String nombre, String apellido, int edad, String direccion, String ID, double salario, String departamento, int empleadosACargo, int rank) {
        super(nombre, apellido, edad, direccion, ID, "gerente", salario);
        this.departamento = departamento;
        this.empleadosACargo = empleadosACargo;
        this.rank = rank;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getEmpleadosACargo() {
        return empleadosACargo;
    }

    public void setEmpleadosACargo(int empleadosACargo) {
        this.empleadosACargo = empleadosACargo;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public Empleado superior(){
        return null;
    }
}
