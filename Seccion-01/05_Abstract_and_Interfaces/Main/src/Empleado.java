public abstract class Empleado {
    private int codigo;

    abstract double calcularSalario();

    abstract String obtenerInfo();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
