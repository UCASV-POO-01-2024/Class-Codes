public class Gerente extends Empleado {
    public double calcularSalario(){
        return 3000*12;
    }

    public String obtenerInfo(){
        return "Yo soy el gerente de la sucursal.";
    }
}
