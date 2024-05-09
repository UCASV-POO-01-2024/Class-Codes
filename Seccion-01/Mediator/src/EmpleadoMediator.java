import java.util.ArrayList;

public class EmpleadoMediator implements Mediator{
    private ArrayList<Empleado> empleados;

    public EmpleadoMediator(){
        empleados = new ArrayList<Empleado>();
    }

    @Override
    public void add(Empleado e) {
        empleados.add(e);
    }

    @Override
    public void notify(String msg, String to, String from) {
        if(from.equals("cajero")){
            if(to.equals("gerente")){
                System.out.println("Ejecutando protocolo de comunicacion #4 (Cajero->Gerente)");
                empleados.get(3).receiveMessage(msg,from);
            }
        }
    }
}
