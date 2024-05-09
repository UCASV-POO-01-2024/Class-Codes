public abstract class Empleado {
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    abstract double calcularSalario();

    abstract String obtenerInfo();
}
