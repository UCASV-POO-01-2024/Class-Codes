public class Gerente extends Empleado{
    public double calcularSalario(){
        return 3000*12;
    }

    public String obtenerInfo(){
        return "Yo superviso y administro recursos.";
    }
}
