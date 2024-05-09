public class Cajero extends Empleado {
    public double calcularSalario(){
        return 900*12;
    }

    public String obtenerInfo(){
        return "Yo atiendo las operaciones de caja de los clientes.";
    }
}
